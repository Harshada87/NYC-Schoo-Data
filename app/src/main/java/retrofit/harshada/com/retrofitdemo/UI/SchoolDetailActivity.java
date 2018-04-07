package retrofit.harshada.com.retrofitdemo.UI;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.harshada.com.retrofitdemo.Data.SchoolDetailRepo;
import retrofit.harshada.com.retrofitdemo.Interface.SchoolDetailClient;
import retrofit.harshada.com.retrofitdemo.R;
import retrofit.harshada.com.retrofitdemo.adapter.SchoolDetailAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SchoolDetailActivity extends Activity {
    private String url = "https://data.cityofnewyork.us/";
    private RecyclerView rv;
    private SchoolDetailAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
initView();
    }

    private void initView() {
        rv = findViewById(R.id.card_recycleView);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        SchoolDetailClient client = retrofit.create(SchoolDetailClient.class);

       Call<List<SchoolDetailRepo>> call = client.reposForUser("734v-jeq5.json");




        call.enqueue(new Callback<List<SchoolDetailRepo>>() {
            @Override
            public void onResponse(Call<List<SchoolDetailRepo>> call, Response<List<SchoolDetailRepo>> response) {
                List<SchoolDetailRepo> repos = response.body();
                adapter = new SchoolDetailAdapter((ArrayList<SchoolDetailRepo>) repos);
                rv.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<SchoolDetailRepo>> call, Throwable t) {
                Toast.makeText(SchoolDetailActivity.this, "Error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
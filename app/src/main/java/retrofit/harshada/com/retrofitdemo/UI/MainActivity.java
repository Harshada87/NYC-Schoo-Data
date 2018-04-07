package retrofit.harshada.com.retrofitdemo.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.harshada.com.retrofitdemo.Data.SchoolListRepo;
import retrofit.harshada.com.retrofitdemo.Interface.NYCDataClient;
import retrofit.harshada.com.retrofitdemo.R;
import retrofit.harshada.com.retrofitdemo.adapter.DataAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* This activity shows complete list of NYC High school  **/

public class MainActivity extends AppCompatActivity  {
    private ListView listView;
    private String url = "https://data.cityofnewyork.us/";
    private RecyclerView rv;
    private DataAdapter adapter;
    private List<SchoolListRepo> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.card_recycleView);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        /* Creating Retrofit client**/
        NYCDataClient client = retrofit.create(NYCDataClient.class);
        /*Enque call request for retrofit**/
        Call<List<SchoolListRepo>> call = client.reposForUser("97mf-9njv.json");
        call.enqueue(new Callback<List<SchoolListRepo>>() {
            @Override
            public void onResponse(Call<List<SchoolListRepo>> call, Response<List<SchoolListRepo>> response) {
                List<SchoolListRepo> repos = response.body();
               /* Seetting Custom adapter with NYC school list*/
                adapter = new DataAdapter((ArrayList<SchoolListRepo>) repos);
                rv.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<List<SchoolListRepo>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error :(", Toast.LENGTH_SHORT).show();
            }
        });


    }

}

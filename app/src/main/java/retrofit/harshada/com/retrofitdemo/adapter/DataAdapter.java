package retrofit.harshada.com.retrofitdemo.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit.harshada.com.retrofitdemo.Data.SchoolListRepo;
import retrofit.harshada.com.retrofitdemo.R;
import retrofit.harshada.com.retrofitdemo.UI.SchoolDetailActivity;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<SchoolListRepo> android;
    private RecyclerView recyclerView;

    public DataAdapter(ArrayList<SchoolListRepo> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText(android.get(i).getSchoolName());
        viewHolder.tv_version.setText("DBN : " + android.get(i).getDbn());
        viewHolder.tv_api_level.setText("Address : " + android.get(i).getLocation());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_version, tv_api_level;

        public ViewHolder(final View view) {
            super(view);

            tv_name = view.findViewById(R.id.school_bdn);
            tv_version = view.findViewById(R.id.schoolName);
            tv_api_level = view.findViewById(R.id.schoolLocation);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), SchoolDetailActivity.class);
                    i.putExtra("bdn", tv_name.getText().toString());
                    v.getContext().startActivity(i);
                    Log.d("Click", tv_name.getText().toString());
                }
            });
        }
    }
}

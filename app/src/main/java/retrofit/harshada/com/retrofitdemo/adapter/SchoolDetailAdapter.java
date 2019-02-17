package retrofit.harshada.com.retrofitdemo.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit.harshada.com.retrofitdemo.Data.SchoolDetailRepo;
import retrofit.harshada.com.retrofitdemo.R;
import retrofit.harshada.com.retrofitdemo.UI.SchoolSatActivity;

/*Custom adapter for NYC High school SAT detail */
public class SchoolDetailAdapter extends RecyclerView.Adapter<SchoolDetailAdapter.ViewHolder> {
    private ArrayList<SchoolDetailRepo> android;

    public SchoolDetailAdapter(ArrayList<SchoolDetailRepo> android) {
        this.android = android;
    }

    @Override
    public SchoolDetailAdapter.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_pagination, viewGroup, false);
        return new ViewHolder(view);
    }

    /*Setting values */
    @Override
    public void onBindViewHolder(SchoolDetailAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_name.setText(android.get(i).getSchoolName());
        viewHolder.tv_math.setText("SAT Math Avg :" + android.get(i).getMathAvg());
        viewHolder.tv_total.setText("SAT Total Test Takers :" + android.get(i).getTotalSatTestTakers());
        viewHolder.tv_read.setText("SAT Reading Avg :" + android.get(i).getReadingAvg());
        viewHolder.tv_write.setText("SAt Writing Avg :" + android.get(i).getWritingAvg());
    }

    @Override
    public int getItemCount() {
        return (android == null) ? 0 : android.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_math, tv_total, tv_read, tv_write;

        public ViewHolder(final View view) {
            super(view);

            tv_name = view.findViewById(R.id.tvSName);
            tv_math = view.findViewById(R.id.tvsMathAvg);
            tv_total = view.findViewById(R.id.tvStotal);
            tv_read = view.findViewById(R.id.tvSreadAvg);
            tv_write = view.findViewById(R.id.tvSwriteAvg);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), SchoolSatActivity.class);
                    i.putExtra("sName", tv_name.getText().toString());
                    i.putExtra("sTotal", tv_total.getText().toString());
                    i.putExtra("sMath", tv_math.getText().toString());
                    i.putExtra("sRead", tv_read.getText().toString());
                    i.putExtra("sWrite", tv_write.getText().toString());
                    v.getContext().startActivity(i);
                    Log.d("Click", tv_name.getText().toString());
                }
            });
        }
    }
}

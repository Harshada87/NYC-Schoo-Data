package retrofit.harshada.com.retrofitdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import retrofit.harshada.com.retrofitdemo.R;
import retrofit.harshada.com.retrofitdemo.Data.SchoolListRepo;


public class SchoolListAdapter extends ArrayAdapter<SchoolListRepo> {

    private Context context;
    private List<SchoolListRepo> values;

    public SchoolListAdapter(Context context, List<SchoolListRepo> values) {
        super(context, R.layout.list_item_pagination, values);

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_pagination, parent, false);
        }

      /*  TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

        SchoolListRepo item = values.get(position);
        String message = item.getSchoolName();
        textView.setText(message);
*/
        return row;
    }

}

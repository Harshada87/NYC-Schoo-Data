package retrofit.harshada.com.retrofitdemo.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import retrofit.harshada.com.retrofitdemo.R;
public class SchoolSatActivity extends Activity {
Intent intent;
String sName, sTotal, sReading_avg, sWriting_avg, sMath_avg;
private TextView tv_name,tv_readAvg,tv_sTotal, tv_wrightAvg, tv_mathAvg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detial_view);
        intent = getIntent();
        if(intent!=null)
        {
sName = intent.getStringExtra("sName");
sTotal = intent.getStringExtra("sTotal");
sMath_avg = intent.getStringExtra("sMath");
sReading_avg = intent.getStringExtra("sRead");
sWriting_avg = intent.getStringExtra("sWrite");
        }
        init();
    }
    private void init() {
        tv_name = findViewById(R.id.tvSName);
        tv_sTotal = findViewById(R.id.tvStotal);
        tv_readAvg = findViewById(R.id.tvSreadAvg);
        tv_wrightAvg = findViewById(R.id.tvSwriteAvg);
        tv_mathAvg = findViewById(R.id.tvsMathAvg);
        tv_name.setText(sName);
        tv_sTotal.setText(sTotal);
        tv_readAvg.setText(sReading_avg);
        tv_wrightAvg.setText(sWriting_avg);
        tv_mathAvg.setText(sMath_avg);
    }
}
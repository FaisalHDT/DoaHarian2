package com.faisalhdtbsm.doaharian;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DoaMakan extends AppCompatActivity {

    Button bagikan;
    TextView Makan;
    TextView artiMakan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_makan);
        bagikan=(Button) findViewById(R.id.share);
        Makan=(TextView) findViewById(R.id.makan);
        artiMakan=(TextView) findViewById(R.id.arti_makan);


        bagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent makan = new Intent(android.content.Intent.ACTION_SEND);

                makan.setAction(Intent.ACTION_SEND);
                makan.putExtra(Intent.EXTRA_TEXT,""+Makan+artiMakan);
                makan.setType("text/plain");
                startActivity(makan);
            }
        });


    }
}

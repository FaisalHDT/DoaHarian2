package com.faisalhdtbsm.doaharian;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DoaMakan extends AppCompatActivity {

    Button bagikan;
    TextView makan;
    TextView artimakan;
    String Makan;
    String artiMakan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_makan);
        bagikan=(Button) findViewById(R.id.share);
        makan=(TextView) findViewById(R.id.makan);
        artimakan=(TextView) findViewById(R.id.arti_makan);
        Makan=makan.getText().toString();
        artiMakan=artimakan.getText().toString();



        bagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makan=new Intent();


                makan.setAction(Intent.ACTION_SEND);
                makan.putExtra(Intent.EXTRA_TEXT,""+Makan+artiMakan);
                makan.setType("text/plain");
                startActivity(Intent.createChooser(makan,"mau di kirim kemana ?"));
            }
        });


    }
}

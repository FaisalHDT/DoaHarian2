package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetelahMakan extends AppCompatActivity {

    TextView sudahmakan;
    TextView artisudahmakan;
    String setMakan;
    String artiset_makan;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setelah_makan);

        sudahmakan=(TextView) findViewById(R.id.setmakan);
        artisudahmakan=(TextView) findViewById(R.id.arti_makan);
        setMakan=sudahmakan.getText().toString();
        artiset_makan=artisudahmakan.getText().toString();
        share=(Button) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bagikan=new Intent();

                bagikan.setAction(Intent.ACTION_SEND);
                bagikan.putExtra(Intent.EXTRA_TEXT,""+setMakan+artiset_makan);
                bagikan.setType("text/plain");
              startActivity(Intent.createChooser(bagikan,"mau di kirim kemana ?"));
            }
        });


    }
}

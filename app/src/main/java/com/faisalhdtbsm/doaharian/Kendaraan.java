package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kendaraan extends AppCompatActivity {
    TextView lafaz;
    TextView arti;
    String kendaraan;
    String artikendaraan;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendaraan);

        lafaz = (TextView) findViewById(R.id.kendaraan);
        arti = (TextView) findViewById(R.id.arti_kendaraan);
        kendaraan=lafaz.getText().toString();
        artikendaraan=arti.getText().toString();
        share=(Button) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bagikan=new Intent();

                bagikan.setAction(Intent.ACTION_SEND);
                bagikan.putExtra(Intent.EXTRA_TEXT,""+kendaraan+artikendaraan);
                bagikan.setType("text/plain");
                startActivity(Intent.createChooser(bagikan,"mau dikirm kemana ?"));
            }
        });
    }
}

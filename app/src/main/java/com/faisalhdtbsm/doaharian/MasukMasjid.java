package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MasukMasjid extends AppCompatActivity {

    TextView lafaz;
    TextView arti;
    String masukmasjid;
    String artimasjid;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk_masjid);

        lafaz = (TextView) findViewById(R.id.masukmasjid);
        arti = (TextView) findViewById(R.id.arti_masukmasjid);
        masukmasjid=lafaz.getText().toString();
        artimasjid=arti.getText().toString();
        share=(Button) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bagikan=new Intent();

                bagikan.setAction(Intent.ACTION_SEND);
                bagikan.putExtra(Intent.EXTRA_TEXT,""+masukmasjid+artimasjid);
                bagikan.setType("text/plain");
                startActivity(Intent.createChooser(bagikan,"mau dikirm kemana ?"));
            }
        });
    }
}

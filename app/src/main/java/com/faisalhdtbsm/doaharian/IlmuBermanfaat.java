package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IlmuBermanfaat extends AppCompatActivity {
    TextView lafaz;
    TextView arti;
    String ilmubermanfaat;
    String artiilmu;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilmu_bermanfaat);

        lafaz = (TextView) findViewById(R.id.ilmubermanfaat);
        arti = (TextView) findViewById(R.id.arti_ilmubermanfaat);
        ilmubermanfaat=lafaz.getText().toString();
        artiilmu=arti.getText().toString();
        share=(Button) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bagikan=new Intent();

                bagikan.setAction(Intent.ACTION_SEND);
                bagikan.putExtra(Intent.EXTRA_TEXT,""+ilmubermanfaat+artiilmu);
                bagikan.setType("text/plain");
                startActivity(Intent.createChooser(bagikan,"mau dikirm kemana ?"));
            }
        });
    }
}

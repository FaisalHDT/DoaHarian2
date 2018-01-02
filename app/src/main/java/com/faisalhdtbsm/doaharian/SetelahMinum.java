package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetelahMinum extends AppCompatActivity {

    Button bagikan;
    TextView lafaz;
    TextView arti;
    String Minum;
    String artiMinum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setelah_minum);

        bagikan=(Button) findViewById(R.id.share);
        lafaz=(TextView) findViewById(R.id.setminum);
        arti=(TextView) findViewById(R.id.arti_setminum);
        Minum=lafaz.getText().toString();
        artiMinum=arti.getText().toString();

        bagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bagikan=new Intent();


                bagikan.setAction(Intent.ACTION_SEND);
                bagikan.putExtra(Intent.EXTRA_TEXT,""+Minum+artiMinum);
                bagikan.setType("text/plain");
                startActivity(Intent.createChooser(bagikan,"mau di kirim kemana ?"));
            }
        });
    }
}

package com.faisalhdtbsm.doaharian;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    TextView email;
    TextView fb;
    String email1;
    String facebook;

    @SuppressLint({"CutPasteId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        email = (TextView) findViewById(R.id.email);
        email1 = email.getText().toString();
        fb=(TextView) findViewById(R.id.facebook);
        facebook=fb.getText().toString();


        TextView tvLinkify = (TextView) findViewById(R.id.email);
        TextView tvlink2 = (TextView) findViewById(R.id.facebook);
        tvLinkify.setText("" + email1);
        tvlink2.setText(""+facebook);



        Linkify.addLinks(tvLinkify, Linkify.ALL);
        Linkify.addLinks(tvlink2, Linkify.ALL);

    }
}

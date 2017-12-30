package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button makan,setmakan,setminum,sebtidur,buruk,baik,banguntidur,masuktoilet,istinja,keluartoilet,pagi,sore,bercermin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makan=(Button) findViewById(R.id.makan);
        setmakan=(Button) findViewById(R.id.setmakan);
        setminum=(Button) findViewById(R.id.setminum);
        sebtidur=(Button) findViewById(R.id.sebtidur);
        buruk=(Button) findViewById(R.id.mimpiburuk);
        baik=(Button) findViewById(R.id.mimpibaik);
        banguntidur=(Button) findViewById(R.id.banguntidur);
        masuktoilet=(Button) findViewById(R.id.toilet);
        istinja=(Button) findViewById(R.id.istinja);
        keluartoilet=(Button) findViewById(R.id.keltoilet);
        pagi=(Button) findViewById(R.id.pagihari);
        sore=(Button) findViewById(R.id.sorehari);
        bercermin=(Button) findViewById(R.id.bercermin);

        makan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent makan=new Intent(MainActivity.this,DoaMakan.class);
                startActivity(makan);
            }
        });
        setmakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setmakan=new Intent(MainActivity.this,SetelahMakan.class);
                startActivity(setmakan);
            }
        });
        setminum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setminum=new Intent(MainActivity.this,SetelahMinum.class);
                startActivity(setminum);
            }
        });

        sebtidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sebtidur=new Intent(MainActivity.this,SebelumTidur.class);
                startActivity(sebtidur);
            }
        });
        buruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mimpiburuk=new Intent(MainActivity.this,Mimpi_Buruk.class);
                startActivity(mimpiburuk);
            }
        });
        baik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mimpibaik=new Intent(MainActivity.this,MimpiBaik.class);
                startActivity(mimpibaik);
            }
        });
        banguntidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banguntidur=new Intent(MainActivity.this,BangunTidur.class);
                startActivity(banguntidur);
            }
        });
        masuktoilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masuktoilet=new Intent(MainActivity.this,KamarMandi.class);
                startActivity(masuktoilet);
            }
        });
        istinja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent istinja=new Intent(MainActivity.this,Istinja.class);
                startActivity(istinja);
            }
        });

        keluartoilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keltoielt=new Intent(MainActivity.this,KeluarToilet.class);
                startActivity(keltoielt);
            }
        });
        pagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagihari=new Intent(MainActivity.this,PagiHari.class);
                startActivity(pagihari);
            }
        });
        sore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sorehari=new Intent(MainActivity.this,SoreHari.class);
                startActivity(sorehari);
            }
        });
        bercermin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bercermin=new Intent(MainActivity.this,Bercermin.class);
                startActivity(bercermin);
            }
        });
    }
}

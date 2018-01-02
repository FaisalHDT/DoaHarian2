package com.faisalhdtbsm.doaharian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button makan,setmakan,setminum,sebtidur,buruk,baik,banguntidur,masuktoilet,istinja,keluartoilet,pagi,sore,bercermin,masukrumah,kelrumah,
    berpakaian,pakaianbaru,lepaspakaian,ilmu,sebelajar,sesbelajar,bepergian,kendaraan,kapal,sampaitujuan,masukmasjid,wudhu,info;

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
        masukrumah=(Button) findViewById(R.id.masukrumah);
        kelrumah=(Button) findViewById(R.id.keluarrumah);
        berpakaian=(Button) findViewById(R.id.berpakaian);
        pakaianbaru=(Button) findViewById(R.id.pakaianbaru);
        lepaspakaian=(Button) findViewById(R.id.lepaspakaian);
        ilmu=(Button) findViewById(R.id.ilmubermanfaat);
        sebelajar=(Button) findViewById(R.id.sebelumbelajar);
        sesbelajar=(Button) findViewById(R.id.sesudahbelajar);
        bepergian=(Button) findViewById(R.id.bepergian);
        kendaraan=(Button) findViewById(R.id.kendaraan);
        kapal=(Button) findViewById(R.id.kapal);
        sampaitujuan=(Button) findViewById(R.id.sampaitujuan);
        masukmasjid=(Button) findViewById(R.id.masukmasjid);
        wudhu=(Button) findViewById(R.id.wudhu);
        info=(Button) findViewById(R.id.info);

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
        masukrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukrumah=new Intent(MainActivity.this,MasukRumah.class);
                startActivity(masukrumah);
            }
        });
        kelrumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kelrumah=new Intent(MainActivity.this,KeluarRUmah.class);
                startActivity(kelrumah);
            }
        });
        berpakaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berpakaian=new Intent(MainActivity.this,Berpakaian.class);
                startActivity(berpakaian);
            }
        });
        pakaianbaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pakaianbaru=new Intent(MainActivity.this,PakaianBaru.class);
                startActivity(pakaianbaru);
            }
        });
        lepaspakaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lepaspakaian=new Intent(MainActivity.this,LepasPakaian.class);
                startActivity(lepaspakaian);
            }
        });
        ilmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilmubermanfaat=new Intent(MainActivity.this,IlmuBermanfaat.class);
                startActivity(ilmubermanfaat);
            }
        });
        sebelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sebelajar=new Intent(MainActivity.this,SebelumBelajar.class);
                startActivity(sebelajar);
            }
        });
        sesbelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sesbelajar=new Intent(MainActivity.this,SetelahBelajar.class);
                startActivity(sesbelajar);
            }
        });
        bepergian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bepergian=new Intent(MainActivity.this,Bepergian.class);
                startActivity(bepergian);
            }
        });
        kendaraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kendaraan=new Intent(MainActivity.this,Kendaraan.class);
                startActivity(kendaraan);
            }
        });
        kapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kapal=new Intent(MainActivity.this,NaikKapal.class);
                startActivity(kapal);
            }
        });
        sampaitujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sampaitujuan=new Intent(MainActivity.this,SampaiTujuan.class);
                startActivity(sampaitujuan);
            }
        });
        masukmasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukmasjid=new Intent(MainActivity.this,MasukMasjid.class);
                startActivity(masukmasjid);
            }
        });
        wudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wudhu=new Intent(MainActivity.this,Wudhu.class);
                startActivity(wudhu);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info=new Intent(MainActivity.this,Info.class);
                startActivity(info);
            }
        });
    }
}

package com.example.a1711501526_aplikasimatematika_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panjang(View view){
        final AlertDialog.Builder panjangalert = new AlertDialog.Builder(MainActivity.this);
        panjangalert.setMessage("Apakah anda yakin ingin menghitung luas persegi panjang");
        panjangalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, PersegiPanjangActivity.class));
            }

        });
        panjangalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        panjangalert.show();
    }

    public void bujur(View view){
        final AlertDialog.Builder bujuralert = new AlertDialog.Builder(MainActivity.this);
        bujuralert.setMessage("Apakah anda yakin ingin menghitung luas bujur sangkar");
        bujuralert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, BujurSangkarActivity.class));
            }

        });
        bujuralert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        bujuralert.show();
    }

    public void segitiga(View view){
        final AlertDialog.Builder segitigaalert = new AlertDialog.Builder(MainActivity.this);
        segitigaalert.setMessage("Apakah anda yakin ingin menghitung luas segitiga");
        segitigaalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, SegitigaActivity.class));
            }

        });
        segitigaalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        segitigaalert.show();
    }
    public void lingkaran(View view){
        final AlertDialog.Builder lingkaranalert = new AlertDialog.Builder(MainActivity.this);
        lingkaranalert.setMessage("Apakah anda yakin ingin menghitung luas lingkaran");
        lingkaranalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, LingkaranActivity.class));
            }

        });
        lingkaranalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        lingkaranalert.show();
    }
    public void ketupat(View view){
        final AlertDialog.Builder ketupatalert = new AlertDialog.Builder(MainActivity.this);
        ketupatalert.setMessage("Apakah anda yakin ingin menghitung luas ketupat");
        ketupatalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, KetupatActivity.class));
            }

        });
        ketupatalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ketupatalert.show();
    }

    public void jajargenjang(View view){
        final AlertDialog.Builder jajargenjangalert = new AlertDialog.Builder(MainActivity.this);
        jajargenjangalert.setMessage("Apakah anda yakin ingin menghitung luas jajargenjang");
        jajargenjangalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, JajargenjangActivity.class));
            }

        });
        jajargenjangalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        jajargenjangalert.show();
    }


    public void onBackPressed(){
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah anda yakin ingin keluar dari aplikasi ini?");
        tombolkeluar.setIcon(R.drawable.logo);
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        tombolkeluar.show();
    }
}

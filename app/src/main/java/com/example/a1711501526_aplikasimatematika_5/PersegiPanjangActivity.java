package com.example.a1711501526_aplikasimatematika_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {

    EditText panjang,lebar;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view){
        String inputpanjang = panjang.getText().toString();
        String inputlebar = lebar.getText().toString();

        if(TextUtils.isEmpty(inputpanjang)){
            panjang.setError("Panjang harus di isi");;
            panjang.requestFocus();
        }else if(TextUtils.isEmpty(inputlebar)){
            lebar.setError("Lebar harus di isi");;
            lebar.requestFocus();
        }else{
            Double nilaipanjang = Double.parseDouble((inputpanjang));
            Double nilailebar = Double.parseDouble((inputlebar));
            Double hasilhitung = nilaipanjang * nilailebar;
            hasil.setText(hasilhitung.toString());
        }
    }
}

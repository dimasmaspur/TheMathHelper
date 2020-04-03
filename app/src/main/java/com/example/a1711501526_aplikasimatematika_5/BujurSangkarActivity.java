package com.example.a1711501526_aplikasimatematika_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BujurSangkarActivity extends AppCompatActivity {
    EditText sisi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);
        sisi = findViewById(R.id.sisi);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view){
        String inputsisi = sisi.getText().toString();

        if(TextUtils.isEmpty(inputsisi)){
            sisi.setError("Sisi harus di isi");;
            sisi.requestFocus();
        }
        else{
            Double nilaisisi = Double.parseDouble((inputsisi));
            Double hasilhitung = nilaisisi * nilaisisi;
            hasil.setText(hasilhitung.toString());
        }
    }
}

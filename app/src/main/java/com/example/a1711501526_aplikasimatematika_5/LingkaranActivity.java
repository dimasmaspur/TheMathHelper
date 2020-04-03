package com.example.a1711501526_aplikasimatematika_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {
    EditText diameter;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        diameter = findViewById(R.id.diameter);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view){
        String inputdiameter = diameter.getText().toString();

        if(TextUtils.isEmpty(inputdiameter)){
            diameter.setError("diameter harus di isi");;
            diameter.requestFocus();
        }else{
            Double nilaidiameter = Double.parseDouble((inputdiameter));
            Double nilaijarijari = nilaidiameter / 2;
            Double hasilhitung = 3.14 * nilaijarijari * nilaijarijari;
            hasil.setText(hasilhitung.toString());
        }
    }
}

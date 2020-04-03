package com.example.a1711501526_aplikasimatematika_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class KetupatActivity extends AppCompatActivity {
    EditText diagonal1,diagonal2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketupat);
        diagonal1 = findViewById(R.id.d1);
        diagonal2 = findViewById(R.id.d2);
        hasil = findViewById(R.id.texthasil);

    }

    public void tombolhitung(View view){
        String inputdiagonal1 = diagonal1.getText().toString();
        String inputdiagonal2 = diagonal2.getText().toString();

        if(TextUtils.isEmpty(inputdiagonal1)){
            diagonal1.setError("diagonal1 harus di isi");;
            diagonal1.requestFocus();
        }else if(TextUtils.isEmpty(inputdiagonal2)){
            diagonal2.setError("diagonal2 harus di isi");;
            diagonal2.requestFocus();
        }else{
            Double nilaidiagonal1 = Double.parseDouble((inputdiagonal1));
            Double nilaidiagonal2 = Double.parseDouble((inputdiagonal2));
            Double hasilhitung = 0.5* nilaidiagonal1 * nilaidiagonal2;
            hasil.setText(hasilhitung.toString());
        }
    }
}

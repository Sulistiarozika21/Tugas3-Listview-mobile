package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnKaktus,btnDurian,btnIkan;
    Button button;
    public static final String JENIS_GALERI_KEY= "JENIS_GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnKaktus = findViewById(R.id.btn_jenis_kaktus);
        btnDurian = findViewById(R.id.btn_jenis_durian);
        btnIkan = findViewById(R.id.btn_jenis_ikan);
        button = findViewById(R.id.dialog_button);

        btnKaktus.setOnClickListener(view -> bukaGaleri("Kaktus"));
        btnDurian.setOnClickListener(view -> bukaGaleri("Durian"));
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
        button.setOnClickListener(view -> profilActivity());
    }

    private void bukaGaleri(String jenisTumbuhan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarContentActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisTumbuhan);
        startActivity(intent);
    }
    private void profilActivity() {
        Log.d("MAIN","Buka Activity profil");
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }
}
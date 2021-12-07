package com.example.tugasuts;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasuts.model.Tumbuhan;

public class ProfileActivity extends AppCompatActivity {
    Tumbuhan tumbuhan;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoTumbuhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        tumbuhan = (Tumbuhan) intent.getSerializableExtra(DaftarContentActivity.TUMBUHAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(tumbuhan);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoTumbuhan = findViewById(R.id.gambar);
    }


    private void tampilkanProfil(Tumbuhan tumbuhan) {
        Log.d("Profil","Menampilkan "+tumbuhan.getJenis());
        txJudul.setText(tumbuhan.getJenis());
        txAsal.setText(tumbuhan.getAsal());
        txDeskripsi.setText(tumbuhan.getDeskripsi());
        ivFotoTumbuhan.setImageDrawable(this.getDrawable(tumbuhan.getDrawableRes()));
    }
}

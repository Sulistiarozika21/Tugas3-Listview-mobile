package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tugasuts.model.Tumbuhan;

import java.util.List;

public class DaftarContentActivity extends AppCompatActivity {
    public final static String TUMBUHAN_TERPILIH ="tumbuhan_obj_key";
    List<Tumbuhan> tumbuhans;
    ListView listView;
    String jenisTumbuhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_content);
        Intent intent = getIntent();
        jenisTumbuhan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR BERBAGAI JENIS "+jenisTumbuhan.toUpperCase());
        tumbuhans = DataProvider.getTumbuhansByTipe(this,jenisTumbuhan);
        setupListView();
    }
    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_content);
        DaftarTumbuhanAdapter adapter = new DaftarTumbuhanAdapter(this,tumbuhans);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }
    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Tumbuhan terpilih = tumbuhans.get(position);
            bukaProfileTumbuhan(terpilih);
        }
    };

    private void bukaProfileTumbuhan(Tumbuhan tumbuhanTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(TUMBUHAN_TERPILIH, tumbuhanTerpilih);
        startActivity(intent);
    }
}
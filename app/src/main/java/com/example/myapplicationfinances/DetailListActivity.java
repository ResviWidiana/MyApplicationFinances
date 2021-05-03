package com.example.myapplicationfinances;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationfinances.ui.home.DataKeuangan;

public class DetailListActivity extends AppCompatActivity {
    TextView kategori, tanggal, nama, jumlah, catatan;
    String svKategori, svTanggal, svNama, svJumlah, svCatatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        kategori = findViewById(R.id.detailKategori);
        tanggal = findViewById(R.id.detailTanggal);
        nama = findViewById(R.id.detailNamaTransaksi);
        jumlah = findViewById(R.id.detailJumlah);
        catatan = findViewById(R.id.detailCatatan);

        Intent intent = getIntent();
        DataKeuangan dataKeuangan = intent.getParcelableExtra("DataKeuangan");
        svKategori = dataKeuangan.getKategori();
        svTanggal = dataKeuangan.getTanggal();
        svNama = dataKeuangan.getNama();
        svJumlah = dataKeuangan.getJumlah();
        svCatatan = dataKeuangan.getCatatan();

        kategori.setText(svKategori);
        tanggal.setText(svTanggal);
        nama.setText(svNama);
        jumlah.setText(svJumlah);
        catatan.setText(svCatatan);
    }

}

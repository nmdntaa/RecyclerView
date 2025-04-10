package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {
    TextView tvNamaMakananDetail, tvAsalMakananDetail, tvHargaMakananDetail;
    ImageView ivGambarMakananDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvAsalMakananDetail = findViewById(R.id.tvAsalMakananDetail);
        tvHargaMakananDetail = findViewById(R.id.tvHargaMakananDetail);
        ivGambarMakananDetail = findViewById(R.id.ivGambarMakananDetail);

        // Ambil data dari Intent
        Intent intent = getIntent();
        String namaMakanan = intent.getStringExtra("namaMakanan");
        String asalMakanan = intent.getStringExtra("asalMakanan");
        String hargaMakanan = intent.getStringExtra("hargaMakanan");
        int gambarMakanan = intent.getIntExtra("gambarMakanan", R.drawable.ic_launcher_foreground);

        // Set data ke tampilan
        tvNamaMakananDetail.setText(namaMakanan);
        tvAsalMakananDetail.setText(asalMakanan);
        tvHargaMakananDetail.setText(hargaMakanan);
        ivGambarMakananDetail.setImageResource(gambarMakanan);
    }
}

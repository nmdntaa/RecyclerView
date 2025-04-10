package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterListMakanan.OnItemClickListener {

    RecyclerView rvListMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListMakanan = findViewById(R.id.rvListMakanan);
        rvListMakanan.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<MakananModel> dataMakanan = new ArrayList<>();

        // Tambahkan data makanan dengan gambar dari drawable
        dataMakanan.add(new MakananModel("Soto Kudus", "Kudus", "Rp 15.000", R.drawable.soto_kudus));
        dataMakanan.add(new MakananModel("Nasi Goreng", "Indonesia", "Rp 20.000", R.drawable.nasi_goreng));
        dataMakanan.add(new MakananModel("Bakso", "Malang", "Rp 18.000", R.drawable.bakso));

        AdapterListMakanan adapterListMakanan = new AdapterListMakanan(dataMakanan, this);
        rvListMakanan.setAdapter(adapterListMakanan);
    }
                                                                                                                                      
    @Override
    public void onItemClick(MakananModel makananModel) {
        Toast.makeText(this, "Kamu memilih: " + makananModel.getNamaMakanan(), Toast.LENGTH_SHORT).show();
        Intent in = new Intent(MainActivity.this, DetailMakanan.class);
        in.putExtra("namaMakanan", makananModel.getNamaMakanan());
        in.putExtra("asalMakanan", makananModel.getAsalMakanan());
        in.putExtra("hargaMakanan", makananModel.getHargaMakanan());
        in.putExtra("gambarMakanan", makananModel.getGambarMakanan());
        startActivity(in);
    }
}

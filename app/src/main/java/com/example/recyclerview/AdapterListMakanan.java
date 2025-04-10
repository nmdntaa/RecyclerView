package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterListMakanan extends RecyclerView.Adapter<AdapterListMakanan.ListMakananViewHolder> {

    private final ArrayList<MakananModel> listMakananModel;
    private final OnItemClickListener listener;

    // Buat interface listener sendiri
    public interface OnItemClickListener {
        void onItemClick(MakananModel makananModel);
    }

    // Konstruktor adapter dengan listener
    public AdapterListMakanan(ArrayList<MakananModel> listMakananModel, OnItemClickListener listener) {
        this.listMakananModel = listMakananModel;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListMakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false); // Pastikan layout sesuai dengan XML yang digunakan
        return new ListMakananViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMakananViewHolder holder, int position) {
        MakananModel makananModel = listMakananModel.get(position);
        holder.tvNamaMakanan.setText(makananModel.getNamaMakanan());
        holder.tvAsalMakanan.setText(makananModel.getAsalMakanan());
        holder.tvHargaMakanan.setText(String.valueOf(makananModel.getHargaMakanan()));
        holder.ivGambarMakanan.setImageResource(makananModel.getGambarMakanan());

        // Tambahkan event klik
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makananModel));
    }

    @Override
    public int getItemCount() {
        return listMakananModel.size();
    }

    public static class ListMakananViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaMakanan, tvAsalMakanan, tvHargaMakanan;
        ImageView ivGambarMakanan;

        public ListMakananViewHolder(View view) {
            super(view);
            tvNamaMakanan = view.findViewById(R.id.tvNamaMakanan);
            tvAsalMakanan = view.findViewById(R.id.tvAsalMakanan);
            tvHargaMakanan = view.findViewById(R.id.tvHargaMakanan);
            ivGambarMakanan = view.findViewById(R.id.ivGambarMakanan);
        }
    }
}

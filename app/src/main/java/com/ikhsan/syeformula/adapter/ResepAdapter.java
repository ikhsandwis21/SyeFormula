package com.ikhsan.syeformula.adapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ikhsan.syeformula.DetailActivity;
import com.ikhsan.syeformula.R;
import com.ikhsan.syeformula.model.Resep;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder> {
    private ArrayList<Resep> listResep;
    public Activity activity;

    public ResepAdapter(Activity activity, ArrayList<Resep> list){
        this.listResep = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_resep,viewGroup,false);
        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResepAdapter.ResepViewHolder holder,final int position) {
        Resep resep = listResep.get(position);
        Glide.with(holder.itemView.getContext())
                .load(resep.getFoto1())
                .apply(new RequestOptions().override(200,150))
                .into(holder.imgFoto1);
        holder.tvNama.setText(resep.getNama());
        holder.tvDeskripsi.setText(resep.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("resep", getItem(position));
                intent.putExtras(bundle);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama,tvDeskripsi,tvBahan,tvCara;
        ImageView imgFoto1,imgFoto2,imgFoto3;
        public ResepViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.nama_kue);
            tvDeskripsi = itemView.findViewById(R.id.deskripsi_kue);
            tvBahan = itemView.findViewById(R.id.bahan_kue);
            tvCara = itemView.findViewById(R.id.cara_kue);
            imgFoto1 = itemView.findViewById(R.id.mainFoto);
            imgFoto2 = itemView.findViewById(R.id.secondFoto);
            imgFoto3 = itemView.findViewById(R.id.thirdFoto);
        }

    }
    @Override
    public int getItemViewType(int position) {
        return listResep.get(position).getViewType();
    }

    public Resep getItem(int position) {
        return listResep.get(position);
    }
}

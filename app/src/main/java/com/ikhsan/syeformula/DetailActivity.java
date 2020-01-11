package com.ikhsan.syeformula;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikhsan.syeformula.adapter.ResepAdapter;
import com.ikhsan.syeformula.model.Resep;
import com.ikhsan.syeformula.model.ResepModel;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    TextView tvNama,tvDeskripsi,tvBahan,tvCara;
    ImageView imgFoto1,imgFoto2,imgFoto3;
    public RecyclerView rvDetail;
    public ArrayList<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = (TextView) findViewById(R.id.nama_kue);
        tvDeskripsi = (TextView) findViewById(R.id.deskripsi_kue);
        tvBahan = (TextView) findViewById(R.id.bahan_kue);
        tvCara = (TextView) findViewById(R.id.cara_kue);
        imgFoto1 = (ImageView) findViewById(R.id.mainFoto);
        imgFoto2 = (ImageView) findViewById(R.id.secondFoto);
        imgFoto3 = (ImageView) findViewById(R.id.thirdFoto);

        Intent intent =getIntent();
        Bundle bundle = intent.getExtras();
        Resep resep = (Resep) bundle.getSerializable("resep");
        list.addAll(ResepModel.getListData());
        tvNama.setText(resep.getNama());
        tvDeskripsi.setText(resep.getDeskripsi());
        tvBahan.setText(resep.getBahan());
        tvCara.setText(resep.getCara());
        imgFoto1.setImageResource(resep.getFoto1());
        imgFoto2.setImageResource(resep.getFoto2());
        imgFoto3.setImageResource(resep.getFoto3());

        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(resep.getNama());
        }

    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

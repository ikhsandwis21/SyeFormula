package com.ikhsan.syeformula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.ikhsan.syeformula.adapter.ResepAdapter;
import com.ikhsan.syeformula.model.Resep;
import com.ikhsan.syeformula.model.ResepModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView rvResep;
    public ArrayList<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvResep = findViewById(R.id.rv_resep);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        list.addAll(ResepModel.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ResepAdapter resepAdapter = new ResepAdapter(this,list);
        rvResep.setAdapter(resepAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent dataIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(dataIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}

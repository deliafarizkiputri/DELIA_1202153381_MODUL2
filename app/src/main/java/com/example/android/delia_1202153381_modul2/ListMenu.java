package com.example.android.delia_1202153381_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.crab, "Crab Sauce Padang", 120000, "Kepiting, saus tiram"));
        listmenu.add(new pilihMenu(R.drawable.fish, "Grilled Fish", 75000, "ikan, kecap, bawang merah,bawang putih"));
        listmenu.add(new pilihMenu(R.drawable.lobster, "lobster asam manis", 100000, "lobstes, gula, bawang merah,bawah putih, garam"));
        listmenu.add(new pilihMenu(R.drawable.scallops, "Mozarella Scallops", 150000, "kerang, keju mozarella"));
        listmenu.add(new pilihMenu(R.drawable.seafood, "seafood Packet", 150000, "Menu paket lengkap seafood"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}

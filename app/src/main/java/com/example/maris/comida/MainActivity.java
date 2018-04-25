package com.example.maris.comida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    FoodAdapter adapter;
    ArrayList<Comida> comidas;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comidas = new ArrayList<>();

        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareComidas();

        adapter = new FoodAdapter(comidas);
        rv.setAdapter(adapter);

    }

    public void prepareComidas(){

        String TAG = "Mensaje";
        comidas = new ArrayList<>();

        comidas.add(new Comida("Name: Pollo Campero\n","Especialidad: Pollo\n",R.drawable.pc,"Menu campero"));
        comidas.add(new Comida("Name: Pizza Hut\n","Especialidad: Pizza\n",R.drawable.ph,"4 estaciones"));
        comidas.add(new Comida("Name: China Wok\n","Especialidad: Comida China\n",R.drawable.cw,"Combo woki"));
        comidas.add(new Comida("Name: Subway\n","Especialidad: Sandwish 7\n",R.drawable.sw,"Sub del dia"));

    }

}

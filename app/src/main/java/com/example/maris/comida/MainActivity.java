package com.example.maris.comida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    FoodAdapter adapter;
    ArrayList<Comida> comidas;
    LinearLayoutManager lManager;
    ArrayList<Comida> comidas2;
    Button btn_rest;
    Button btn_favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comidas = new ArrayList<>();
        comidas2 = new ArrayList<>();
        btn_rest = findViewById(R.id.btnrest);
        btn_favorite = findViewById(R.id.btn_favorite);


        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareComidas();

        adapter = new FoodAdapter(comidas, this);
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

    //funciones para botones
    public void btn_rest(View view){
        adapter.setF();
        adapter=new FoodAdapter(comidas,view.getContext());
        rv.setAdapter(adapter);
    }
    public void btn_favorites(View view){
        adapter.setT();
        adapter=new FoodAdapter(comidas,view.getContext());
        rv.setAdapter(adapter);
    }

    //funcion para la lista de favoritos, agregar o quitar
    

}

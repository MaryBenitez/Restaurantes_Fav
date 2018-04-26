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
        btn_favorite = findViewById(R.id.btnfavorite);


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

        comidas.add(new Comida("Pollo Campero\n","Especialidad: Pollo\n",R.drawable.pc,"Promoción: Menú campero"));
        comidas.add(new Comida("Pizza Hut\n","Especialidad: Pizza\n",R.drawable.ph,"Promoción: 4 estaciones"));
        comidas.add(new Comida("China Wok\n","Especialidad: Comida China\n",R.drawable.cw,"Promoción: Combo woki"));
        comidas.add(new Comida("Subway\n","Especialidad: Sandwish \n",R.drawable.sw,"Promoción: Sub del dia"));

    }

    //funciones para botones
    public void btn_rest(View view){
        adapter.setF();
        adapter=new FoodAdapter(comidas,view.getContext());
        rv.setAdapter(adapter);
    }
    public void btn_favorites(View view){
        adapter.setT();
        adapter=new FoodAdapter(comidas2,view.getContext());
        rv.setAdapter(adapter);
    }

    //funcion para la lista de favoritos, agregar o quitar
    public void agregar_favorite(Comida Lista_favorite){
        comidas2.add(Lista_favorite);
    }

    public void eliminar_favorite(String NRest){
        int cont=0;

        for(Comida comida : comidas2){
            if(comida.getName() == NRest){
                break;
            }
            cont++;
        }
        comidas2.remove(cont);
        if(adapter.AdFavorite()){
            adapter = new FoodAdapter(comidas2, this);
            rv.setAdapter(adapter);
        }
    }

}

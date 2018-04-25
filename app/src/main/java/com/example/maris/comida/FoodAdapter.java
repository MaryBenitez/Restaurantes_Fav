package com.example.maris.comida;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by maris on 23/4/2018.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ComidasViewHolder>{

    private ArrayList<Comida> comidas;
    private Context context;

    @Override
    public ComidasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new ComidasViewHolder(v));
    }

    @Override
    public void onBindViewHolder(final ComidasViewHolder holder, final int position) {
        holder.name.setText((comidas.get(position).getName()));
        holder.img.setImageResource(comidas.get(position).getImg());
        holder.btn_ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comida notificacion;
                Toast.makeText(view.getContext(),comidas.get(position).getName()+""+comidas.get(position).getEsp()+""+comidas.get(position).getDesc(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return comidas.size();
    }

    public static class ComidasViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView name;
        ImageView img;
        Button btn_ver;
        Button btnfav;
        Button btn_mar;

        public ComidasViewHolder(View itemView){
            super(itemView);

            btn_ver = itemView.findViewById(R.id.btn_ver);
            card=itemView.findViewById(R.id.card_view);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
            btnfav=itemView.findViewById(R.id.btnfav);
        }
    }
    public FoodAdapter(ArrayList<Comida> comidas, Context context){
        this.comidas=comidas;
        this.context=context;
    }


}

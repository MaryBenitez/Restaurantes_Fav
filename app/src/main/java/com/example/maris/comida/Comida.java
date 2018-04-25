package com.example.maris.comida;

import android.widget.Button;

/**
 * Created by maris on 23/4/2018.
 */

public class Comida {

    private String name;
    private String esp;
    private int img;
    private String desc;
    private Button btn;
    private boolean list_fav;

    public Comida(String name, String esp, int img, String desc){
        this.name = name;
        this.esp = esp;
        this.img = img;
        this.desc = desc;
        list_fav = false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEsp() {
        return esp;
    }
    public void setEsp(String esp) {
        this.esp = esp;
    }

    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Button getBtn() {
        return btn;
    }
    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public boolean isList_fav() {
        return list_fav;
    }
    public void setList_fav(boolean list_fav) {
        this.list_fav = list_fav;
    }
}

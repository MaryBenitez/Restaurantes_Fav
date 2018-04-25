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

    public Comida(String name, String esp, int img, String desc){
        this.name = name;
        this.esp = esp;
        this.img = img;
        this.desc = desc;
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
    public void setEsps(String caps) {
        this.esp = caps;
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

}

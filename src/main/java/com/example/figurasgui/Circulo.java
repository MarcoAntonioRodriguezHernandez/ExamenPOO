package com.example.figurasgui;

public class Circulo{

    protected float base;
    protected float altura;
    protected float lado;
    protected float radio;

    public  float area(){
        float a = (float) ((3.1416) * (Math.pow(radio, 2)));
        return a;
    };
    public float perimetro(){
        float p = (float) (2 * 3.1416 * radio);
        return p;
    };
    public Circulo(float radio) {
        this.radio = radio;
    }
}

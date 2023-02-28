package com.example.figurasgui;

public class Rectangulo{

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float area() {
        float a = this.base * this.base;
        return a;
    }

    public float perimetro() {
        float p = (this.base * 2) + (this.altura * 2);
        return p;
    }
}

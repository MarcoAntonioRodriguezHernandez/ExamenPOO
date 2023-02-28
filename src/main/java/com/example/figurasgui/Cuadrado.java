package com.example.figurasgui;

public class Cuadrado{
    private float lado;
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float area() {
        float a = this.lado * this.lado;
        return a;
    }

    public float perimetro() {
        float p = this.lado * 4;
        return p;
    }
}

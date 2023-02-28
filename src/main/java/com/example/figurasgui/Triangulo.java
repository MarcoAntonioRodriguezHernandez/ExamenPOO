package com.example.figurasgui;

public class Triangulo{
    private float base;
    private float altura;
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float area() {
        float a = (this.base * this.altura) / 2;
        return a;
    }

    public float perimetro() {
        float p = this.base + 2 * hipotenusa();
        return p;
    }

    public float hipotenusa() {
        float h = ((float) (Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.altura, 2))));
        return h;
    }

    public String tipo() {
        if (this.base == hipotenusa()) {
            return ("Triángulo isosceles");
        } else if (this.base < hipotenusa()) {
            return ("Triangulo obtusángulo");
        } else {
            return ("Triangulo agudo");
        }
    }
}

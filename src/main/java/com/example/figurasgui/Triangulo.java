package com.example.figurasgui;

public class Triangulo extends Figura {
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected float area() {
        float a = (this.base * this.altura) / 2;
        return a;
    }

    @Override
    protected float perimetro() {
        float p = this.base + 2 * hipotenusa();
        return p;
    }

    protected float hipotenusa() {
        float h = ((float) (Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.altura, 2))));
        return h;
    }

    protected String tipo() {
        if (this.base == hipotenusa()) {
            return ("Triángulo isosceles");
        } else if (this.base < hipotenusa()) {
            return ("triangulo obtusángulo");
        } else {
            return ("triangulo agudo");
        }
    }
}

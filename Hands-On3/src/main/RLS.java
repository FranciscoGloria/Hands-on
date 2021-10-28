package main;
import RLS.Calculo;

public class RLS {
    public static void main(String[] args) {
        Calculo c = new Calculo(0, 0, 0, 0, 0, 0, 0, 0, 9);
        c.datosX();
        c.datosY();
        c.datosregreX();
        c.imprimirDatos();
        c.calcularDatos();
        c.prediccionIndiv();
    }
}
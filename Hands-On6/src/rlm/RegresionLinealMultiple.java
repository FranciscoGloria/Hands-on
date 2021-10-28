package rlm;

import jade.core.behaviours.OneShotBehaviour;
import jade.core.Agent;
import rlma.Calculo;

public class RegresionLinealMultiple extends Agent{

    protected void setup(){
        System.out.println("Regresion Lineal Multiple");
        addBehaviour(new MyOneShotBehaviour());
    }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        public void action(){
            System.out.println("Agente Iniciado");
            Calculo c = new Calculo(0);
            c.datosX();
            c.datosY();
            c.datosFactor1();
            c.datosFactor2();
            c.mostrar();
            c.transpuesta();
            c.muestraTrasnspuesta();
            c.multiplicacion1();
            c.multiplicacion2();
            c.inversa();
            c.betas();
            c.pronostico();
        }
        public int onEnd(){
            System.out.println("Agente Eliminado");
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
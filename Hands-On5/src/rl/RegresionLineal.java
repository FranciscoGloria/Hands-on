package rl;

import jade.core.behaviours.OneShotBehaviour;
import jade.core.Agent;
import rls.Calculo;

public class RegresionLineal extends Agent{

    protected void setup() {
        System.out.println("Regresion Lineal Simple");
        addBehaviour(new MyOneShotBehaviour());
    }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        public void action(){
            System.out.println("Agente Iniciado");
            Calculo c = new Calculo(0, 0, 0, 0, 0, 0, 0, 0, 9);
            c.datosX();
            c.datosY();
            c.datosregreX();
            c.imprimirDatos();
            c.calcularDatos();
            c.prediccionIndiv();
        }
        public int onEnd(){
            System.out.println("Agente Eliminado");
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
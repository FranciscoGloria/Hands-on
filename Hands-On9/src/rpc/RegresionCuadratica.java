package rpc;

import jade.core.behaviours.OneShotBehaviour;
import jade.core.Agent;
import rc.*;

public class RegresionCuadratica extends Agent{
    protected void setup(){
        System.out.println("Regresion Cuadratica");
        addBehaviour(new MyOneShotBehaviour());
    }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        public void action(){
            System.out.println("Agente Iniciado");
            RegreCuadra rc = new RegreCuadra();
            rc.qr();
        }
        public int onEnd(){
            System.out.println("Agente Eliminado");
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
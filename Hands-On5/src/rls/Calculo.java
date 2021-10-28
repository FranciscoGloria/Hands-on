package rls;

public class Calculo extends Datos{

    public Calculo(double sumx, double sumy, double sumx2, double sumxy, double beta0, double beta1, double indiv, double indiv2, int n) {
        super(sumx, sumy, sumx2, sumxy, beta0, beta1, indiv, indiv2, n);
    }

    public double[] datosX (){
        return datosx;
    }

    public double[] datosY (){
        return datosy;
    }

    public double[] datosregreX(){
        return regreX;
    }

    public void imprimirDatos (){
        System.out.println(" X | Y ");
        for (int i=0; i<n; i++){
            System.out.println(datosx[i] + " | "+ datosy[i]);
        }
    }

    public void calcularDatos(){
        for(int i=0; i<n; i++){
            sumx = sumx + datosx[i];
        }
        System.out.println("\nLa suma de los datos X es: "+sumx);

        for (int i=0; i<n; i++){
            sumy = sumy + datosy[i];
        }
        System.out.println("La suma de los datos Y es: "+sumy);

        for(int i=0; i<n; i++){
            datosx2[i] = datosx[i] * datosx[i];
            datosxy[i] = datosx[i] * datosy[i];
        }
        for (int i=0; i<n; i++){
            sumx2 = sumx2 + datosx2[i];
        }
        System.out.println("X^2 ="+sumx2);
        for (int i=0; i<n; i++){
            sumxy = sumxy + datosxy[i];
        }
        System.out.println("X*Y ="+sumxy);

        beta0 = ((sumy)*(sumx2)-(sumx)*(sumxy))/(n*(sumx2)-(sumx)*(sumx));
        System.out.println("Beta_0 = "+beta0);

        beta1 = (n*(sumxy)-(sumx)*(sumy))/(n*(sumx2)-(sumx)*(sumx));
        System.out.println("Beta_1 = "+beta1);
    }

    public void prediccionIndiv (){
        System.out.println("Empleando la Ecuacion de Regresion para otros Pronosticos");
        for (int i= 0; i<3; i++) {
            resulRegreX[i] = beta0 + (beta1 * regreX[i]);
        }
        for (int f=0; f<3; f++){
            System.out.println("X= "+regreX[f]+" Y= "+resulRegreX[f]);
        }
    }
}
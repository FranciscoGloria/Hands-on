package rlsg;

public class Calculo extends Datos{
    public Calculo(double sumx, double sumy, double sumx2, double sumxy, double beta0, double beta1, double paso2_1, double paso2_2, double error, double a, double beta0n, double beta1n, int n) {
        super(sumx, sumy, sumx2, sumxy, beta0, beta1, paso2_1, paso2_2, error, a, beta0n, beta1n, n);
    }
    public double[] datosX (){
        return datosx;
    }

    public double[] datosY (){
        return datosy;
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

        beta1 = (9*(sumxy)-(sumx)*(sumy))/(n*(sumx2)-(sumx)*(sumx));
        System.out.println("Beta_1 = "+beta1);
    }
    public void error(){
        for (int i = 0; i<n; i++){
            error += Math.pow(datosy[i]-(beta0+(beta1*datosx[i])),2);
        }
        error = (0.11 * error);
        System.out.println("El Error es: " + error);
    }
    public void nBetas(){
        //Beta New 0
        beta0n = beta0 - a*(0/-1);
        System.out.println("La Nueva Beta0 es: "+beta0n);

        //Beta New 1
        for (int i=0; i<n; i++){
            beta1n = beta1 - a*(0/(-23*datosx[i]));
        }
        System.out.println("La Nueva Beta1 es: "+beta1n);
    }
}
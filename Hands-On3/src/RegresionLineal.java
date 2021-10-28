public class RegresionLineal{
    private double [] datosx = {1,2,3,4,5,6,7,8,9};
    private double [] datosy = {3,6,9,12,15,18,21,24,27};
    private double [] datosx2;
    private double [] datosxy;
    private double [] regreX = {62, 72, 82};
    private double [] resulRegreX;
    private double sumx = 0, sumy = 0, sumx2 = 0, sumxy = 0, beta0 = 0, beta1 = 0,indiv = 0, indiv2 = 0;

    public void cargarDatos (){
        datosx2 = new double[9];
        datosxy = new double[9];
        resulRegreX = new double[3];
    }

    public void imprimirDatos (){
        System.out.println(" X | Y ");
        for (int i=0; i<9; i++){
            System.out.println(datosx[i] + " | "+ datosy[i]);
        }
    }

    public void calcularDatos(){
        for(int i=0; i<9; i++){
            sumx = sumx + datosx[i];
        }
        System.out.println("\nLa suma de los datos X es: "+sumx);
        for (int i=0; i<9; i++){
            sumy = sumy + datosy[i];
        }
        System.out.println("La suma de los datos Y es: "+sumy);
        for(int i=0; i<9; i++){
            datosx2[i] = datosx[i] * datosx[i];
            datosxy[i] = datosx[i] * datosy[i];
        }
        for (int i=0; i<9; i++){
            sumx2 = sumx2 + datosx2[i];
        }
        System.out.println("X^2 ="+sumx2);
        for (int i=0; i<9; i++){
            sumxy = sumxy + datosxy[i];
        }
        System.out.println("X*Y ="+sumxy);

        beta0 = ((sumy)*(sumx2)-(sumx)*(sumxy))/(9*(sumx2)-(sumx)*(sumx));
        System.out.println("Beta_0 = "+beta0);

        beta1 = (9*(sumxy)-(sumx)*(sumy))/(9*(sumx2)-(sumx)*(sumx));
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
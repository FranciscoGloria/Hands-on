package rc;

import static java.lang.Math.pow;

public class RegreCuadra extends Sumatorias{
    Sumatorias s = new Sumatorias();
    Determinantes d = new Determinantes();
    DataSet ds = new DataSet();
    double a = d.a();
    double matrizxi[] = ds.matrizxi;
    double b = d.b();
    double c = d.c();
    double matrizyi[] = ds.matrizyi;
    double n = getN();
    double ymedia = 0;
    double sse = 0;
    double sst = 0;
    double r2 = 0;

    public double SSE(){
        for(int i=0; i<n; i++){
            sse += pow(matrizyi[i]-(a*(Math.pow(matrizxi[i], 2)))-(b*matrizxi[i])-c,2);
        }
        return sse;
    }

    public double SST(){
        for(int i=0; i<n; i++){
            ymedia += matrizyi[i];
        }
        ymedia = ymedia/n;

        for (int i=0; i<n; i++){
            sst += Math.pow(matrizyi[i] - ymedia,2);
        }

        return sst;
    }

    public double r2(){
        r2 = 1-(SSE()/SST());
        return r2;
    }
    public void qr(){
        System.out.println("Determinante del Sistema: "+d.determinanteS());
        System.out.println("Determinante de A: "+d.determinanteA());
        System.out.println("Determinante de B: "+d.determinanteB());
        System.out.println("Determinante de C: "+d.determinanteC());

        System.out.println("");

        System.out.println("B0 = "+d.a());
        System.out.println("B1 = "+d.b());
        System.out.println("B2 = "+d.c());

        System.out.println("");

        System.out.println("Regresion Cuadratica");
        System.out.println("R2= "+r2());
    }
}
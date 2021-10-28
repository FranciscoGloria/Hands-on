package rlsg;

public abstract class Datos {
    protected double [] datosx = {23,26,30,34,43,48,52,57,58};
    protected double [] datosy = {651,762,856,1063,1190,1298,1421,1440,1518};
    protected double [] datosx2 = new double[9];
    protected double [] datosxy = new double[9];
    protected double sumx, sumy, sumx2, sumxy, beta0, beta1, paso2_1 , paso2_2  , error , a , beta0n, beta1n;
    protected int n;

    public Datos(double sumx, double sumy, double sumx2, double sumxy, double beta0, double beta1, double paso2_1, double paso2_2, double error, double a, double beta0n, double beta1n, int n) {
        this.sumx = sumx;
        this.sumy = sumy;
        this.sumx2 = sumx2;
        this.sumxy = sumxy;
        this.beta0 = beta0;
        this.beta1 = beta1;
        this.paso2_1 = paso2_1;
        this.paso2_2 = paso2_2;
        this.error = error;
        this.a = a;
        this.beta0n = beta0n;
        this.beta1n = beta1n;
        this.n = n;
    }

    public abstract double[] datosX();

    public abstract double[] datosY();

    public abstract void imprimirDatos();

    public abstract void calcularDatos();

    public abstract void error();

    public abstract void nBetas();
}
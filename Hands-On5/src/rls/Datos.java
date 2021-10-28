package rls;

public abstract class Datos {
    protected double [] datosx = {23,26,30,34,43,48,52,57,58};
    protected double [] datosy = {651,762,856,1063,1190,1298,1421,1440,1518};
    protected double [] regreX = {62, 72, 82};
    protected double [] datosx2 = new double[9];
    protected double [] datosxy = new double[9];
    protected double [] resulRegreX = new double[3];
    protected double sumx, sumy, sumx2, sumxy, beta0, beta1, indiv, indiv2;
    protected int n;

    public Datos(double sumx, double sumy, double sumx2, double sumxy, double beta0, double beta1, double indiv, double indiv2, int n) {
        this.sumx = sumx;
        this.sumy = sumy;
        this.sumx2 = sumx2;
        this.sumxy = sumxy;
        this.beta0 = beta0;
        this.beta1 = beta1;
        this.indiv = indiv;
        this.indiv2 = indiv2;
        this.n = n;
    }

    public abstract double[] datosX();

    public abstract double[] datosY();

    public abstract double[] datosregreX();

    public abstract void imprimirDatos();

    public abstract void calcularDatos();

    public abstract void prediccionIndiv();

}
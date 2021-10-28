package rlma;
public abstract class Datos {
    protected double x [][] = {{1,41.9,29.1},{1,43.4,29.3},{1,43.9,29.5},{1,44.5,29.7},{1,47.3,29.9},{1,47.5,30.3,},{1,47.9,30.5},{1,50.2,30.7},{1,52.8,30.8},{1,53.2,30.9},{1,56.7,31.5},{1,57,31.7},{1,63.5,31.9},{1,65.3,32},{1,71.1,32.1},{1,77,32.5},{1,77.8,32.9}};
    protected double xt [][] = new double[3][17];
    protected double xtX [][] = new double[3][3];
    protected double y [] = {251.3, 251.3, 248.3, 267.5, 273.0, 276.5, 270.3, 274.9, 285.0, 290.0, 297.0, 302.5, 304.5, 309.3, 321.7, 330.7, 349.0};
    protected double xtY [][] = new double[3][1];
    protected double detxXT;
    protected double invxXT [][] = new double [3][3];
    protected double betas [][] = new double [3][1];
    protected double yields[][] = new double [6][1];
    protected double factor1[] = {81.5, 81.4, 82.2, 42.9, 44.4, 64.2};
    protected double factor2[] = {33.2, 34.3, 35.2, 28.9, 31.3, 31.4};

    public Datos(double detxXT) {
        this.detxXT = detxXT;
    }

    public abstract double[][] datosX();

    public abstract double[] datosY();

    public abstract double[] datosFactor1();

    public abstract double[] datosFactor2();

    public abstract void mostrar();

    public abstract void transpuesta();

    public abstract void muestraTrasnspuesta();

    public abstract void multiplicacion1();

    public abstract void multiplicacion2();

    public abstract void inversa();

    public abstract void betas();

    public abstract void pronostico();
}

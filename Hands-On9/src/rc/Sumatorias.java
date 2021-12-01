package rc;

import static java.lang.Math.pow;

public class Sumatorias extends DataSet{

    protected double sumxi, sumyi, sumxi2, sumxi3, sumxi4, sumxiyi, sumxi2yi;

    int n = getN();

    public double sumax(){
        for (int i=0;  i<n; i++){
            sumxi += matrizxi[i];
        }
        return sumxi;
    }
    public double sumay(){
        for (int i=0;  i<n; i++){
            sumyi += matrizyi[i];
        }
        return sumyi;
    }
    public double sumax2(){
        for (int i=0;  i<n; i++){
            sumxi2 += pow(matrizxi[i],2);
        }
        return sumxi2;
    }
    public double sumax3(){
        for (int i=0;  i<n; i++){
            sumxi3 += pow(matrizxi[i],3);
        }
        return sumxi3;
    }
    public double sumax4(){
        for (int i=0;  i<n; i++){
            sumxi4 += pow(matrizxi[i],4);
        }
        return sumxi4;
    }
    public double sumaxiY(){
        for (int i=0;  i<n; i++){
            sumxiyi += matrizxi[i] * matrizyi[i];
        }
        return sumxiyi;
    }
    public double sumax2Y(){
        for (int i=0;  i<n; i++){
            sumxi2yi += pow(matrizxi[i], 2) * matrizyi[i];
        }
        return sumxi2yi;
    }
}
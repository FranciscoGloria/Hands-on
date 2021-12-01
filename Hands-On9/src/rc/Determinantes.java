package rc;

public class Determinantes extends Sumatorias{

    Sumatorias s = new Sumatorias();
    DataSet d = new DataSet();
    double sumxi = s.sumax();
    double sumyi = s.sumay();
    double sumxi2 = s.sumax2();
    double sumxi3 = s.sumax3();
    double sumxi4 = s.sumax4();
    double sumxiyi = s.sumaxiY();
    double sumxi2yi = s.sumax2Y();
    double n = d.getN();

    double deters = (sumxi4 * sumxi2 * n) + (sumxi3 * sumxi * sumxi2) + (sumxi2 * sumxi3 * sumxi) - (sumxi2 * sumxi2 * sumxi2) - (sumxi * sumxi * sumxi4) - (n * sumxi3 * sumxi3);
    public double determinanteS(){
        return deters;
    }

    double detera = (sumxi2yi * sumxi2 * n) + (sumxi3 * sumxi * sumyi) + (sumxi2 * sumxiyi * sumxi) - (sumyi * sumxi2 * sumxi2) - (sumxi * sumxi * sumxi2yi) - (n * sumxiyi * sumxi3);
    public double determinanteA(){
        return detera;
    }

    double deterb = (sumxi4 * sumxiyi * n) + (sumxi2yi * sumxi * sumxi2) + (sumxi2 * sumxi3 * sumyi) - (sumxi2 * sumxiyi * sumxi2) - (sumyi * sumxi * sumxi4) - (n * sumxi3 * sumxi2yi);
    public double determinanteB(){
       return deterb;
    }

    double deterc = (sumxi4 * sumxi2 * sumyi) + (sumxi3 * sumxiyi * sumxi2) + (sumxi2yi * sumxi3 * sumxi) - (sumxi2 * sumxi2 * sumxi2yi) - (sumxi * sumxiyi * sumxi4) - (sumyi * sumxi3 * sumxi3);
    public double determinanteC(){
        return deterc;
    }

    double a = determinanteA() / determinanteS();
    public double a(){
        return a;
    }

    double b = determinanteB() / determinanteS();
    public double b(){
        return b;
    }

    double c = determinanteC() / determinanteS();
    public double c(){
        return c;
    }
}
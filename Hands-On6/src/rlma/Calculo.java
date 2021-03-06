package rlma;

import java.text.DecimalFormat;

public class Calculo extends Datos{

    public Calculo(double detxXT) {
        super(detxXT);
    }

    public double[][] datosX(){
        return x;
    }

    public double[] datosY(){
        return y;

    }

    public double[] datosFactor1(){
        return factor1;
    }

    public double[] datosFactor2(){
        return factor2;
    }

    public void mostrar(){
        System.out.println("La Matriz X es:");
        for(int i=0; i<17; i++){
            for(int f=0; f<3; f++){
                System.out.print(x[i][f]+" ");
            }
            System.out.println("");
        }
    }
    public void transpuesta(){
        xt = new double[3][17];
        for(int i=0; i<3; i++){
            for(int f=0; f<17; f++){
                xt[i][f] = x[f][i];
            }
        }
    }

    public void muestraTrasnspuesta(){
        System.out.println("La Matriz Transpuesta es:");
        for(int i=0; i<3; i++){
            for(int f=0; f<17; f++){
                System.out.print(xt[i][f]+" ");
            }
            System.out.println("");
        }
    }

    public void multiplicacion1(){
        DecimalFormat df = new DecimalFormat("#.00");
        xtX = new double[3][3];
        xtX[0][0] = (xt[0][0]*x[0][0])+(xt[0][1]*x[1][0])+(xt[0][2]*x[2][0])+(xt[0][3]*x[3][0])+(xt[0][4]*x[4][0])+(xt[0][5]*x[5][0])+(xt[0][6]*x[6][0])+(xt[0][7]*x[7][0])+(xt[0][8]*x[8][0])+(xt[0][9]*x[9][0])+(xt[0][10]*x[10][0])+(xt[0][11]*x[11][0])+(xt[0][12]*x[12][0])+(xt[0][13]*x[13][0])+(xt[0][14]*x[14][0])+(xt[0][15]*x[15][0])+(xt[0][16]*x[16][0]);
        xtX[0][1] = (xt[0][0]*x[0][1])+(xt[0][1]*x[1][1])+(xt[0][2]*x[2][1])+(xt[0][3]*x[3][1])+(xt[0][4]*x[4][1])+(xt[0][5]*x[5][1])+(xt[0][6]*x[6][1])+(xt[0][7]*x[7][1])+(xt[0][8]*x[8][1])+(xt[0][9]*x[9][1])+(xt[0][10]*x[10][1])+(xt[0][11]*x[11][1])+(xt[0][12]*x[12][1])+(xt[0][13]*x[13][1])+(xt[0][14]*x[14][1])+(xt[0][15]*x[15][1])+(xt[0][16]*x[16][1]);
        xtX[0][2] = (xt[0][0]*x[0][2])+(xt[0][1]*x[1][2])+(xt[0][2]*x[2][2])+(xt[0][3]*x[3][2])+(xt[0][4]*x[4][2])+(xt[0][5]*x[5][2])+(xt[0][6]*x[6][2])+(xt[0][7]*x[7][2])+(xt[0][8]*x[8][2])+(xt[0][9]*x[9][2])+(xt[0][10]*x[10][2])+(xt[0][11]*x[11][2])+(xt[0][12]*x[12][2])+(xt[0][13]*x[13][2])+(xt[0][14]*x[14][2])+(xt[0][15]*x[15][2])+(xt[0][16]*x[16][2]);
        xtX[1][0] = (xt[1][0]*x[0][0])+(xt[1][1]*x[1][0])+(xt[1][2]*x[2][0])+(xt[1][3]*x[3][0])+(xt[1][4]*x[4][0])+(xt[1][5]*x[5][0])+(xt[1][6]*x[6][0])+(xt[1][7]*x[7][0])+(xt[1][8]*x[8][0])+(xt[1][9]*x[9][0])+(xt[1][10]*x[10][0])+(xt[1][11]*x[11][0])+(xt[1][12]*x[12][0])+(xt[1][13]*x[13][0])+(xt[1][14]*x[14][0])+(xt[1][15]*x[15][0])+(xt[1][16]*x[16][0]);
        xtX[1][1] = (xt[1][0]*x[0][1])+(xt[1][1]*x[1][1])+(xt[1][2]*x[2][1])+(xt[1][3]*x[3][1])+(xt[1][4]*x[4][1])+(xt[1][5]*x[5][1])+(xt[1][6]*x[6][1])+(xt[1][7]*x[7][1])+(xt[1][8]*x[8][1])+(xt[1][9]*x[9][1])+(xt[1][10]*x[10][1])+(xt[1][11]*x[11][1])+(xt[1][12]*x[12][1])+(xt[1][13]*x[13][1])+(xt[1][14]*x[14][1])+(xt[1][15]*x[15][1])+(xt[1][16]*x[16][1]);
        xtX[1][2] = (xt[1][0]*x[0][2])+(xt[1][1]*x[1][2])+(xt[1][2]*x[2][2])+(xt[1][3]*x[3][2])+(xt[1][4]*x[4][2])+(xt[1][5]*x[5][2])+(xt[1][6]*x[6][2])+(xt[1][7]*x[7][2])+(xt[1][8]*x[8][2])+(xt[1][9]*x[9][2])+(xt[1][10]*x[10][2])+(xt[1][11]*x[11][2])+(xt[1][12]*x[12][2])+(xt[1][13]*x[13][2])+(xt[1][14]*x[14][2])+(xt[1][15]*x[15][2])+(xt[1][16]*x[16][2]);
        xtX[2][0] = (xt[2][0]*x[0][0])+(xt[2][1]*x[1][0])+(xt[2][2]*x[2][0])+(xt[2][3]*x[3][0])+(xt[2][4]*x[4][0])+(xt[2][5]*x[5][0])+(xt[2][6]*x[6][0])+(xt[2][7]*x[7][0])+(xt[2][8]*x[8][0])+(xt[2][9]*x[9][0])+(xt[2][10]*x[10][0])+(xt[2][11]*x[11][0])+(xt[2][12]*x[12][0])+(xt[2][13]*x[13][0])+(xt[2][14]*x[14][0])+(xt[2][15]*x[15][0])+(xt[2][16]*x[16][0]);
        xtX[2][1] = (xt[2][0]*x[0][1])+(xt[2][1]*x[1][1])+(xt[2][2]*x[2][1])+(xt[2][3]*x[3][1])+(xt[2][4]*x[4][1])+(xt[2][5]*x[5][1])+(xt[2][6]*x[6][1])+(xt[2][7]*x[7][1])+(xt[2][8]*x[8][1])+(xt[2][9]*x[9][1])+(xt[2][10]*x[10][1])+(xt[2][11]*x[11][1])+(xt[2][12]*x[12][1])+(xt[2][13]*x[13][1])+(xt[2][14]*x[14][1])+(xt[2][15]*x[15][1])+(xt[2][16]*x[16][1]);
        xtX[2][2] = (xt[2][0]*x[0][2])+(xt[2][1]*x[1][2])+(xt[2][2]*x[2][2])+(xt[2][3]*x[3][2])+(xt[2][4]*x[4][2])+(xt[2][5]*x[5][2])+(xt[2][6]*x[6][2])+(xt[2][7]*x[7][2])+(xt[2][8]*x[8][2])+(xt[2][9]*x[9][2])+(xt[2][10]*x[10][2])+(xt[2][11]*x[11][2])+(xt[2][12]*x[12][2])+(xt[2][13]*x[13][2])+(xt[2][14]*x[14][2])+(xt[2][15]*x[15][2])+(xt[2][16]*x[16][2]);
        System.out.println("Multiplicaci??n de matriz de X Transpuesta por Matrix X");
        System.out.println("???"+"                              "+"???");
        System.out.println("| "+df.format(xtX[0][0])+"  |  "+df.format(xtX[0][1])+"  | "+df.format(xtX[0][2])+"   |");
        System.out.println("| "+df.format(xtX[1][0])+" | "+df.format(xtX[1][1])+" | "+df.format(xtX[1][2])+" |");
        System.out.println("| "+df.format(xtX[2][0])+" | "+df.format(xtX[2][1])+" | "+df.format(xtX[2][2])+" |");
        System.out.println("???"+"                              "+"???");
    }

    public void multiplicacion2(){
        DecimalFormat df = new DecimalFormat("#.00");
        xtY = new double[3][1];
        xtY[0][0] = (xt[0][0]*y[0])+(xt[0][1]*y[1])+(xt[0][2]*y[2])+(xt[0][3]*y[3])+(xt[0][4]*y[4])+(xt[0][5]*y[5])+(xt[0][6]*y[6])+(xt[0][7]*y[7])+(xt[0][8]*y[8])+(xt[0][9]*y[9])+(xt[0][10]*y[10])+(xt[0][11]*y[11])+(xt[0][12]*y[12])+(xt[0][13]*y[13])+(xt[0][14]*y[14])+(xt[0][15]*y[15])+(xt[0][16]*y[16]);
        xtY[1][0] = (xt[1][0]*y[0])+(xt[1][1]*y[1])+(xt[1][2]*y[2])+(xt[1][3]*y[3])+(xt[1][4]*y[4])+(xt[1][5]*y[5])+(xt[1][6]*y[6])+(xt[1][7]*y[7])+(xt[1][8]*y[8])+(xt[1][9]*y[9])+(xt[1][10]*y[10])+(xt[1][11]*y[11])+(xt[1][12]*y[12])+(xt[1][13]*y[13])+(xt[1][14]*y[14])+(xt[1][15]*y[15])+(xt[1][16]*y[16]);
        xtY[2][0] = (xt[2][0]*y[0])+(xt[2][1]*y[1])+(xt[2][2]*y[2])+(xt[2][3]*y[3])+(xt[2][4]*y[4])+(xt[2][5]*y[5])+(xt[2][6]*y[6])+(xt[2][7]*y[7])+(xt[2][8]*y[8])+(xt[2][9]*y[9])+(xt[2][10]*y[10])+(xt[2][11]*y[11])+(xt[2][12]*y[12])+(xt[2][13]*y[13])+(xt[2][14]*y[14])+(xt[2][15]*y[15])+(xt[2][16]*y[16]);
        System.out.println("\nMultiplicacion de Matrix de X Trasnpuesta por Matriz de Y");
        System.out.println("???"+"           "+"???");
        System.out.println("|  "+df.format(xtY[0][0])+"  |");
        System.out.println("| "+df.format(xtY[1][0])+" |");
        System.out.println("| "+df.format(xtY[2][0])+" |");
        System.out.println("???"+"           "+"???");
    }

    public void inversa(){
        invxXT = new double[3][3];
        DecimalFormat df = new DecimalFormat("#.000");
        detxXT = (xtX[0][0]*xtX[1][1]*xtX[2][2])+(xtX[0][1]*xtX[1][2]*xtX[2][0])+(xtX[0][2]*xtX[1][0]*xtX[2][1])-(xtX[2][0]*xtX[1][1]*xtX[0][2])-(xtX[2][1]*xtX[1][2]*xtX[0][0])-(xtX[2][2]*xtX[1][0]*xtX[0][1]);
        System.out.println("El Determinante es: "+df.format(detxXT));
        invxXT[0][0] = (xtX[1][1] * xtX[2][2]) - (xtX[2][1] * xtX[1][2]);
        invxXT[0][1] = (xtX[0][1] * xtX[2][2]) - (xtX[2][1] * xtX[0][2]);
        invxXT[0][2] = (xtX[0][1] * xtX[1][2]) - (xtX[1][1] * xtX[0][2]);
        invxXT[1][0] = (xtX[0][1] * xtX[2][2]) - (xtX[2][0] * xtX[1][2]);
        invxXT[1][1] = (xtX[0][0] * xtX[2][2]) - (xtX[2][0] * xtX[0][2]);
        invxXT[1][2] = (xtX[0][0] * xtX[1][2]) - (xtX[1][0] * xtX[0][2]);
        invxXT[2][0] = (xtX[1][0] * xtX[2][1]) - (xtX[2][0] * xtX[1][1]);
        invxXT[2][1] = (xtX[0][0] * xtX[2][1]) - (xtX[2][0] * xtX[0][1]);
        invxXT[2][2] = (xtX[0][0] * xtX[1][1]) - (xtX[1][0] * xtX[0][1]);

        invxXT[0][1] = invxXT[0][1] * -1;
        invxXT[1][0] = invxXT[1][0] * -1;
        invxXT[1][2] = invxXT[1][2] * -1;
        invxXT[2][1] = invxXT[2][1] * -1;

        invxXT[0][0] = invxXT[0][0] / detxXT;
        invxXT[0][1] = invxXT[0][1] / detxXT;
        invxXT[0][2] = invxXT[0][2] / detxXT;
        invxXT[1][0] = invxXT[1][0] / detxXT;
        invxXT[1][1] = invxXT[1][1] / detxXT;
        invxXT[1][2] = invxXT[1][2] / detxXT;
        invxXT[2][0] = invxXT[2][0] / detxXT;
        invxXT[2][1] = invxXT[2][1] / detxXT;
        invxXT[2][2] = invxXT[2][2] / detxXT;

        System.out.println("Matriz Inversa de Matriz X por Matriz Transpuesta de X");
        System.out.println("???"+"                             "+"???");
        System.out.println("| "+df.format(invxXT[0][0])+" |  "+df.format(invxXT[0][1])+"  | "+df.format(invxXT[0][2])+" |");
        System.out.println("|  "+df.format(invxXT[1][0])+"  |  "+df.format(invxXT[1][1])+"   |  "+df.format(invxXT[1][2])+"  |");
        System.out.println("| "+df.format(invxXT[2][0])+" | "+df.format(invxXT[2][1])+"   |   "+df.format(invxXT[2][2])+"  |");
        System.out.println("???"+"                             "+"???");
    }
    public void betas(){
        DecimalFormat df = new DecimalFormat("#.0000");
        betas = new double[3][1];
        betas[0][0] = (xtY[0][0]*invxXT[0][0])+(xtY[1][0]*invxXT[1][0])+(xtY[2][0]*invxXT[2][0]);
        betas[1][0] = (xtY[0][0]*invxXT[0][1])+(xtY[1][0]*invxXT[1][1])+(xtY[2][0]*invxXT[2][1]);
        betas[2][0] = (xtY[0][0]*invxXT[0][2])+(xtY[1][0]*invxXT[1][2])+(xtY[2][0]*invxXT[2][2]);
        System.out.println("Resultado de Betas (B0, B1, B2)");
        System.out.println("???"+"              "+"???");
        System.out.println("| B0 "+df.format(betas[0][0])+" |");
        System.out.println("| B1   "+df.format(betas[1][0])+"  |");
        System.out.println("| B2   "+df.format(betas[2][0])+" |");
        System.out.println("???"+"              "+"???");
    }
    public void pronostico(){
        DecimalFormat df = new DecimalFormat("#.0000");
        yields = new double[6][1];
        yields[0][0] = betas[0][0] + (betas[1][0]*(81.5)) + (betas[2][0]*(33.2));
        yields[1][0] = betas[0][0] + (betas[1][0]*(81.4)) + (betas[2][0]*(34.3));
        yields[2][0] = betas[0][0] + (betas[1][0]*(82.2)) + (betas[2][0]*(35.2));
        yields[3][0] = betas[0][0] + (betas[1][0]*(42.9)) + (betas[2][0]*(28.9));
        yields[4][0] = betas[0][0] + (betas[1][0]*(44.4)) + (betas[2][0]*(31.3));
        yields[5][0] = betas[0][0] + (betas[1][0]*(64.2)) + (betas[2][0]*(31.4));

        System.out.println("Los Factores del Pronostico a Calcular son: ");
        System.out.println(" Factor1 "+" | "+" Factor2 ");
        for (int i=0;i<6;i++){
            System.out.println(i+"  "+factor1[i]+"   |    "+factor2[i]);
        }
        System.out.println("El Resultado del Pronostico es:");
        for(int i=0; i<6;i++){
            for (int f=0; f<1; f++){
                System.out.println(i+" "+"Y= "+df.format(betas[0][0])+" + "+df.format(betas[1][0])+"("+factor1[i]+")"+" + "+df.format(betas[2][0])+"("+factor2[i]+")"+" = "+df.format(yields[i][f]));
            }
        }
    }
}
package com.example.ejemplo1;

public class Programa {
    static long FECHA[]={1289001000000L , 1289002000000L , 1289004000000L ,
            1289006000000L , 1289007000000L, 1289008000000L , 128900900000L , 1289011000000L ,
            1289013000000L , 1289016000000L};
    static String USUARIO[] = {"carchimp", "tudela", "arcano", "totencar",
            "ramporo", "tudela", "arcano", "carchimp", "tudela", "totencar"};


    public static void main(String args[]) {
        //Clase obj1 = new Clase(FECHA[5], USUARIO[5]);
        //Clase obj2 = new Clase(FECHA[6], USUARIO[6]);

        int indice1 = 0;
        int indice2 = 0;

        for(int i = 0; i < USUARIO.length; i++){
            if(USUARIO[i].equals("tudela")){
                indice1 = i;
                break;
            }
        }

        for(int i = 0; i < USUARIO.length; i++){
            if(USUARIO[i].equals("arcano")){
                indice2 = i;
                break;
            }
        }

        Clase obj1 = new Clase(FECHA[indice1], USUARIO[indice1]);
        Clase obj2 = new Clase(FECHA[indice2], USUARIO[indice2]);

            System.out.println(obj1.conexionPosterior(obj2));

    }
}
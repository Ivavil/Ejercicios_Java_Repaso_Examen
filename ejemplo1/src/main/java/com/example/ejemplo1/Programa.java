package com.example.ejemplo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Programa {
    static long FECHA[]={1289001000000L , 1289002000000L , 1289004000000L ,
            1289006000000L , 1289007000000L, 1289008000000L , 128900900000L , 1289011000000L ,
            1289013000000L , 1289016000000L};
    static String USUARIO[] = {"carchimp", "tudela", "arcano", "totencar",
            "ramporo", "tudela", "arcano", "carchimp", "tudela", "totencar"};
    static long FECHA_ACTUAL = 1289025000000L;


    public static void main(String args[]) {

        List<Clase> lista_login = new ArrayList<Clase>();

        for(int i = 0; i < FECHA.length; i++){
            lista_login.add(new Clase(FECHA[i], USUARIO[i]));
        }

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

        Map<String, Long> tiempo_medio = new HashMap<String, Long>();
        Set<String> usuarios = new HashSet<String>();
        for (String nombre:
             USUARIO) {
            usuarios.add(nombre);
        }

        System.out.println(usuarios);


        List<Long> tiempos = new ArrayList<Long>();
        long media = 0;
        for (String nombre:
                usuarios) {
            for(int i = 0; i< USUARIO.length; i++){
                if(nombre.equals(USUARIO[i])){
                    tiempos.add(FECHA[i]);

                }
            }

            tiempos.add(FECHA_ACTUAL);
            for(int i = 0; i < tiempos.size() - 1;i++){
                media = tiempos.get(i + 1) - tiempos.get(i);
            }

            media = media/tiempos.size();
            tiempo_medio.put(nombre, media);
            tiempos.clear();
        }

        System.out.println(tiempo_medio);

    }
}
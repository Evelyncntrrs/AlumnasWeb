package com.example.pruebaWeb3;

import java.util.ArrayList;
import java.util.List;

public class AlumnaDAO {
   private static List<Alumna> alumnas = new ArrayList<>();


    public static List<Alumna> getAlumnas() {
        alumnas.add(new Alumna("Abril","BackEnd"));
        alumnas.add(new Alumna("Belen","FrontEnd"));
        alumnas.add(new Alumna("Carla","BackEnd"));
        alumnas.add(new Alumna("Daniela","FrontEnd"));
        alumnas.add(new Alumna("Elisa","BackEnd"));
        alumnas.add(new Alumna("Florencia","BackEnd"));

        return alumnas;
    }
}

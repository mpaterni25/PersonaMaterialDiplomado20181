package com.example.android.personasmaterialdiplomado20181;

import java.util.ArrayList;

/**
 * Created by android on 21/04/2018.
 */

public class Datos {
    public static ArrayList<Persona> personas = new ArrayList<>();

    public static void agregar(Persona p){
        personas.add(p);
    }

    public ArrayList<Persona> obtener(){
        return personas;
    }

}

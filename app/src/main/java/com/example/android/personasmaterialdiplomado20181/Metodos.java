package com.example.android.personasmaterialdiplomado20181;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by android on 21/04/2018.
 */

public class Metodos {

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }

}

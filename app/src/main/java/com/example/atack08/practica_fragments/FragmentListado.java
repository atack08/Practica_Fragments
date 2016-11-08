package com.example.atack08.practica_fragments;

import android.support.v4.app.Fragment;
import android.widget.ListView;

/**
 * Created by Atack08 on 08/11/2016.
 */

public class FragmentListado extends Fragment {

    private ListView lsListado;
    private Pelicula[] peliculas =
            new Pelicula[]{
              new Pelicula("Los chicos del maiz","West Craven",125,1998),
                    new Pelicula("La Cúpula","Stephen King",119,2005),
                    new Pelicula("Carrie","Stephen King",125,1995)};

    private PeliculasListener listener;



    //DEFINIMOS LA INTERFACE QUE HARÁ DE ESCUCHADOR
    public interface PeliculasListener{

        void onPeliculaSeleccionada(Pelicula p);
    }

    public void setPeliculasListener (PeliculasListener listener){
        this.listener = listener;
    }
}


package com.example.atack08.practica_fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){


        return inflater.inflate(R.layout.fragment_listado, container, false);

    }

    public void onActivityCreated(Bundle state){

        super.onActivityCreated(state);

        lsListado = (ListView)getView().findViewById(R.id.listado);

        //lsListado.setAdapter(new AdaptadorPeliculas(this));

    }











    //DEFINIMOS LA INTERFACE QUE HARÁ DE ESCUCHADOR
    public interface PeliculasListener{

        void onPeliculaSeleccionada(Pelicula p);
    }

    public void setPeliculasListener (PeliculasListener listener){
        this.listener = listener;
    }
}


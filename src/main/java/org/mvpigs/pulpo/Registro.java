package org.mvpigs.pulpo;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<String> eventos = new ArrayList<String>();
    private boolean pulpo;

    public void addEvento(String event)  {
        eventos.add(event);
    }
    public String contieneEvento(String searchEvento) {
        int position = eventos.indexOf(searchEvento);
        if (position >= 0) {
            return eventos.get(position);
        }

        return null;
    }
    public void mostrarRegistro() {

    }
}

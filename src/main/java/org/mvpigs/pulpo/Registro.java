package org.mvpigs.pulpo;

import java.util.ArrayList;

public class Registro {
    private ArrayList<String> eventos = new ArrayList<String>();
    private boolean pulpo;

    public Registro() {
        this.eventos = eventos;
        this.pulpo = pulpo;
    }

    public void addEvento(String event)  {
        eventos.add(event);
    }
    public String contieneEvento(String searchEvento) {
        int position = this.eventos.indexOf(searchEvento);
        if (position >= 0) {
            return this.eventos.get(position);
        }

        return null;
    }
    public void mostrarRegistro() {
        System.out.println("Tienes " + this.eventos.size() + " eventos totales");
        for (int i = 0; i < this.eventos.size(); i++) {
            System.out.println((i + 1) + "eventos: " + this.eventos.get(i) + "pulpo: " + this.pulpo);
        };
    }
}

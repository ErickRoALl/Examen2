/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaTickets;

import AdminTiket.Tickets;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaTickets {
    private ArrayList<Tickets> lista;

public ListaTickets() {
        this.lista = new ArrayList<>();
    }
    public void agregarTicket(Tickets ticket) {
        lista.add(ticket);
    }
    public boolean eliminarPorPosicion(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            lista.remove(posicion);
            return true;
        }
        return false;
    }    
    
    public boolean eliminarPorValor(Tickets ticket) {
        return lista.remove(ticket);
    }

    public ArrayList<Tickets> buscarPorTipo(char tipo) {
        ArrayList<Tickets> resultados = new ArrayList<>();
        for (Tickets ticket : lista) {
            if (ticket.getTipo() == tipo) {
                resultados.add(ticket);
            }
        }
        return resultados;
    }
    
    public void mostrarTodos() {
        for (Tickets ticket : lista) {
            ticket.mostrarInformacion();
            
        }
    }
}

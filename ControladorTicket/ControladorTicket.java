/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorTicket;

import AdminTiket.Tickets;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ControladorTicket {
     private ArrayList<Tickets> listaTickets;

    
    public ControladorTicket() {
        this.listaTickets = new ArrayList<>();
    }

    
    public void generarTicket(char tipo, double valor, String identificador) {
        Tickets nuevoTicket = new Tickets(tipo, valor, identificador);
        listaTickets.add(nuevoTicket);
        System.out.println("Ticket generado y agregado a la lista:");
        nuevoTicket.mostrarInformacion();
    }

    public void atenderTicket(char tipo) {
        Tickets ticketAAtender = null;

       
        for (Tickets ticket : listaTickets) {
            if (ticket.getTipo() == tipo) {
                ticketAAtender = ticket;
                break;
            }
        }
        
        if (ticketAAtender == null && !listaTickets.isEmpty()) {
            ticketAAtender = listaTickets.get(0); 
        }

        if (ticketAAtender != null) {
            listaTickets.remove(ticketAAtender);
            System.out.println("Ticket atendido y eliminado de la lista:");
            ticketAAtender.mostrarInformacion();
        } else {
            System.out.println("No hay tickets disponibles para atender.");
        }
    }
    public void mostrarTodos() {
        if (listaTickets.isEmpty()) {
            System.out.println("No hay tickets en la lista.");
        } else {
            for (Tickets ticket : listaTickets) {
                ticket.mostrarInformacion();
                System.out.println(); 
            }
        }
    }
}

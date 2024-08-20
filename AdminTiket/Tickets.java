/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminTiket;

/**
 *
 * @author Student
 */
public class Tickets {
    
    private char tipo ; 
    private double precio;
    private String identificador;

    
    public Tickets(char tipo, double precio, String identificador) {
        this.tipo = tipo;
        this.precio = precio;
        this.identificador = identificador;
    }

    
    public Tickets() {
        this.tipo = 'p';
        this.precio = 0.0;
        this.identificador = "Desconocido";
    }

   
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    public void mostrarInformacion() {
        String tipoString;
        switch (tipo) {
            case 'p':
                tipoString = "Plataforma";
                break;
            case 'c':
                tipoString = "Cajas";
                break;
            case 'a':
                tipoString = "Preferencial";
                break;
            default:
                tipoString = "Desconocido";
                break;
        }
        System.out.println("Identificador: " + identificador);
        System.out.println("Tipo: " + tipoString);
        System.out.println("Precio: $" + precio);
    }

    public double calcularPrecio() {
        switch (tipo) {
            case 'p':
                return 1000; 
            case 'c':
                return 1500; 
            case 'a':
                return 2000;
            default:
                return 0.0;
        }
    }
}



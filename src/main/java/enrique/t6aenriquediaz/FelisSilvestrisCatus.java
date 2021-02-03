/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.t6aenriquediaz;

import java.util.Objects;

/**
 *
 * @author Enrique
 */
public class FelisSilvestrisCatus extends Felino {

    private String color;
    private int peso;
    private boolean esCallejero;

    public FelisSilvestrisCatus(String color, int peso, boolean esCallejero, String origen, boolean esNocturno, int tamanio, String tipoAnimal, boolean esSigiloso, int subgénero, int estadoAnimal) {
        super(origen, esNocturno, tamanio, tipoAnimal, esSigiloso, subgénero, estadoAnimal);
        this.color = color;
        this.peso = peso;
        this.esCallejero = esCallejero;
    }

    public FelisSilvestrisCatus() {
        super();
        this.color = "Negro";
        this.peso = 3750;
        this.esCallejero = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEsCallejero() {
        return esCallejero;
    }

    public void setEsCallejero(boolean esCallejero) {
        this.esCallejero = esCallejero;
    }

    @Override
    public String toString() {
        return super.toString() + "FelisSilvestrisCatus{" + "color=" + color + ", peso=" + peso + ", esCallejero=" + esCallejero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + this.peso;
        hash = 67 * hash + (this.esCallejero ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FelisSilvestrisCatus other = (FelisSilvestrisCatus) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.esCallejero != other.esCallejero) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    @Override
    public void cazar(Animal e) {
        super.cazar(e);
        System.out.println("El gato doméstico se encuentra cazando");
        e.setEstadoAnimal(1);
    }
    
    public void jugarConDueño(Animal e){
        System.out.println("El gato doméstico se encuentra jugando con su dueño");
        e.setEstadoAnimal(3);
    }

}

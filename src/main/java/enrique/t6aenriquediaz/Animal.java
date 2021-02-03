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
public class Animal {

    private String tipoAnimal;
    private boolean esSigiloso;
    private int subgénero;
    private int estadoAnimal; // 1- Cazando, 2- Descansando, 3-Jugando

    public Animal(String tipoAnimal, boolean esSigiloso, int subgénero, int estadoAnimal) {

        this.tipoAnimal = tipoAnimal;
        this.esSigiloso = esSigiloso;
        this.subgénero = subgénero;
        this.estadoAnimal = estadoAnimal;
    }

    public Animal() {

        this.tipoAnimal = "Felino";
        this.esSigiloso = true;
        this.subgénero = 4;
        this.estadoAnimal = 2;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public boolean isEsSigiloso() {
        return esSigiloso;
    }

    public void setEsSigiloso(boolean esSigiloso) {
        this.esSigiloso = esSigiloso;
    }

    public int getSubgénero() {
        return subgénero;
    }

    public void setSubgénero(int subgénero) {
        this.subgénero = subgénero;
    }

    public int getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(int estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" + ", tipoAnimal=" + tipoAnimal + ", esSigiloso=" + esSigiloso + ", subg\u00e9nero=" + subgénero + ", estadoAnimal=" + estadoAnimal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;

        hash = 71 * hash + Objects.hashCode(this.tipoAnimal);
        hash = 71 * hash + (this.esSigiloso ? 1 : 0);
        hash = 71 * hash + this.subgénero;
        hash = 71 * hash + this.estadoAnimal;
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
        final Animal other = (Animal) obj;
        if (this.esSigiloso != other.esSigiloso) {
            return false;
        }
        if (this.subgénero != other.subgénero) {
            return false;
        }
        if (this.estadoAnimal != other.estadoAnimal) {
            return false;
        }
        if (!Objects.equals(this.tipoAnimal, other.tipoAnimal)) {
            return false;
        }
        return true;
    }

    public void cazar() {
        System.out.println("El animal se encuentra cazando");
        setEstadoAnimal(1);
    }

    public void descansar() {
        System.out.println("El animal se encuentra descansando");
        setEstadoAnimal(2);
    }

    public void descansar(int tiempo) {
        setEstadoAnimal(2);
        System.out.println("El animal va ha descansar durante " + tiempo + " horas");
    }

}

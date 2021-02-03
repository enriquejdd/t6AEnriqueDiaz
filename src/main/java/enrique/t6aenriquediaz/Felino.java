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
public class Felino extends Animal {

    private String origen;
    private boolean esNocturno;
    private String tamanio;

    public Felino(String origen, boolean esNocturno, String tamanio, String tipoAnimal, boolean esSigiloso, int subgénero, int estadoAnimal) {
        super(tipoAnimal, esSigiloso, subgénero, estadoAnimal);
        this.origen = origen;
        this.esNocturno = esNocturno;
        this.tamanio = tamanio;
    }

    public Felino() {
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isEsNocturno() {
        return esNocturno;
    }

    public void setEsNocturno(boolean esNocturno) {
        this.esNocturno = esNocturno;
    }

    @Override
    public String toString() {
        return super.toString() + "Felino{" + "origen=" + origen + ", esNocturno=" + esNocturno + ", tamanio=" + tamanio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.origen);
        hash = 29 * hash + (this.esNocturno ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.tamanio);
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
        final Felino other = (Felino) obj;
        if (this.esNocturno != other.esNocturno) {
            return false;
        }
        if (!Objects.equals(this.origen, other.origen)) {
            return false;
        }
        if (!Objects.equals(this.tamanio, other.tamanio)) {
            return false;
        }
        return true;
    }

    public void crecer(int tamanioACrecer) {
        if (tamanioACrecer > 0) {
            tamanio += tamanioACrecer;
            System.out.println("El peso del Felino ahora es: " + tamanio);
        }
    }

    @Override
    public void cazar(Animal e) {
        super.cazar(e);
        System.out.println("El felino se encuentra cazando");
        e.setEstadoAnimal(1);
    }

}

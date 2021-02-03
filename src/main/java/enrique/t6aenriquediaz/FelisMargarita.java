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
public class FelisMargarita extends Felino {
    private String color;
    private int peso;    
    private boolean esAlbino;

    public FelisMargarita(String color, int peso, boolean esAlbino, String origen, boolean esNocturno, int tamanio, String tipoAnimal, boolean esSigiloso, int subgénero, int estadoAnimal) {
        super(origen, esNocturno, tamanio, tipoAnimal, esSigiloso, subgénero, estadoAnimal);
        this.color = color;
        this.peso = peso;
        this.esAlbino = esAlbino;
    }

    public FelisMargarita() {
        super();
        this.color = "Arena";
        this.peso = 50;
        this.esAlbino = false;
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

    public boolean isEsAlbino() {
        return esAlbino;
    }

    public void setEsAlbino(boolean esAlbino) {
        this.esAlbino = esAlbino;
    }

    @Override
    public String toString() {
        return super.toString() + "FelisMargarita{" + "color=" + color + ", peso=" + peso + ", esAlbino=" + esAlbino + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.color);
        hash = 11 * hash + this.peso;
        hash = 11 * hash + (this.esAlbino ? 1 : 0);
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
        final FelisMargarita other = (FelisMargarita) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.esAlbino != other.esAlbino) {
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
        System.out.println("El Gato del desierto se encuentra cazando");
        e.setEstadoAnimal(1); // 1- Cazando, 2- Descansando, 3-Jugando
    }
    
    public void esperarNoche(Felino e){
        if(e.isEsNocturno()){
            System.out.println("El gato del desierto esperará hasta la noche para poder cazar más facil mente.");
            e.setEstadoAnimal(1); // 1- Cazando, 2- Descansando, 3-Jugando
        }
        else{
            e.cazar(e);
        }
        
    }
    
    @Override
    public void dormir(Animal e){
        super.dormir(e);
        System.out.println("El felino se encuentra descansando");
        e.setEstadoAnimal(2); // 1- Cazando, 2- Descansando, 3-Jugando
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.t6aenriquediaz;

/**
 *
 * @author Enrique
 */
public class FelisSilvestrisCatus extends Felino {
    String color;
    int peso;
    boolean esCallejero;

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
    
    
}

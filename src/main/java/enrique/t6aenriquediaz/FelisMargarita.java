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
public class FelisMargarita extends Felino {
    String color;
    int peso;    
    boolean esAlbino;

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
    
    
}

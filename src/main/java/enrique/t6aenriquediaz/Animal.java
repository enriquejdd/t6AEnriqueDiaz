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
public class Animal {
    String tamanio;
    String tipoAnimal;
    boolean esSigiloso;
    int subgénero;

    public Animal(String tamanio, String tipoAnimal, boolean esSigiloso, int subgénero) {
        this.tamanio = tamanio;
        this.tipoAnimal = tipoAnimal;
        this.esSigiloso = esSigiloso;
        this.subgénero = subgénero;
    }    

    public Animal() {
        this.tamanio = "Pequeño";
        this.tipoAnimal = "Felino";
        this.esSigiloso = true;
        this.subgénero = 4;
    }
    
    
    
    
    
}

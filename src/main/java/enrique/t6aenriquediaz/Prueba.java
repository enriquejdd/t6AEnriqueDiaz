/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.t6aenriquediaz;

import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class Prueba {

    public static void main(String[] args) {
        Animal a1 = new Animal("Felino", true, 7, 3);
        Animal a2 = new Animal();

        // Conversiones implícitas
        Felino f1 = new Felino("Asia", true, 130, "Catopuma temminckii", true, 7, 1);
        Felino f2 = new Felino("Europa", true, 68, "Felis chaus", true, 4, 3);
        Felino f3 = new Felino();

        FelisMargarita fm1 = new FelisMargarita("Marrón claro", 70, true, "Asia", true, 800, "Felis Margarita", true, 4, 1);
        FelisMargarita fm2 = new FelisMargarita();
        FelisMargarita fm3 = new FelisMargarita("Marrón claro atigrado", 89, true, "Asia", true, 980, "Felis Margarita", true, 4, 1);

        FelisSilvestrisCatus fsc1 = new FelisSilvestrisCatus();
        FelisSilvestrisCatus fsc2 = new FelisSilvestrisCatus("Blanco/Negro", 0, true, "Europa", false, 740, "Felis Silvestris Catus", true, 5, 3);

        System.out.println(fsc2.toString());

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        // Conversiones implícitas entre la jerarquía
        listaAnimales.add(a1);
        listaAnimales.add(f1);
        listaAnimales.add(f2);
        listaAnimales.add(f3);
        listaAnimales.add(fm1);
        listaAnimales.add(new FelisMargarita());
        listaAnimales.add(fsc1);
        listaAnimales.add(fsc2);
        listaAnimales.add(new FelisSilvestrisCatus("Naranja", 0, true, "Europa", true, 3500, "Felis Silvestris Catus", true, 5, 3));

        for (Animal aux : listaAnimales) {            
            System.out.println(aux);

            // Conversiones explícitas
            if (aux instanceof Felino) {
                ((Felino) aux).crecer(16);
            }
            if (aux instanceof FelisMargarita) {
                ((FelisMargarita) aux).esperarNoche(fm2);
            }
            if (aux instanceof FelisSilvestrisCatus) {
                ((FelisSilvestrisCatus) aux).dormir(fsc1);
            }
            aux.cazar(aux);
            System.out.println("------------------------");
        }
        
        System.out.println(listaAnimales.indexOf(fm3));
        System.out.println(listaAnimales.contains(a2));
        System.out.println(listaAnimales.remove(a2));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.util.Random;
import java.util.Scanner;



public class Principal1 {
    
    public static void main (String [] args) throws InterruptedException {
        
        Scanner Scanner = new Scanner (System.in);
        
        Jugadores Jugador1;
        Jugador1 = new Jugador1 ("Goku", "Guerrero", "Sayayin2", 100, 5, 10);
        Jugadores Jugador2 = new Jugador2 ("Vegeta", "Guerrero", "Sayayin1", 100, 6, 9);
        
        primerround(Jugador1, Jugador2);
        
    }
    
    public static void primerround(Jugadores jugadorconturno, Jugadores jugadorsinturno) throws InterruptedException{
        System.out.println("Iniciar juego");
        
        while(jugadorconturno.estaVivo() && jugadorsinturno.estaVivo()){
            jugadorconturno.atacar(jugadorsinturno);
            Jugadores aux = jugadorconturno;
            jugadorconturno = jugadorsinturno;
            jugadorsinturno = aux;
            Thread.sleep(1000);
        }
        
        if (jugadorconturno.estaVivo()){
            System.out.println(jugadorconturno.nombre + " ha ganado!");
        }
        else{
            System.out.println(jugadorsinturno.nombre + " ha ganado!");
        }
        
    }

    private static class Jugador2 extends Jugadores {

        public Jugador2(String nombre, String clase, String nivel, int vida, int minPower, int maxPower) {
            super(nombre, clase, nivel, vida, minPower, maxPower);
        }
    
    private static class Jugador1 extends Jugadores {

        public Jugador1 (String nombre, String clase, String nivel, int vida, int minPower, int maxPower) {
            super(nombre, clase, nivel, vida, minPower, maxPower);
        }

    }
    }

    private static class Jugador1 extends Jugadores {

        private Jugador1 (String goku, String guerrero, String sayayin2, int i, int i0, int i1) {
             }
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author usuario
 */
public class Jugadores {
    
    public String nombre;
    public String clase;
    public String nivel;
    public int vida;
    public int minPower;
    public int maxPower;
    private final Random random = new Random();
    
    public Jugadores (String nombre, String clase, String nivel, int vida, int minPower, int maxPower){
        
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.vida = vida;
        this.minPower = minPower;
        this.maxPower = maxPower;
    }
            
    public void atacar ( Jugadores Otrojugador) {
    
    int powerAtaque = minPower + random.nextInt(maxPower - minPower);
    
            System.out.println(this.nombre + this.clase + " ataca con " + powerAtaque + "de fuerza");
            Otrojugador.defender(powerAtaque);
}
    
    public void defender (int poderAtaque){
        
        int valorataquepostdefensa = poderAtaque;
        
        if (valorataquepostdefensa > 0) {
            this.vida -= valorataquepostdefensa;
        }
        
        if (estaVivo()){
            System.out.println(this.nombre + this.clase + " quedó con el " + this.vida + " % de vida");
        }
        else{
            System.out.println(this.nombre + " perdió!");
        }
    }
    
    public boolean estaVivo(){
        return this.vida > 0;
    }
}

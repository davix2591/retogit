package reto10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Jugador jorge = new Jugador("Jorge", "456789H", 10);

        jorge.recargarSaldo(40);
        jorge.comprarCartones(5);
        jorge.mostrarDatos();


        do {
            int n = (int)(Math.random()*50);

            jorge.comprobarNumeroCartones(n);

        }while (jorge.isGanador()!=true);







    }
}
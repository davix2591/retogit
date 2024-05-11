package reto10;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    //Atributos
    String nombre;
    String dni;
    int saldo;
    boolean ganador;

    int numCartones;//cartones que voy a comprar
    ArrayList<Carton> Cartones = new ArrayList<Carton>();


    //Metodo constructor
    public Jugador(String nombre, String dni, int saldo ){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;


        for (int i=0; i<=numCartones; i++){ //creo un bucle para generar el ArrayList compuesto de Carton, cada vuelta genero un Carton nuevo,

            Carton c = new Carton();
            Cartones.add(c);
        }
    }

    //Metodo recargar saldo
    public int recargarSaldo(int cantidad){


        if(cantidad > 0){

            saldo = saldo + cantidad;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    private void verCartones(){
        for(int i=1; i<Cartones.size(); i++){ //bucle para recorrer ArrayList<Carton> Cartones
            System.out.println("\nCarton "+i+":"); //indico que carton es
            Cartones.get(i).verNumeros(); //imprimo los numeros que contiene el carton
        }
    }

    public void mostrarDatos(){
        System.out.println("Nombre jugador: "+nombre);
        System.out.println("Saldo: "+saldo);
        verCartones();
    }

    public void comprobarNumeroCartones(int n){
        int numAciertosTotal=0;

        for (int i=0; i<Cartones.size();i++){//recorro arrayList Cartones
            Cartones.get(i).comprobarNumeros(n);//compruebo si hay match en el carton instanciado(i) pasandole el valor (n) a comprobar

            if(Cartones.get(i).getNumAciertos() >= 1){//si tengo uno o mas aciertos ...
                numAciertosTotal = Cartones.get(i).getNumAciertos(); //igualo numero de acierto Total  a los aciertos en Carton instanciado
            }
        }
        if (numAciertosTotal >=10 ){//si mi total de aciertos es igual o mayor a 10 declaro ganador
            ganador = true;
        }
        if(ganador){
            System.out.println("Carton premiado!!");
        }else {
            System.out.println("No ha tenido premio");
        }
    }

    public void comprarCartones(int cantidad){

        if((saldo-cantidad)>0){
            saldo = saldo-cantidad;
            numCartones = numCartones + cantidad;
        }
    }

    public boolean isGanador(){
        return ganador;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }








}

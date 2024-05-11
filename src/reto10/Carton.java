package reto10;

import java.util.ArrayList;

public class Carton {

    //Atributos
    private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
    private int numAciertos;


    //getter setter
    public ArrayList getListaNumeros(){
        return listaNumeros;
    }
    private void setListaNumeros(ArrayList listaNumeros){
        this.listaNumeros = listaNumeros;
    }

    public int getNumAciertos(){
        return numAciertos;
    }
    public void setNumAciertos(int numAciertos){
        this.numAciertos= numAciertos;
    }

    //Constructor
    public Carton() {
        for (int i = 0; i < 11; i++) {
            this.listaNumeros.add((int)(Math.random()*51));
        }
    }

    //Metodo comprobar numero

    public int comprobarNumeros(int n){
        for (int i= 0; i<listaNumeros.size(); i++){//recorro el ArrayList

            if (listaNumeros.get(i) == n){
                numAciertos=numAciertos+1;
            }
        }
        return numAciertos;
    }

    //Metodo ver numeros

    public void verNumeros(){
        for(int i=0; i<listaNumeros.size();i++){
            System.out.print(" "+listaNumeros.get(i));
        }
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.bebidas.model;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */

public class ModeloBebidas {
    ArrayList<Bebida> bebidas;

    public ModeloBebidas() {
        bebidas=new ArrayList<Bebida>();
        //Generamos
        Bebida b1=new Bebida("Cerveza","Tecate");
        Bebida b2=new Bebida("Cerveza","Corona");
        Bebida b3=new Bebida("cerveza","Negra modelo");
        Bebida b4=new Bebida("Whisky","Jhony walker");
        Bebida b5=new Bebida("Whisky","JB");
        Bebida b6=new Bebida("Vodka","Absolut");
        Bebida b7=new Bebida("Vodka","Absolut Mandarin");
        Bebida b8=new Bebida("Vino","Sangre de Toro");
        Bebida b9=new Bebida("Vino","Casillero del Diablo");
        Bebida b10=new Bebida("Vino","Marqués de Cáceres");
        bebidas.add(b1);
        bebidas.add(b2);
        bebidas.add(b3);
        bebidas.add(b4);
        bebidas.add(b5);
        bebidas.add(b6);
        bebidas.add(b7);
        bebidas.add(b8);
        bebidas.add(b9);
        bebidas.add(b10);
                
    }
    
    public ArrayList<Bebida> recomendacion(String tipo){
        ArrayList<Bebida> recomendadas=new ArrayList<Bebida>();
        for(Bebida b: bebidas){
            if(b.getTipo().equals(tipo))recomendadas.add(b);
        }
        
        return recomendadas;
    }
}
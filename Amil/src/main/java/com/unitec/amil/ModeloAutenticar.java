/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.amil;

public class ModeloAutenticar {
    
    public boolean autenticar(Usuario u){
        boolean autenticado = false;
        
        //Autenticamos sin base de datos
        
        if(u.getLogin().equals("Amil") && u.getPassword().equals("moco123")){
            autenticado = true;
        }
        return autenticado;
    }    
}
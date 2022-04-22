/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalempresa;

/**
 *
 * @author HP
 */
public class Empleado {
    
    String nombre;
    String cedula;
    String direccion; 
    
    
    public boolean esCedulaValida(){
        
        boolean retorno=true; 
        if(cedula.length()!=10){
            retorno=false;
        }
        return retorno;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalempresa;

/**
 *
 * @author HP
 */
public class Empresa {
    String nombre; 
    Empleado equipo;
    Departamento tipoEmpresa; 
    
    
    public boolean ganaBuenSueldo(){
       boolean retorno=true;
        if(tipoEmpresa.calcularSueldo()<400){
        retorno= false;
        }
        return retorno;
    }
    
    
    
    
}

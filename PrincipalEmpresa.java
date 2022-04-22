/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principalempresa;

/**
 *
 * @author HP
 */
public class PrincipalEmpresa {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        var emple1 = new Empleado();
        emple1.nombre="Juan Perez";
        emple1.cedula="0102187492";
        emple1.direccion="Chiquintad";
        
        var emple2 = new Empleado();
        emple2.nombre="Mariana Ochoa";
        emple2.cedula="0104197435";
        emple2.direccion="Yanuncay";
        
        var dep1= new Departamento();
        dep1.tipo="Talento Humano";
        dep1.horasTrabajadas=30;
        dep1.descripcion="Recursos humanos";
        
        var dep2= new Departamento();
        dep2.tipo="Gerencia";
        dep2.horasTrabajadas=40;
        dep2.descripcion="Recursos humanos";
        
        var emp1= new Empresa();
        emp1.nombre="Ortizco";
        emp1.equipo=emple1; 
        emp1.tipoEmpresa=dep1; 
        
        var emp2= new Empresa();
        emp2.nombre="Eljuri";
        emp2.equipo=emple2; 
        emp2.tipoEmpresa=dep2; 
        
        
        System.out.println("el empleado: "+ emp1.equipo.nombre+" ha trabajado:"
                +emp1.tipoEmpresa.horasTrabajadas+"h");
        
        
        
    }
}

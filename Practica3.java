/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica3;

/**
 *
 * @author Sebas
 */
public class Practica3 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        var prof1=new Profesor();
        prof1.nombreProf="Walter Orozco";
        prof1.edad=50;
        prof1.titulo="Phd";
        
        var prof2= new Profesor ();
        prof2.nombreProf="Cecilia Villa";
        prof2.edad=34;
        prof2.titulo="Phd";
        
        
        var asig1= new Asignatura();
        asig1.materia="Antenas";
        asig1.horario="matutina";
        asig1.numHoras=120;
        
        var asig2= new Asignatura();
        asig2.materia="Teoria de Control";
        asig2.horario="Vespertina";
        asig2.numHoras= 180;
        
        
        var carrera1=new Carrera();
        carrera1.nombre="Telecomunicaciones";
        carrera1.docente=prof1;
        carrera1.horarioDocente=asig1;
        
        var carrera2= new Carrera();
        carrera2.nombre="Electronica y Automatizacion";
        carrera2.docente=prof2;
        carrera2.horarioDocente=asig2;
        
        
        System.out.println("el docente: "+carrera1.docente.nombreProf+
        "de la materia: "+ asig1.materia+"de la carrera:"+carrera1.nombre);
    }
}

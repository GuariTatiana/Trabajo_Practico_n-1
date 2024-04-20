package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
   }
    
    public Persona() {
		// constructor por defeco
	}

    public int calcularEdad() {
        Calendar hoy = new GregorianCalendar();
        int ajuste = 0;
        if (hoy.get(Calendar.DAY_OF_YEAR) - fechaNacimiento.get(Calendar.DAY_OF_YEAR) < 0) {
            ajuste = -1;
        }
        return hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR) + ajuste;
    }

    public String calcularSignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Los meses en Calendar empiezan en 0

        String signo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        }

        return signo;
    }
    
    public String EstaciondelAño () {
    	 int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
         int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 
         String estacion="";
         
         if ((mes == 12 && dia >= 21)||(mes == 3 && dia <=20) ) {
        	 estacion = "Verano";
        } else if  (( mes ==3  && dia >= 21) || (mes == 6 && dia <= 20)) {
            estacion = "Otoño";
        } else if ((mes == 6 && dia >=21)||(mes ==9 && dia <= 20)) {
        	estacion ="Invierno";
        } else if ((mes == 9 && dia >=21)||(mes ==12 && dia <= 20)) {
        	estacion = "Primavera";
        }
         
        return estacion;
    }
       
  
    public String toString() {
        return "Nombre: " + nombre + "\nFecha de nacimiento: " + 
            fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/" + 
            (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" + 
            fechaNacimiento.get(Calendar.YEAR) + "\nEdad: " +
            calcularEdad() + " años" + "\nSigno del zodiaco: " + calcularSignoZodiaco() + "\nEstacion: "+ EstaciondelAño () ;

    }


}

package ar.edu.unju.fi.ejercicio17.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jugador {

	private String nombre;
	private String apellido;
	private Calendar fechanac;
	private String nacionalidad;
	private int estatura;
	private int peso;
	private String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugador(String nombre, Calendar fechaNacimiento,
			String apellido, String nacionalidad, int estatura,
			int peso, String posicion) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.fechanac= fechaNacimiento;
        this.setNacionalidad(nacionalidad);
        this.setEstatura(estatura);
        this.setPeso(peso);
        this.setPosicion(posicion);
   }
	
	public int calcularEdad() {
        Calendar hoy = new GregorianCalendar();
        int ajuste = 0;
        if (hoy.get(Calendar.DAY_OF_YEAR) - fechanac.get(Calendar.DAY_OF_YEAR) < 0) {
            ajuste = -1;
        }
        return hoy.get(Calendar.YEAR) - fechanac.get(Calendar.YEAR) + ajuste;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}

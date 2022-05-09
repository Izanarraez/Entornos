package Baloncesto;

import java.util.Objects;

public class NBA{
	
	protected String nombre;
	protected int edad;
	protected String nEquipo;
	protected int numCanIntroducidas;
	protected String ciudad;
	
	//constructor por defecto
	public NBA() {
	}
	
	//constructor con parametros
	public NBA(String nombre, int edad, String nEquipo, int numCanIntroducidas, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.nEquipo = nEquipo;
		this.numCanIntroducidas = numCanIntroducidas;
		this.ciudad = ciudad;
	}
	
	//getters 
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getNEquipo() {
		return nEquipo;
	}
	public int getNumCanIntroducidas() {
		return numCanIntroducidas;
	}
	public String getCiudad() {
		return ciudad;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNEquipo(String nEquipo) {
		this.nEquipo = nEquipo;
	}
	public void setNumCanIntroducidas(int numCanIntroducidas) {
		this.numCanIntroducidas = numCanIntroducidas;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int hashCode() {
		return Objects.hash(ciudad, edad, nEquipo, nombre, numCanIntroducidas);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NBA other = (NBA) obj;
		return Objects.equals(ciudad, other.ciudad) && edad == other.edad && Objects.equals(nEquipo, other.nEquipo)
				&& Objects.equals(nombre, other.nombre) && numCanIntroducidas == other.numCanIntroducidas;
	}

	public String toString() {
		return "NBA [nombre=" + nombre + ", edad=" + edad + ", nEquipo=" + nEquipo + ", numCanIntroducidas="
				+ numCanIntroducidas + ", ciudad=" + ciudad + "]";
	}
	
	public int compareTo(NBA obj) {
		return this.nombre.compareToIgnoreCase(obj.nombre);
	}
	

	
	
	
	
	

}
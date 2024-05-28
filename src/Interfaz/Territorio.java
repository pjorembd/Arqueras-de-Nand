package Interfaz;

import java.util.ArrayList;

public class Territorio {

	private boolean destruido;
	private int eRojo, eAzul, eVerde, orcos, caballeros;
	String nombre;
	
	public Territorio(String nombre, int v, int r, int a) {

		this.nombre = nombre;
		this.eVerde = v;
		this.eRojo = r;
		this.eAzul = a;		
	}

	void insertarCaballero(){
		
		caballeros++;
		
	}
	
	void restarCaballero() {
		
		this.caballeros-=1;
		
	}
	
	public boolean isDestruido() {
		return destruido;
	}

	public void Destruir() {
		
		this.destruido = true;
		
	}
	
	public int getRojo() {
		return eRojo;
	}

	public int getAzul() {
		return eAzul;
	}

	public int getVerde() {
		return eVerde;
	}

	public int getOrcos() {
		return orcos;
	}

	public int getCaballeros() {
		return caballeros;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "orcos = " + orcos + " / caballeros = " + caballeros + " / nombre =" + nombre + "\n";
	}
	
	public void setOrcos(int orcos) {
		
		this.orcos += orcos;
	
	}

	public void restarOrcos(int orcos) {
		
		this.orcos-=orcos;
		
	}
	
	void setCaballerosBatalla(int caballeros) {
		
		this.caballeros = caballeros;
		
	}
	
	void setOrcosBatalla(int orcos) {

		orcos=orcos;

	}


	
}

package org.cuatrovientos.junit;

public class Cadena {
	public Cadena() {};
	public int longitud(String cadena) {
		return cadena.length();
	}
	public int vocales(String cadena) {
		int nVocales=0;
		String vocales ="aeiou";
	
		for (int i=0 ; i<longitud(cadena);i++) {
			String caracter =String.valueOf(cadena.charAt(i));
			if (vocales.contains(caracter)){
				nVocales++;
			}
		}
		return nVocales;
	}
	public String invertir(String cadena) {
		String cadenaInvertida="";
		
		for(int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida+=cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	public int contarLetra(String cadena, char caracter) {
		int veces=0;
		
		for (int i=0; i<longitud(cadena);i++) {
			if(String.valueOf(cadena.charAt(i)).toLowerCase().equals(String.valueOf(caracter).toLowerCase())) {
				veces+=1;
			}
		
		}
		return veces;
	}
}

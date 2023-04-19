package org.cuatrovientos.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CadenaTest {


	@Test
	public void longitudTest() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.longitud("hola");
		assertEquals("Longitud de palabra hola",expected,actual,0);
	}
	@Test
	public void longitudTestEspacio() {
		Cadena target = new Cadena();
		int expected = 5;
		int actual = target.longitud("hola ");
		assertEquals("Longitud de palabra hola",expected,actual,0);
	}
	@Test
	public void vocalesTest() {
		Cadena target = new Cadena();
		int expected = 2;
		int actual = target.vocales("hola");
		assertEquals("Vocales de palabra hola",expected,actual,0);
	}
	@Test
	public void vocalesTestSin() {
		Cadena target = new Cadena();
		int expected = 1;
		int actual = target.vocales("hOla");
		assertEquals("Vocales en minuscula de palabra hOla",expected,actual,0);
	}
	@Test
	public void invertirTest() {
		Cadena target = new Cadena();
		String expected = "aloh";
		String actual = target.invertir("hola");
		assertEquals("texto invertido de hola",expected,actual);
	}
	@Test
	public void contarLetraTest() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.contarLetra("alabama",'a');
		assertEquals("veces que sale la letra a en la palabra alabama",expected,actual);
	}
	public void contarLetraMayusculasTest() {
		Cadena target = new Cadena();
		int expected = 4;
		int actual = target.contarLetra("alAbAma",'a');
		assertEquals("veces que sale la letra a en la palabra alAbAma",expected,actual);
	}
}

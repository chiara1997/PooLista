package questao9;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {


	@Test
	public void testCalculaPerimetroR() {
		Retangulo  r =new Retangulo(6,6,8,7,6,7);
		double re = 6+6+8+7;
		assertTrue(r.CalculaPerimetro()==re);
	}
	@Test
	public void testCalcularAreaR() {
		int  altura = 2;
		int base = 3;
		int  resultado = altura *base;
		Retangulo r = new Retangulo( 2, 3 );
		assertTrue( r.CalcularArea() == resultado );
	}
	@Test
	public void testCalcularAreaQ() {
		double lado=9;
		double resultado = lado*lado;
		Quadrado q = new Quadrado (9);
		assertTrue( q.CalcularArea() == resultado );
	}
	@Test
	public void testCalculaPerimetroQ() {
		Quadrado q = new  Quadrado ( 4,8,9,6,9);
		double  resultado =  4 +8 +9+6;
		assertTrue (q.CalculaPerimetro()== resultado);
	}
}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Teste {


	@Test
	public void testPonto() {
		Ponto  p = new Ponto( 8,9);
		assertTrue(p.getX()==8);
		assertTrue(p.getY()==9);
	}

	@Test
	public void testGetX() {
		Ponto  p =  new Ponto( 15,9);
		assertTrue(p.getX() ==15);
	}

	@Test
	public void testSetX() {
		Ponto p = new Ponto( 7,8);
		p.setX(7);
		assertTrue(p.getX() == 7);
	}

	@Test
	public void testGetY() {
		Ponto p =new Ponto(5,9);
		assertTrue(p.getY()==9);
		
	}

	@Test
	public void testSetY() {
		Ponto p = new Ponto(4,5);
		p.setY(5);
		assertTrue(p.getY()==5);
	}

	@Test
	public void testToString1() {
		Ponto p  = new Ponto  (6,0);
		String  mes= "X" + p.getX() + "Y"+ p.getY();
		assertEquals( p.toString(),mes);
	}

	@Test
	public void testEqualsObject() {
		Ponto  a = new Ponto ( 9, 3 );
		Ponto  b = new Ponto ( 9, 3 );
		
		assertEquals( a, b );
	}

	@Test
	public void testGetPoligono() {
		ArrayList<Ponto> pontos =new ArrayList<Ponto>();
		Ponto t = new Ponto (8,8);
		Ponto s = new Ponto (9,0);
		pontos.add(t);
		pontos.add(s);
		Poligono  poligono =new Poligono(pontos);
		assertEquals(poligono.getPoligono(), pontos);
	}

	@Test
	public void testSetPoligono() {
		ArrayList<Ponto> pontos =new ArrayList<Ponto>();
		Ponto t = new Ponto (8,8);
		Ponto s = new Ponto (9,0);
		pontos.add(t);
		pontos.add(s);
		Poligono  poligono =new Poligono();
		poligono.setPoligono(pontos);
		assertEquals(poligono.getPoligono(),pontos);
	
	}

	@Test
	public void testPoligono() {
		ArrayList<Ponto>pontos =new ArrayList<Ponto>();
		Poligono  poligono = new Poligono();
		assertEquals(poligono.getPoligono(), pontos);
	}

	@Test
	public void testPoligonoArrayListOfPonto() {
		ArrayList<Ponto> pontos =new ArrayList<Ponto>();
		Ponto t = new Ponto (8,8);
		Ponto s = new Ponto (9,0);
		pontos.add(t);
		pontos.add(s);
		Poligono  poligono =new Poligono(pontos);
		assertEquals(poligono.getPoligono(), pontos);
	}

		
	

	@Test
	public void testRemoverPol() {
		ArrayList<Ponto>pontos =new ArrayList<Ponto>();
		Ponto t =new Ponto(8,0);
		Ponto s =  new Ponto (6,4);
		Poligono poligono= new Poligono ();
		poligono.adicionarPol(t);
		poligono.adicionarPol(s);
		poligono.removerPol(s);
		pontos.add(t);
		assertEquals(poligono.getPoligono(),pontos);
		
	}

	@Test
	public void testAdicionarPol() {
		ArrayList<Ponto>pontos =new ArrayList<Ponto>();
		Ponto t =new Ponto(8,0);
		Ponto s =  new Ponto (6,4);
		Poligono poligono= new Poligono ();
		poligono.adicionarPol(t);
		poligono.adicionarPol(s);
		pontos.add(t);
		pontos.add(s);
		assertEquals(poligono.getPoligono(),pontos);
		
	}

	@Test
	public void testArea() {
		
		Ponto t=  new Ponto(3,4);
		Ponto s =new Ponto(5,7);
		Poligono poligono =new Poligono ();
		poligono.adicionarPol(t);
		poligono.adicionarPol(s);
		
		assertTrue(poligono.Area()==1);
		
	}

	@Test
	public void testToString() {
		
		Ponto t = new Ponto (6,7);
		Poligono poligono = new Poligono();
		poligono.adicionarPol(t);
		String msg="X"+ t.getX() + "Y" +t.getY() +"\n";
		assertEquals(poligono.toString(),msg);
		
	 

	}



}

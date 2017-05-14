import junit.framework.TestCase;

public class TesteArea extends TestCase {
	public void testRetangulo() {
		Retangulo  r =new  Retangulo ();
		assertTrue( r.getLargura()== 0);
		assertTrue(r.getAltura()==0);
	}

	public void testRetanguloDoubleDouble() {
		Retangulo  r =new  Retangulo (9,3);
		 assertTrue((r.getAltura() == 9) && (r.getLargura() == 3) );

	}

	public void testToString() {
		Retangulo r = new Retangulo( 9, 3 );
		String mensagem = "Altura" + r.getAltura() + "Largura" + r.getLargura();
		assertEquals( r.toString(), mensagem );
	}

	public void testEqualsObject() {

		Retangulo a = new Retangulo( 9, 3 );
		Retangulo b = new Retangulo( 9, 3 );
		
		assertEquals( a, b );
		

	}

	public void testGetAltura() {
		Retangulo r = new Retangulo( 30, 40 );
		assertTrue( r.getAltura() == 30 );

	}

	public void testGetLargura() {
		Retangulo r = new  Retangulo( 30, 40 );
		assertTrue( r.getLargura() == 40 );

	}

	public void testSetAltura() {
		Retangulo r = new Retangulo( 30, 40 );
		r.setAltura( 25 );
		assertTrue( r.getAltura() == 25 );

	}

	public void testSetLargura() {
		Retangulo r  = new Retangulo (30,40);
		r.setLargura(30);
		assertTrue (r.getLargura()==30);		
	}
	public void testCalcularArea() {
		double largura = 2;
		double altura = 3;
		double resultado = largura*altura;
		
		Retangulo r = new Retangulo( 2, 3 );
		
		assertTrue( r.CalcularArea() == resultado );
	}

	public void testCalculaPerimetro() {
		double largura  = 4;
		double altura = 3;
		double resultado = 2* (largura+altura);
		Retangulo  r = new Retangulo (4,3);
		assertTrue (r.CalculaPerimetro()== resultado);
	}


}

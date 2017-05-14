import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testPessoa(){
		Pessoa  p = new Pessoa("Priscila",12,1.89,56.9,"F");
		assertEquals(p.getNome(),"Priscila");
		assertTrue(p.getIdade()==12);
		assertTrue(p.getAltura()==1.89);
		assertTrue(p.getPeso()==56.9);
		assertEquals(p.getSexo(),"F");
	
	}

	@Test
	public void testGetNome() {
		Pessoa  p =  new Pessoa("Larissa", 34, 45.8,1.67,"F");
		assertEquals(p.getNome(),"Larissa");
	}

	@Test
	public void testSetNome() {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.9,"M");
		p.setNome("Max");
		assertEquals(p.getNome(),"Max");
		
	}

	@Test
	public void testGetIdade() {
		Pessoa p = new Pessoa( "Max",43,1.90,56.9,"M");
		assertTrue(p.getIdade()==43);
	}

	@Test
	public void testSetIdade() {
		Pessoa p = new Pessoa( "Max",43 ,56.9,1.90,"M");
		p.setIdade(43);
		assertTrue(p.getIdade()== 43);
	}

	@Test
	public void testGetAltura() {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.9,"M");
		assertTrue(p.getAltura()==1.90);
	}

	@Test
	public void testSetAltura() {
		Pessoa p = new Pessoa( "Max",43,56.9,1.90,"M");
		p.setAltura(1.90);
		assertTrue(p.getAltura() ==1.90);
		
	}

	@Test
	public void testGetPeso() {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.9,"M");
		assertTrue(p.getPeso() ==56.9);
	}

	@Test
	public void testSetPeso() {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.9,"M");
		p.setPeso(1.90);
		assertTrue(p.getPeso() ==1.90);
		
	}

	@Test
	public void testGetSexo() {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.9,"M");
		assertEquals(p.getSexo(),"M");
		
	}

	@Test
	public void testSetSexo() {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.90,"M");
		p.setSexo("M");
		assertEquals(p.getSexo(),"M");
	}

	@Test
	public void testIMC( ) {
		Pessoa p = new Pessoa( "Max",43 ,1.90,56.90,"M");
		double res = 43 / (1.90*1.90);
		   String resultado ="";
		   if( res <= 18.5){
			   resultado = "Abaixo do peso  normal";
			   
		   }else  if( res<= 18.5 && res<= 25){
			   resultado ="  Peso norma";
			   
		   }else if(res <25 &&  res <=30){
			   resultado ="Acima do peso  normal";
			   
		   }else{
			   resultado ="Obeso";
		   }
		 assertEquals ( resultado , resultado);
	}

	

}

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TesteDeTudo {

	@Test
	public void testImprimeDados() {
		Data d = new Data (14,8,1997);
		Funcionario f = new Funcionario ("Pedro", d, 1000);
		assertEquals(f.imprimeDados() ,"Os dados do Funcionario são Nome: Pedro Salario: 1000.0 Data Nascimento: 14/8/1997");	
		
		
	}
	@Test
	public void testFuncionario() {
		Data d =new Data (14,8,1997);
		Funcionario f= new Funcionario ("Pedro", d, 1000);
		assertEquals( f.getNome(),"Pedro");
		assertTrue(f.getDataNascimento() == d);
		assertTrue(f.getSalario()==1000);
		
	}
	@Test
	public void testCadastrarPessoa() {
		ArrayList<Pessoa> pessoa= new ArrayList<Pessoa>(); 
		Funcionario f =new Funcionario ("Bel",15,8,1889,1000);
		Cliente c = new Cliente ("La",15,7,1890,90);
		pessoa.add(f);
		pessoa.add(c);
		assertTrue(pessoa.add(f) );
		assertTrue(pessoa.add(c));
		
	}

	public void test() {
		Data d = new Data (14,8,1997);
		Cliente f = new  Cliente("Pedro", d, 8);
		assertTrue(f.getNome() == "Pedro");
		assertTrue(f.getDataNascimento() == d);
		assertTrue(f.getCodigo() == 8);
		
	}

	@Test
	public void testImprimeDados1(){
		Data d =new Data (14,8,1997);
		Gerente g= new  Gerente  ("Pedro ", d, 1000, "Banco");
		assertEquals(g.imprimeDados(),"Os dados do Gerente são Nome: Pedro  Salario: 1000.0 Area: Banco Data Nascimento: 14/8/1997");
	}

	@Test
	public void testCalcularImposto() {
		Data d =new Data (14,8,1997);
		Gerente g= new  Gerente  ("Pedro ", d, 1000, "Banco");
		float imposto= g.calcularImposto();
		assertTrue(g.calcularImposto()== imposto);
	}

	@Test
	public void testGerente() {
		Data d =new Data (14,8,1997);
		Gerente f= new  Gerente  ("Pedro", d, 1000, "Banco");
		assertEquals(f.getNome(),"Pedro");
		assertTrue(f.getDataNascimento() == d);
		assertTrue(f.getSalario()==1000);
		assertTrue(f.getArea() == "Banco");
		}

	@Test
	public void testSetArea() {
		Data d =new Data (14,8,1997);
		Gerente f= new  Gerente  ("Pedro ", d, 1000, "Banco");
		f.SetArea("Mercado");
		assertEquals(f.getArea(),"Mercado");
	}

	@Test
	public void testGetArea() {
		Data d =new Data (14,8,1997);
		Gerente f= new  Gerente  ("Pedro", d, 1000, "Banco");
		assertEquals(f.getArea(),"Banco");
	}

}

package aniversarios;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import aniversarios.Aniversariante;
import aniversarios.MinhaAgendaDeAniversario;

public class TesteAnive {

	@Test
	public void testAdicionarAniversariante() {
		List<Aniversariante>aniversariante = new ArrayList<Aniversariante>();
		MinhaAgendaDeAniversario d =  new MinhaAgendaDeAniversario(aniversariante);
		d.adicionarAniversariante("Paulo", 8, 5, 1994);
		d.adicionarAniversariante("Cida", 24, 2, 1998);
		assertEquals(2,d.getAniv());
	}

	@Test
	public void testObterAniversarianteDoMes() {
		List<Aniversariante>aniversariante = new ArrayList<Aniversariante>();
		MinhaAgendaDeAniversario agenda =  new MinhaAgendaDeAniversario(aniversariante);
		agenda.adicionarAniversariante("Paulo", 8, 5, 1994);
		agenda.obterAniversarianteDoMes(5);
		 assertEquals(agenda.aniversariantes.get(0).getDataAniversario().getMes(),5 );
		 assertNotEquals(agenda.aniversariantes.get(0).getDataAniversario().getMes(),7);
	
	}

	@Test
	public void testRemoverAniversariante() {
		List<Aniversariante>aniversariante = new ArrayList<Aniversariante>();
		MinhaAgendaDeAniversario d =  new MinhaAgendaDeAniversario(aniversariante);
		d.adicionarAniversariante("Paulo", 8, 5, 1994);
		d.adicionarAniversariante("Cida", 24, 2, 1998);
		d.removerAniversariante("Paulo");
		assertEquals(d.aniversariantes.get(0).getNome(),"Paulo");
		assertNotEquals(d.aniversariantes.get(1),"Cida");
	}

}

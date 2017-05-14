package aniversarios;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversario implements  AgendaDeAniversario {
	List<Aniversariante> aniversariantes;
	public  MinhaAgendaDeAniversario (List<Aniversariante> aniversariante) {
		this.aniversariantes = aniversariante;
	}

	
	public void adicionarAniversariante(String nome, int dia, int mes, int ano) {
		Aniversariante a = new Aniversariante (nome,dia,mes,ano);
			aniversariantes.add(a);
				
	}
	@Override
	public ArrayList<String> obterAniversarianteDoMes(int mes){
		ArrayList<String>aniv = new ArrayList<String>();
		for (Aniversariante ani: aniversariantes){
			if(ani.getDataAniversario().getMes()== mes){
				aniv.add(ani.getNome());
			}
		}
		return aniv;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) {
		for(Aniversariante ani: aniversariantes){
			if(ani.getNome().contains(nomeAniversariante)){
				aniversariantes.remove(nomeAniversariante);
				
			}
		}
		
	}
	public int getAniv(){
		return this.aniversariantes.size();
	}

}

package aniversarios;

import java.util.ArrayList;

public interface AgendaDeAniversario {
	public void  adicionarAniversariante(String nome ,int dia ,int mes ,int ano);
	public  ArrayList<String>obterAniversarianteDoMes(int mes);
	public void   removerAniversariante(String nomeAniversariante);

}

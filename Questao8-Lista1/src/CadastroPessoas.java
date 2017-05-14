import java.util.ArrayList;

public class CadastroPessoas {
	ArrayList<Pessoa>pessoa;
	
	public CadastroPessoas (){
		pessoa= new ArrayList<Pessoa>();
	}
	public CadastroPessoas(ArrayList<Pessoa>pessoa){
		this.pessoa=pessoa;
	}
	public void  setPessoa(ArrayList<Pessoa>p){
		this.pessoa=p;
		
	}
	public ArrayList<Pessoa>getPessoa(){
		return pessoa;
	}
	public void cadastrarPessoa( Pessoa pess){
		pessoa.add(pess);
	}
	public   void imprimiCadastro(){

		
		for( Pessoa pess : pessoa){
			if( pess instanceof Cliente){
				Cliente cli = (Cliente ) pess;
			 cli.imprimeDados();
			
			}else if( pess  instanceof Gerente){
				Gerente  gere =(Gerente) pess;
			gere.imprimeDados();
			}else{
				Funcionario fun =(Funcionario) pess;
				fun.imprimeDados();
			}
			
		}
		
	
	}
		
	}



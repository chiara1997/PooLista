
public abstract class Pessoa {
	private String  nome;
	private Data dataNascimento ;
	
	public Pessoa(String  nome , int  dia  ,int mes , int  ano){
		this.nome = nome;
		this.dataNascimento = new Data(dia, mes, ano);
	}
	
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.dataNascimento = nascimento;
	}

	public abstract String imprimeDados();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

		
	}




public class Cliente extends Pessoa {
	
	
	private int  codigo;
	
	public Cliente(String nome, int dia , int mes, int ano, int codigo) {	
		super(nome,dia,mes,ano);
		this.codigo=codigo;
	}
	
	public Cliente(String  nome, Data  nascimento ,int codigo){
		super(nome, nascimento);
		this.codigo = codigo;
	}
	
	public String imprimeDados() {
		return "Os dados do Cliente são Nome: " + getNome() + " Código: " + this.codigo + " Data Nascimento: " + getDataNascimento().toString();	
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}




	
	public class Funcionario extends Pessoa{
		
		private float salario;
		
		public Funcionario(String nome, int dia , int mes, int ano, float salario) {	
			super(nome,dia,mes,ano);
			this.salario = salario;
		}
		
		public Funcionario(String  nome, Data  nascimento ,float salario){
			super(nome, nascimento);
			this.salario = salario;
		}
		
		public String imprimeDados() {
			return "Os dados do Funcionario são Nome: " + getNome() + " Salario: " + this.salario + " Data Nascimento: " + getDataNascimento().toString();	
		}

		public float getSalario() {
			return this.salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}
		
		public float calcularImposto(){
			return (float) (this.salario*0.3);
		}

	}

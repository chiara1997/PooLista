
public class Gerente extends Funcionario {

	private String area;
	private float salario;
	
	public Gerente(String nome, int dia , int mes, int ano, float salario, String area) {
		super(nome, dia, mes, ano, salario);
		this.area = area;
		this.salario = salario;
	}
	
	public Gerente(String nome, Data data, float salario, String area) {
		super( nome, data, salario);
		this.area = area;
		this.salario = salario;
	}
	
	public void SetArea(String area){
		this.area = area;
	}
	
	public String getArea(){
		return this.area;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String imprimeDados() {
		return "Os dados do Gerente são Nome: " + getNome() + " Salario: " + this.salario + " Area: " + this.area + " Data Nascimento: " + getDataNascimento().toString();	
	}
	
	public float calcularImposto(){
		return (float) (getSalario()*0.5);
	}
	
}

	

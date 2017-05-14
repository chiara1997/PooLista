
public class Pessoa {
	private String  nome ;
	private  int  idade ;
	private  double  altura ;
	private  double  peso;
	private String sexo;
	
	 public Pessoa( String nome ,int  idade ,double  altura  ,double peso ,String  sexo){
		this.nome=nome;
		this.idade=idade;
		this.altura=altura;
		this.peso=peso;
		this.sexo=sexo;
	 }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	  public String IMC(double peso , double altura){
		  double res = peso / (altura*altura);
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
		  return resultado;
	  }
	   public String toString (){
		   return "Nome" + this.nome + this.IMC(peso, altura);
	   }
}

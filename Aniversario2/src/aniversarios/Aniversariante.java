package aniversarios;

public class Aniversariante {
	private  String  nome ;
	private DataAniversario dataAniversario;
	
	
	public Aniversariante ( String nome , int diaA ,int mesA ,int anoA){
		this.nome=nome;
		dataAniversario = new DataAniversario( diaA ,mesA, anoA);
	
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	public boolean AniversarianteDoMes( int mes){
	if(dataAniversario.getMes()== mes ){
		return true;
	}
	return false;
}

}

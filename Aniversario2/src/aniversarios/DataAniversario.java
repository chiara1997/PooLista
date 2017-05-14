package aniversarios;

public class DataAniversario {

	private  int dia;
	private  int mes ;
	private int ano;
	
public DataAniversario( int dia ,int mes ,int ano){
	this.dia =dia;
	this.mes=mes;
	this.ano=ano;

}

public  int getDia(){
	return this.dia;
}
public int getMes(){
	return this.mes;
}
public int getAno(){
	return this.ano;
}
public boolean equals(Object obj){
	if( obj == null){
		return false;
	}else if( obj instanceof  DataAniversario){
		DataAniversario data = ( DataAniversario) obj;
		if(this.dia == data.getDia() && this.mes ==data.getMes() && this.ano == data.ano)
			return true ;
	}
	return false;
	}
}

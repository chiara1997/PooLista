package questao9;

public class Retangulo extends  Quadrilatero {
	
	private double   base ;
	private double   altura;
	
	public Retangulo (double   base ,double altura )
	{
		this.setAltura(altura);
		this.setBase(base);
	}

	public Retangulo(double   lado1, double   lado2, double   lado3, double  lado4,double   base ,double altura) {
		super(lado1, lado2, lado3, lado4);
		this.base=base;
		this.altura=altura;
	}

	
	public double CalculaPerimetro() {
		double Pe	=this.lado1+this.lado2+ this.lado3 +this.lado4;
		return Pe;
		 		
	}
	  public double CalcularArea(){
		  double  bas = base* altura;
		  return bas;
          
  }
	public double  getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double   getAltura() {
		return altura;
	}

	public void setAltura(double  altura) {
		this.altura = altura;
	}
public String toString(){
	return "Base"+ this.base+"Altura"+this.altura;
}


}

package questao9;

public class Quadrado  extends Quadrilatero{
	 private  double    lado;
		public Quadrado(double   lado1, double  lado2, double  lado3,  double  lado4, double lado) {
			super(lado1, lado2, lado3, lado4);
			this.lado=lado;		
		}
		public Quadrado(double   lado){
		  this.setLado(lado);
		  
		}

		public double CalcularArea() {
		 double p =lado*lado;
		 return p;
		}

		public double  CalculaPerimetro() {
			double Pe	=this.lado1+this.lado2+ this.lado3 +this.lado4;
			return  Pe;
			
		}
		public void setLado( double  lado){
		 this.lado=lado;
			
		}
		public double  getLado(){
			 return this.lado;
			
		}
	public String toString(){
		return "Lado"+this.lado;
	}

	}

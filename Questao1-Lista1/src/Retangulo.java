
public class Retangulo {
	private double  altura;
	private double  largura;

	
	public Retangulo (){
		this.largura =0;
		this.altura =0;
		
		
	}
	public Retangulo(double altura ,double largura){
		this.largura=largura;
		this.altura=altura;
		
	}
	public String toString(){
		return "Altura" + this.altura + "Largura" + this.largura;
		
	}
	public boolean  equals (Object  obj){
		if  (obj ==null){
			return false;
		}else if(obj instanceof Retangulo){
				Retangulo q =( Retangulo) obj;
				if(q.altura==this.altura)		
					return true;
				else if(q.largura == this.largura)
						return true;
				}
				return false;
				
			}
		
	public double   getAltura(){
			return this.altura;
			
		}
	public double  getLargura(){
		return this.largura;
	}
	public void setAltura(double  altu){
		this.altura=altu;
		
	}
	public void setLargura( double  larg){
		this.largura=larg;
	}
	public double CalcularArea() {
		
		return largura*altura;
	}
	public double CalculaPerimetro() {
		
		return 2*(largura+altura);
	
	}
}
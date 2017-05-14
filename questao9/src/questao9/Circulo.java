package questao9;

public class Circulo  extends Quadrilatero {
	private double raio;
	
	public Circulo (double raio){
		this.setRaio(raio);

}
	public double CalculaPerimetro() {
	double   p = 2*(3.14 *raio);
	 return p;
		
	}
	public double  CalcularArea(){
		double area = Math.PI*(raio*raio);
       return area;
}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
 public  String  toString(){
	 return "Lado" + this.raio;
 }

}

package questao9;

public  abstract class Quadrilatero implements  FiguraGeometrica{
	double   lado1;
	double  lado2;
	double  lado3;
	double  lado4; 
	
    public Quadrilatero(double    lado1, double    lado2, double   lado3, double  lado4) { 
            this.lado1 = lado1; 
            this.lado2 = lado2; 
            this.lado3 = lado3; 
            this.lado4 = lado4; 
    } 
    
    public Quadrilatero(){
    	this.lado1=lado1;
    	this.lado2=lado2;
    	this.lado3=lado3;
    	this.lado4=lado4;
    	
    	
    }
    public  double  CalcularArea(){
		return lado1;
            
    }
    public double  CalcularPerimetro(){
		return lado1;
    
    }

}
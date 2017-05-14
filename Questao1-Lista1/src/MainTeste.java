
public class MainTeste {

	public static void main(String[] args) {
		Retangulo [] ret = new Retangulo [2];
		
		
		Retangulo a1=   new Retangulo ( 5,9);
		Retangulo a2 = new Retangulo (7,8);
		
		 
		ret[0]=a1;
		ret[1]=a2;
		
		for( int k=0; k< ret.length;k++){
			 
				 System.out.println(ret[k]);
					 System.out.println("Os valores das  Areas são "+ ret[k].CalcularArea());
					 System.out.println("Os valores do Perimetro sao:" + ret[k].CalculaPerimetro());
		
	}
	
	

}
}

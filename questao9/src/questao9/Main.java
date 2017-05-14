package questao9;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica [] area =  new FiguraGeometrica[6];
		  
		FiguraGeometrica a1 = new Quadrado( 4,8,9,6,9);
		FiguraGeometrica a2 =new Retangulo(6,6,8,7,6,7);
		FiguraGeometrica a3 =new Circulo (8);
		FiguraGeometrica a4= new Circulo (7);
		FiguraGeometrica a5 =new Quadrado (6,9,9,5,4);
		FiguraGeometrica  a6 =new Retangulo (8,8,3,7,5,7);
		 area[0]=a1;
		 area[1]=a2;
		 area[2]=a3;
		 area[3]=a4;
		 area[4]=a5;
		 area[5]=a6;
		 
		 for( int k=0; k< area.length;k++){
			 if(area[k] != null){
				 System.out.println(area[k]);
					 System.out.println("A area é" + area[k].CalcularArea());
					 System.out.println("Os valores do Perimetro sao:" + area[k].CalculaPerimetro());
		
		 }else{
			 break;
		 }
		
	}

}

}

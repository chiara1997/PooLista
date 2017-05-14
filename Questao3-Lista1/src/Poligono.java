import java.util.ArrayList;

public class Poligono {
	private ArrayList<Ponto> poligono;

	public ArrayList<Ponto> getPoligono() {
		return poligono;
	}

	public void setPoligono(ArrayList<Ponto> poligono) {
		this.poligono = poligono;
	
	}
	public Poligono(){
		poligono= new ArrayList<Ponto>();
	}
	 public Poligono  ( ArrayList<Ponto>poligono){
		 this.poligono=poligono;
	 }
	 
	 public  void removerPol( Ponto p){
	for(int k =0 ; k< poligono.size();k++){
			 if(poligono.get(k).equals(p)){
				 poligono.remove(p);
			
			 }
			 
		 }
	 }
	 public void adicionarPol(Ponto p){
			 if(poligono.contains(p) == false){
				 poligono.add(p);			 
			 }
		 }
	 
	 public float Area(){
			 float soma=0; 
			 for (int k = 0; k < poligono.size() - 1; k++) {
				 soma += (poligono.get(k).getX() * poligono.get(k+1).getY()) - (poligono.get(k + 1).getX() * poligono.get(k).getY());
			 }

			 return (soma); 

			 } 
	 
	
		
	 public String toString() {
			String pontos = "";
			for (int k = 0; k < poligono.size(); k++) {
				pontos += poligono.get(k).toString() + "\n";
			}
			return pontos;
}
		 }
	 






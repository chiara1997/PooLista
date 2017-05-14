
public class Ponto {
	 private   float x;
	 private  float  y;
	 
	 
	public Ponto( float x, float y){
		this.x=x;
		this.y=y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public  String  toString(){
		return "X" + this.x + "Y"+ this.y;
		
	}
	public boolean equals( Object obj){
		if(obj== null)
		return false;
	else  if(obj  instanceof Ponto){
		Ponto q =  (Ponto ) obj;
		if( q.x == this.x && q.y == this.y) 
			return true;
	}
	return false;	
	}
}

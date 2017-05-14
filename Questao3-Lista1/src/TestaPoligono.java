import javax.swing.JOptionPane;

public class TestaPoligono {
	

		public static void main(String[] args) {
		Poligono  poligonos = new Poligono();
		int  quant =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite  quantos ponto?"));
			
			for(int k=0; k<quant ;k++){
				float x =Float.parseFloat(JOptionPane.showInputDialog("Digite a coordenada x:"));
				float y=  Float.parseFloat(JOptionPane.showInputDialog("Digite a coordenada y:"));
				Ponto p = new Ponto(x,y);
				poligonos.adicionarPol(p);
				
		}
			System.out.println("A area  é" + poligonos.Area());
		}
	}


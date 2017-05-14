import javax.swing.JOptionPane;

public class MainTeste {

	public static void main(String[] args) {
		Pessoa  [] p = new Pessoa  [2]; 
	
		 for( int k=0; k< p.length;k++){
			 String nome =JOptionPane.showInputDialog("Qual o nome ");
			 int idade =Integer.parseInt(JOptionPane.showInputDialog("Qual  a idade"));
			 String sexo =JOptionPane.showInputDialog("Qual o  sexo");
			 double  altura =Double.parseDouble(JOptionPane.showInputDialog("Qual a  altura?"));
			 double  peso =Double.parseDouble(JOptionPane.showInputDialog("Qual o peso?"));
			 Pessoa   a1 = new  Pessoa ( nome ,idade,peso,altura,sexo);
			 String  IMC= a1.IMC(peso, altura);
			 System.out.println("Esses são os dado  "+ a1 + "  o IMC são "+ IMC);
			
		 
	}
	
		
	}

}
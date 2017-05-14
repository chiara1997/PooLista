
public class TesteMain {

	public static void main(String[] args) {
		Cliente  clieA =new Cliente  ("Carla", 12,8,1993,90);
		Cliente  clieB = new Cliente  ("Sandra ",56,34,1890,89);
		Cliente  clienC =new Cliente ("Rosa",78,90,189,102);
		
		Gerente  gere3 =new Gerente ( "Clara",34,78,189,90,"lazer");
		Gerente g10=new Gerente ("d",48,90,290,90,"piscina");
		Gerente ge007 =new Gerente("h",89,98,18939,87,"sinuca");
		gere3.calcularImposto();
		g10.calcularImposto();
		ge007.calcularImposto();
		
		
		Funcionario f1= new Funcionario ("Pedro",89,90,1990,1000);
		Funcionario  f2 =new Funcionario(" Laleska",24,67,90,183939);
		Funcionario  f3 =new Funcionario("Noiva",838,90,17,1000);
		f1.calcularImposto();
		f2.calcularImposto();
		f3.calcularImposto();
		
		
		CadastroPessoas p = new  CadastroPessoas();
		p.cadastrarPessoa(clieA);
		p.cadastrarPessoa(clieB);
		p.cadastrarPessoa(clienC);
		
		p.cadastrarPessoa(gere3);
		p.cadastrarPessoa(g10);
		p.cadastrarPessoa(ge007);
		
		p.cadastrarPessoa(f1);
		p.cadastrarPessoa(f2);
		p.cadastrarPessoa(f3);
		
		p.imprimiCadastro();
		}
}

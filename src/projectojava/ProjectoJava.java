package projectojava;

public class ProjectoJava {

	public static void main(String[] args) {
		ContaBanco p1= new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("jubileu");
		p1.abrirConta("cc");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Neuza");
		p2.abrirConta("cp");
		
		ContaBanco p3 = new ContaBanco();
	    p3.setNumConta(3333);
		p3.setDono("Ricardo");
		
		
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.sacar(200);
	    p1.fecharConta();
	   
		
		p1.estadoAtual();
		p2.estadoAtual();
		p3.estadoAtual();
	}

}

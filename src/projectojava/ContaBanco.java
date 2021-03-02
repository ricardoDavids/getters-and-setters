package projectojava;

public class ContaBanco {

	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		
		System.out.println("----------------------");
		System.out.println("Conta:" + this.getNumConta());
		System.out.println("Tipo da Conta: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: "+ this.isStatus());
	}
	
	
	
	
	
	
	// Métodos Personalizados
	
	public void abrirConta(String t) { // Aqui o "t" será o tipo de conta que vai receber
		this.setTipo(t);       // Se é conta corrente ou conta poupança, de forma a entrar no atributo tipo
		this.setStatus(true); // Aqui vou ter que habilitar o status, se é verdadeiro porque a conta esta aberta
		
		// Agora terei que verificar se o tipo é cc ou cp
		
		if (t == "cc") {
			this.setSaldo(50);
			
		}else if(t== "cp") {
			this.setSaldo(150);
			}
		System.out.println("Conta aberta com sucesso!");
         }
	
	
	
	
	
	
	
	public void fecharConta() {
		
		if (this.getSaldo() >0) {
			System.out.println("Não posso fechar a conta com saldo positivo, pois tem dinheiro"); // Não posso fechar a conta com saldo positivo
			
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");    //Naõ posso fechar a conta com saldo negativo
			
		}else {
			this.setStatus(false); // Aqui quer dizer que a conta foi fechada com sucesso
		}
		
		System.out.println("Conta foi fechada com sucesso"); // quando o saldo = 0
	}
	
	
	
	
	
	public void depositar(double valor) { // Se o status estiver ativo irei depositar dinheiro
		
		if (this.isStatus()) {
			
			this.setSaldo(this.getSaldo() + valor); // Aqui o saldo recebe o saldo mais o valor porque na hora de depoistar recebi uma variavel chamada valor
			System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
		}else {
			System.out.println("Impossivel depositar em uma conta fechada"); // Se o status não for verdadeiro
		}
	
	}
	
	
	
	
	/*Neste metodo tambem vou verificar se o estado é verdadeiro, eu tenho que ver se tenho saldo na conta.
	  A conta pode estar activa, mas eu posso querer sacar 1000reais mas a conta só tem 500 reais e sendo assim nao poderei sacar */
	
	public void sacar(double valor) { // tambem recebe um valor
		
		if (this.isStatus()) { // Comparar o saldo que estava antes e o que está depois, terei que ver se tenho saldo na conta para sacar aquilo que pretendo
			
			if(this.getSaldo() >= valor){ // o sinal de igual quer dizer se tenho 1000reais e quero sacar 1000 reais eu poderei mas ficarei com a conta =0
				this.setSaldo(this.getSaldo() -valor);
				System.out.println("Saque realizado com sucesso na conta do " + this.getDono());
			}
			
			// Este else abaixo é do 1º If se a conta não está ativa
			else {
				System.out.println("Saldo da conta insufeciente para poder sacar");
			}
			
					
		}
		
		else {
			System.out.println("Impossivel sacar de uma conta fechada!");
	        
		}
		
	}
	
	
	
	
	public void pagarMensalidade() {
		int valMens= 0; // variavel local --> valor da mensalidade
		
		if (this.getTipo() == "cc") {
			
			valMens=12;
			
		} else if(this.getTipo() == "cp"){ 
			valMens = 20;
			
		}
		if(this.isStatus()) {  // Aqui se o status for verdadeiro
			
			 
				this.setSaldo(this.getSaldo()-valMens);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
				
			}else {
				System.out.println(" Impossivel pagar com conta fechada");
			}
		}
			
		
	
	
	
	
	
	// Métodos Especiais
	
	// Constructor
	
	public ContaBanco() {
		this.saldo=0;            // 
		//this.status=false;  // Se o status é falso é porque a conta não está aberta;
		
		
	}
	
	
	
	
	
	// Get and Set
	
	
	public void setNumConta(int n) { // o n vai ser o novo numero da conta
		this.numConta = n;
		
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	
	
	
	
	public void setTipo(String t) { // o t irá receber um tipo de conta corrente ou conta poupança
		this.tipo= t;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	
	
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	
	
	
	
	public void setSaldo(double s) {
		this.saldo= s;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	
	
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	public boolean isStatus() {
		return this.status;
	}
	
	
	
	
	
	
	
	
}

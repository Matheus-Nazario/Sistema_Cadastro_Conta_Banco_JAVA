package contaBanco;

class Estru_contaBanco {
	
	// Atríbutos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//método persolinazdo
	
	public void estadoAtual() {
		
		System.out.println(">>>>>>Estado Ataul da Conta<<<<<<");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: R$"+ this.getSaldo());
		System.out.println("Status: " + this.isStatus());
		
	}
	
	//metodo construtor
	
	public Estru_contaBanco() {
		
		this.setSaldo(0.00);
		this.setStatus(false);
		
	}
	
	// metodos especiais GET e SET
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	//
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	//
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//
	
	public void abrirConta(String tp) {
		
		setStatus(true);
		setTipo(tp);
		if( tp == "cc") {
			
			setSaldo(50.00);
			
		}
		
		if( tp == "cp") {
			
			setSaldo(100.00);
			
		} else {
			System.out.println("Inesistente");
		}
		
	}
	
	public void fecharConta() {
		
		if( getSaldo() > 0 ) {
			System.out.println("A Conta tem money....");
		}
		
		if(getSaldo() < 0 ) {
			System.out.println("A Conta está em débito....");
		}
		
		else {
			
			setStatus(false);
		
		}
			
	}
	
	public void depositar(double valor) {
		
		if( isStatus() == true ) {
			
			setSaldo( getSaldo() + valor);

		}
		else {
			System.out.println("Impossivel depositar");
		}
		
	}
	
	public void sacar(double valor) {
		
		if( isStatus() == true) {
			if(getSaldo() >= valor) {
				
			setSaldo( getSaldo() - valor);
			
			} else {
			System.out.println("Não tem saldo suficiente");
			}
		}else {
			System.out.println("Conta fechada");
		}
	} 
	
	public void pagarMensal() {
		
		double val = 0;
		
		if( getTipo() == "cc") {
			
			val = 12.00;
			
		}
		
		if( getTipo() == "cp") {
			
			val = 20.00;

		}
		if (isStatus() == true) {
			
			if( getSaldo() > val ) {
				
				setSaldo( getSaldo() - val);
				
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel pagar");
		}

	}	
	
	
}





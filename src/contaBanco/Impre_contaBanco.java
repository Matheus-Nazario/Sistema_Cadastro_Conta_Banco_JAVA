package contaBanco;

class Impre_contaBanco {

	public static void main(String[] args) {
		
		Estru_contaBanco pessoa1 = new Estru_contaBanco();
		
		pessoa1.setNumConta(999999);
		pessoa1.setDono("Matheus Nazário" );
		pessoa1.abrirConta("cc");
		
		Estru_contaBanco pessoa2 = new Estru_contaBanco();
				
		pessoa2.setNumConta(77777);
		pessoa2.setDono("Marcello Nazário" );
		pessoa2.abrirConta("cp");
		
		pessoa1.depositar(50.00);
		pessoa2.depositar(100.00);
		
		
		pessoa1.estadoAtual();
		pessoa2.estadoAtual();
		
		

	}

}

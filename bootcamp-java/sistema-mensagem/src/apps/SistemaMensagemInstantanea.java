package apps;

public abstract class SistemaMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// somente filhos acessam este método
	protected void validarConexao() {
		System.out.println("Validando conexão com a internet...");
	}

}
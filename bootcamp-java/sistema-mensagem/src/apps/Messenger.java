package apps;

public class Messenger extends SistemaMensagemInstantanea {
	
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Messenger...");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Messenger...");
	}

}

import apps.Facebook;
import apps.Messenger;
import apps.SistemaMensagemInstantanea;
import apps.Telegram;

public class Computador {

	public static void main(String[] args) {
		
		SistemaMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if (appEscolhido.equals("msn"))
			smi = new Messenger();
		else if (appEscolhido.equals("facebook"))
			smi = new Facebook();
		else if (appEscolhido.equals("telegram"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}

}
import java.util.Scanner;

public class LiberarAcesso{
	private String chaveSecreta;
	
	LiberarAcesso(){
		this.setChaveSecreta("admin");
	}
	
	LiberarAcesso(String chave){
		this.setChaveSecreta(chave);
	}
	
	public void setChaveSecreta(String chave){
		this.chaveSecreta = chave;
	}
	
	public String getChaveSecreta(){
		return this.chaveSecreta;
	}
	
	public boolean compara(LiberarAcesso liberarAcesso){
		boolean result = false;
		if (liberarAcesso != null && this.getChaveSecreta().equals(liberarAcesso.getChaveSecreta())){
				result = true;
		}
		return result;
	}
	
	public void imprimeAcesso(LiberarAcesso liberarAcesso){
		if (this.compara(liberarAcesso)){
			System.out.println("$$$ Acesso Liberado, chave: {admin} $$$");
		}
		
		System.out.println("Fim do programa");
	}
	
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		String chave = leitor.nextLine();
		leitor.close();

		LiberarAcesso liberarAcessoAdmin = new LiberarAcesso();
		LiberarAcesso liberarAcessoEntrada = new LiberarAcesso(chave);

		liberarAcessoAdmin.imprimeAcesso(liberarAcessoEntrada);

	}
}
import java.util.Scanner;

public class Impressao{
	private String nome;
	
	public static void main(String[] args){
		Impressao impressao = new Impressao();
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
        scanner.close();
		impressao.setNome(nome);
		impressao.imprimeNome();
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void imprimeNome(){
		System.out.print(getNome());
	}
	
}
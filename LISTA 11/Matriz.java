import java.util.Scanner;

public class Matriz{
	private int ordem;
	private int[][] mat;
	
	Matriz(int ordem){
		this.setOrdem(ordem);
		mat = new int[this.getOrdem()][this.getOrdem()];
	}
	
	public int getOrdem(){
		return this.ordem;
	}
	
	public void setOrdem(int ordem){
		this.ordem = ordem;
	}
	
	public int getElemento(int indexLinha, int indexColuna){
		return this.mat[indexLinha][indexColuna];
	}
	
	public void setElemento(int indexLinha, int indexColuna, int novoValor){
		this.mat[indexLinha][indexColuna] = novoValor;
	}
	
	public int somaValores(){
		int soma = 0;
		int contColuna;
		int contLinha;
		for(contLinha = 0; contLinha < this.getOrdem(); contLinha++){
			for(contColuna = 0; contColuna < this.getOrdem(); contColuna++){
				soma = soma + this.getElemento(contLinha,contColuna);
			}
		}
		return soma;
	}
	
	public void imprime(){
		int contColuna;
		int contLinha;
		System.out.println("Matriz");
		for(contLinha = 0; contLinha < this.getOrdem(); contLinha++){
			for(contColuna = 0; contColuna < this.getOrdem(); contColuna++){
				System.out.print(this.getElemento(contLinha,contColuna) + " ");
			}
			System.out.println();	
		}
		System.out.printf("Soma: %d", this.somaValores());	
	}

	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordem = scanner.nextInt();
        Matriz matriz = new Matriz(ordem);

        for (int i = 0; i < matriz.getOrdem(); i++) {
            for (int j = 0; j < matriz.getOrdem(); j++) {
                matriz.setElemento(i, j, scanner.nextInt());
            }
        }

        matriz.imprime();
        scanner.close();
    }

}


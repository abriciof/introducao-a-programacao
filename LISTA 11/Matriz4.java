import java.util.Scanner;

public class Matriz{
	private int linhas;
	private int colunas;
	private int[][] mat;

	Matriz(int linhas, int colunas){
		this.setLinhas(linhas);
		this.setColunas(colunas);
		mat = new int[this.getLinhas()][this.getColunas()];
	}
	
	public int getLinhas(){
		return this.linhas;
	}
	
	public void setLinhas(int novoTam){
		this.linhas = novoTam;
	}
	
	public int getColunas(){
		return this.colunas;
	}
	
	public void setColunas(int novoTam){
		this.colunas = novoTam;
	}
	
	public int getElemento(int indexLinha, int indexColuna){
		return this.mat[indexLinha][indexColuna];
	}
	
	public void setElemento(int indexLinha, int indexColuna, int novoValor){
		this.mat[indexLinha][indexColuna] = novoValor;
	}
	
	public static boolean ehPrimo(int numero) {
		boolean resultado = true;
        if (numero <= 1) {
            resultado = false;
        }
        for (int i = 2; i*i <= numero; i++) {
            if (numero % i == 0) {
                resultado = false;
            }
        }
        return resultado;
    }
	
	public void somaPrimos(){
		int soma = 0;
		for(int contLinha = 0; contLinha < this.getLinhas(); contLinha++){
			for(int contColuna = 0; contColuna < this.getColunas(); contColuna++){
            if (this.ehPrimo( this.getElemento(contLinha, contColuna) )) {
					soma = soma + this.getElemento(contLinha, contColuna);
				}
			}
		}

        System.out.printf("Soma Primos: %d\n", soma);
	}
	
	public void imprimeMatriz(){
		System.out.println("Matriz");

		for(int contLinha = 0; contLinha < this.getLinhas(); contLinha++){
			for(int contColuna = 0; contColuna < this.getColunas(); contColuna++){
				System.out.print(this.getElemento(contLinha,contColuna) + " ");
			}
			System.out.println();	
		}
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lin = scanner.nextInt();
        int col = scanner.nextInt();
        Matriz matriz = new Matriz(lin, col);

        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                matriz.setElemento(i, j, scanner.nextInt());
            }
        }

		 matriz.imprimeMatriz();
		 matriz.somaPrimos();
       scanner.close();
    }


}


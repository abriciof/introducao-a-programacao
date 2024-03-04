import java.util.Scanner;
public class Matriz
{
	private int mat[][];
	private int qtLinhas;
	private int qtColunas;
	Matriz(int linhas, int colunas)
	{
		this.setQtLinhas(linhas);
		this.setQtColunas(colunas);
		mat = new int[this.getQtLinhas()][this.getQtColunas()];
	}
	public int getQtLinhas()
	{
		return this.qtLinhas;
	}
	public int getQtColunas()
	{
		return this.qtColunas;
	}
	public void setQtLinhas(int num)
	{
		this.qtLinhas = num;
	}
	public void setQtColunas(int num)
	{
		this.qtColunas = num;
	}
	public int getElemento(int indexLinha, int indexColuna)
	{
		return this.mat[indexLinha][indexColuna];
	}
	public void setElemento(int indexLinha, int indexColuna, int num)
	{
		this.mat[indexLinha][indexColuna] = num;
	}
	public void imprimeMatriz()
	{
		System.out.println("Matriz");
		for(int i = 0; i < this.getQtLinhas(); i++)
		{
			for(int j = 0; j < this.getQtColunas(); j++)
			{
				System.out.print(this.getElemento(i, j) + " ");
			}
			System.out.println();
		}
	}
	public void buscaRepetidos()
	{
		boolean resultado = false;
		for(int i = 0; i < this.getQtLinhas(); i++)
		{
			for(int j = 0; j < this.getQtColunas(); j++)
			{
				int elementoAtual = this.getElemento(i, j);
				for(int k = 0; k < this.getQtLinhas(); k++)
				{
					for(int l = 0; l < this.getQtColunas(); l++)
					{
						if(k != i || l != j)
						{
							if(elementoAtual == this.getElemento(k, l))
							{
								resultado = true;
							}
						}
					}
				}
			}
		}
		if(resultado)
		{
			System.out.println("Tem elementos repetidos!!");
		}
		else
		{
			System.out.println("Nao tem elementos repetidos!!");
		}
	}
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int linha = leitor.nextInt();
		int coluna = leitor.nextInt();
		Matriz matriz = new Matriz(linha, coluna);
		for(int i = 0; i < matriz.getQtLinhas(); i++)
		{
			for(int j = 0; j < matriz.getQtColunas(); j++)
			{
				matriz.setElemento(i, j, leitor.nextInt());
			}
		}
		//matriz.buscaRepetidos(); 
		matriz.imprimeMatriz();
		matriz.buscaRepetidos();
		leitor.close();
	}
}
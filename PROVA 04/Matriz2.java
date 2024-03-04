import java.util.Scanner;
class Vetor
{
	private int tamanho;
	private int[] vet;
	Vetor()
	{
		this.setTamanho(3);
		vet = new int[this.getTamanho()];
	}
	public void setTamanho(int novoTamanho)
	{
		this.tamanho = novoTamanho;
	}
	public void setElemento(int index, int valor)
	{
		this.vet[index] = valor;
	}
	public int getTamanho()
	{
		return this.tamanho;
	}
	public int getElemento(int index)
	{
		return this.vet[index];
	}
}
public class Matriz
{
	private int qtLinhas;
	private int qtColunas;
	private int mat[][];
	Matriz()
	{
		this.setQtLinhas(3);
		this.setQtColunas(3);
		mat = new int[this.getQtLinhas()][this.getQtColunas()];
	}
	public void setQtLinhas(int num)
	{
		this.qtLinhas = num;
	}
	public void setQtColunas(int num)
	{
		this.qtColunas = num;
	}
	public void setElemento(int indexLinha, int indexColuna, int num)
	{
		this.mat[indexLinha][indexColuna] = num;
	}
	public int getElemento(int indexLinha, int indexColuna)
	{
		return this.mat[indexLinha][indexColuna];
	}
	public int getQtLinhas()
	{
		return this.qtLinhas;
	}
	public int getQtColunas()
	{
		return this.qtColunas;
	}
	public int VerificarLinha(Vetor vetor)
	{
		int cont_achou = 0;
		int pivo_linha = 0;
		int linha_resultado = -1;
		while((linha_resultado == -1) && (pivo_linha < this.getQtLinhas()))
		{
			cont_achou = 0;
			for(int pivo_coluna = 0; pivo_coluna < this.getQtColunas(); pivo_coluna++)
			{
				if(vetor.getElemento(pivo_coluna) == this.getElemento(pivo_linha, pivo_coluna))
				{
					cont_achou++;
				}
			}
			if(cont_achou == this.getQtColunas())
			{
				linha_resultado = pivo_linha;
			}
			pivo_linha++;
		}
		return linha_resultado;
	}
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		Matriz matriz = new Matriz();
		Vetor vetor = new Vetor();
		for(int i = 0; i < matriz.getQtLinhas(); i++)
		{
			for(int j = 0; j < matriz.getQtColunas(); j++)
			{
				matriz.setElemento(i, j, leitor.nextInt());
			}
		}
		for(int k = 0; k < vetor.getTamanho(); k++)
		{
			vetor.setElemento(k, leitor.nextInt());
		}
		System.out.print(matriz.VerificarLinha(vetor));
		leitor.close();
	}
}
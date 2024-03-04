import java.util.Scanner;
public class Vetor
{
	private int tamanho;
	private int[] vet;
	Vetor()
	{
		this.setTamanho(11);
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
	public int mediana()
	{
		int menores, maiores, alvo;
		int resultado = this.getElemento(this.getTamanho() / 2);
		for(int i = 0; i < this.getTamanho(); i++)
		{
			menores = 0;
			maiores = 0;
			alvo = this.getElemento(i);
			for(int j = 0; j < this.getTamanho(); j++)
			{
				if(j != i)
				{
					if(this.getElemento(j) < alvo)
					{
						menores++;
					}
					else
					{
						maiores++;
					}
				}
			}
			if(maiores == this.getTamanho() / 2 && menores == this.getTamanho() / 2)
			{
				resultado = alvo;
			}
		}
		return resultado;
	}
	public void imprime()
	{
		for(int i = 0; i < this.getTamanho(); i++)
		{
			System.out.printf("%d ", this.getElemento(i));
		}
	}
	public static void main(String[] args)
	{
		Vetor vetor = new Vetor();
		Scanner leitor = new Scanner(System.in);
		for(int i = 0; i < vetor.getTamanho(); i++)
		{
			vetor.setElemento(i, leitor.nextInt());
		}
		System.out.println(vetor.mediana());
		vetor.imprime();
	}
}
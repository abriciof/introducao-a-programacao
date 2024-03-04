import java.util.Scanner;
public class Vetor
{
	private int tamanho;
	private int[] vet;
	Vetor()
	{
		this.setTamanho(10);
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
	public void imprimeProdutoEscalar(Vetor vetor2)
	{
		int i;
		int produtoEscalar = 0;
		for(i = 0; i < this.getTamanho(); i++)
		{
			produtoEscalar += this.getElemento(i) * vetor2.getElemento(i);
		}
		System.out.println(produtoEscalar);
	}
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		Vetor vetor1 = new Vetor();
		Vetor vetor2 = new Vetor();
		int aux;
		for(int i = 0; i < vetor1.getTamanho(); i++)
		{
			aux = leitor.nextInt();
			vetor1.setElemento(i, aux);
		}
		for(int i = 0; i < vetor2.getTamanho(); i++)
		{
			aux = leitor.nextInt();
			vetor2.setElemento(i, aux);
		}
		leitor.close();
		vetor2.imprimeProdutoEscalar(vetor1);
	}
}
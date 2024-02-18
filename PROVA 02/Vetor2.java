import java.util.Scanner;
public class Vetor
{
    private int[] vet;
    private int tamanho;
    Vetor()
    {
        this.setTamanho(10);
        vet = new int[this.getTamanho()];
    }
    Vetor(int novoTamanho)
    {
        this.setTamanho(novoTamanho);
        vet = new int[this.getTamanho()];
    }
    public int getTamanho()
    {
        return this.tamanho;
    }
    public int getElemento(int index)
    {
        return this.vet[index];
    }
    public void setTamanho(int novoTamanho)
    {
        this.tamanho = novoTamanho;
    }
    public void setElemento(int index, int valor)
    {
        this.vet[index] = valor;
    }
    public void imprimeProdutoEscalar(Vetor vet2)
    {
        int i;
        int produtoEscalar = 0;
        for(i = 0; i < this.getTamanho(); i++)
        {
            produtoEscalar = produtoEscalar + this.getElemento(i) * vet2.getElemento(i);
        }
        System.out.println(produtoEscalar);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vet1 = new Vetor(10);
        Vetor vet2 = new Vetor(10);
        int i, aux;
        for(i = 0; i < vet1.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vet1.setElemento(i, aux);
        }
        for(i = 0; i < vet2.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vet2.setElemento(i, aux);
        }
        vet2.imprimeProdutoEscalar(vet1);
    }
}
import java.util.Scanner;
public class Vetor
{
    private int tamanho;
    private int[] vet;
    Vetor()
    {
        this.setTamanho(5);
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
    public void imprimeMaiorQueValor(int valor)
    {
        int i;
        for(i = 0; i < this.getTamanho(); i++)
        {
            if(this.getElemento(i) > valor)
            {
                System.out.println(this.getElemento(i));
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vet = new Vetor(5);
        int i, aux, V;
        for(i = 0; i < vet.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vet.setElemento(i, aux);
        }
        V = leitor.nextInt();
        vet.imprimeMaiorQueValor(V);
    }
}
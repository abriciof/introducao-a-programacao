import java.util.Scanner;
public class Vetor
{
    private int tamanho;
    private int[] vet;
    Vetor()
    {
        this.setTamanho(6);
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
    public void ordemDescrecente()
    {
        int temp;
        for(int i = 0; i < this.getTamanho(); i++)
        {
            for(int j = 0; j < this.getTamanho(); j++)
            {
                if(this.getElemento(i) > this.getElemento(j))
                {
                    temp = this.getElemento(i);
                    this.setElemento(i, this.getElemento(j));
                    this.setElemento(j, temp);
                }
            }
        }
    }
    public void imprimeOrdemDecrescente()
    {
        this.ordemDescrecente();
        for(int i = 0; i < this.getTamanho(); i++)
        {
            System.out.println(this.getElemento(i));
        }
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vetor = new Vetor();
        int aux;
        for(int i = 0; i < vetor.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vetor.setElemento(i, aux);
        }
        leitor.close();
        vetor.imprimeOrdemDecrescente();
    }
}
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
    public boolean isPrimo(int index)
    {
        boolean resultado;
        int i, cont;
        cont = 0;
        for(i = 1; i <= this.getElemento(index); i++)
        {
            if(this.getElemento(index) % i == 0)
            {
                cont++;
            }
        }
        if(cont == 2)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }
    public void somaOsPrimos()
    {
        int i;
        int soma = 0;
        for(i = 0; i < this.getTamanho(); i++)
        {
            if(this.isPrimo(i))
            {
                soma = soma + this.getElemento(i);
            }
        }
        System.out.println(soma);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vet = new Vetor(10);
        int i, aux;
        for(i = 0; i < vet.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vet.setElemento(i, aux);
        }
        vet.somaOsPrimos();
    }
}
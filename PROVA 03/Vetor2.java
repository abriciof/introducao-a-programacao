import java.util.Scanner;
public class Vetor
{
    private int tamanho;
    private int[] vet;
    Vetor()
    {
        this.setTamanho(7);
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
    public boolean ehPrimo(int index)
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
    public void imprimePrimeiroPrimo()
    {
        int i = 0;
        boolean achou = false;
        while(i < this.getTamanho() && !achou)
        {
            if(this.ehPrimo(i))
            {
                achou = true;
            }
            i++;
        }
        if(achou)
        {
            System.out.println(this.getElemento(i - 1));
        }
        else
        {
            System.out.println(-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vet = new Vetor();
        int aux;
        for(int i = 0; i < vet.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vet.setElemento(i, aux);
        }
        leitor.close();
        vet.imprimePrimeiroPrimo();
    }
}
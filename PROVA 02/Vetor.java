import java.util.Scanner;
public class Vetor
{
    private int[] vet;
    private int tamanho;
    Vetor()
    {
        this.setTamanho(7);
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
    public void setTamanho(int novoTamanho)
    {
        this.tamanho = novoTamanho;
    }
    public int getElemento(int index)
    {
        return this.vet[index];
    }
    public void setElemento(int index, int novoValor)
    {
        this.vet[index] = novoValor;
    }
    public void DoisMaiores()
    {
        int cont, priMaior, segMaior;
        if(this.getElemento(0) > this.getElemento(1))
        {
            priMaior = this.getElemento(0);
            segMaior = this.getElemento(1);
        }
        else
        {
            priMaior = this.getElemento(1);
            segMaior = this.getElemento(0);
        }
        for(cont = 0; cont < this.getTamanho(); cont++)
        {
            if(this.getElemento(cont) > priMaior)
            {
                segMaior = priMaior;
                priMaior = this.getElemento(cont);
            }
            else if(this.getElemento(cont) != priMaior && this.getElemento(cont) > segMaior)
            {
                segMaior = this.getElemento(cont);
            }
        }
        System.out.printf("%d\n%d", priMaior, segMaior);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vetor = new Vetor(7);
        int cont, aux;
        for(cont = 0; cont < vetor.getTamanho(); cont++)
        {
            aux = leitor.nextInt();
            vetor.setElemento(cont, aux);
        }
        vetor.DoisMaiores();
    }
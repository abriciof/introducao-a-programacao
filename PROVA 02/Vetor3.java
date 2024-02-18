import java.util.Scanner;
public class Vetor
{
    private int tamanho;
    private int[] vet;
    Vetor()
    {
        this.setTamanho(15);
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
    public void imprimeEnderecoMaiorMenor()
    {
        int i, maior, menor, indexMaior, indexMenor;
        maior = this.getElemento(0);
        menor = this.getElemento(0);
        indexMaior = 0;
        indexMenor = 0;
        for(i = 1; i < this.getTamanho(); i++)
        {
            if(this.getElemento(i) > maior)
            {
                maior = this.getElemento(i);
                indexMaior = i;
            }
            if(this.getElemento(i) < menor)
            {
                menor = this.getElemento(i);
                indexMenor = i;
            }
        }
        System.out.printf("maior: %d\n", indexMaior);
        System.out.printf("menor: %d", indexMenor);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Vetor vet = new Vetor(15);
        int i, aux;
        for(i = 0; i < vet.getTamanho(); i++)
        {
            aux = leitor.nextInt();
            vet.setElemento(i, aux);
        }
        vet.imprimeEnderecoMaiorMenor();
    }
}
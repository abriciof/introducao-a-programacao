import java.util.Scanner;
public class Vetor
{
    private int dimensao;
    private int[] vet;
    Vetor(int novaDimensao)
    {
        this.setDimensao(novaDimensao);
        vet = new int[this.getDimensao()];
    }
    public int getDimensao()
    {
        return this.dimensao;
    }
    public int getElemento(int index)
    {
        return this.vet[index];
    }
    public void setElemento(int index, int valor)
    {
        this.vet[index] = valor;
    }
    public void setDimensao(int novaDimensao)
    {
        this.dimensao = novaDimensao;
    }
    public int buscarMenor()
    {
        int i;
        int menor = this.getElemento(0);
        int indexMenor = 0;
        for(i = 1; i < this.getDimensao(); i++)
        {
            if(this.getElemento(i) < menor)
            {
                menor = this.getElemento(i);
                indexMenor = i;
            }
        }
        return indexMenor;
    }
    public int buscarMaior()
    {
        int i;
        int maior = this.getElemento(0);
        int indexMaior = 0;
        for(i = 1; i < this.getDimensao(); i++)
        {
            if(this.getElemento(i) > maior)
            {
                maior = this.getElemento(i);
                indexMaior = i;
            }
        }
        return indexMaior;
    }
    public void trocaMaiorMenor()
    {
        int indexMaior = this.buscarMaior();
        int indexMenor = this.buscarMenor();
        int aux = this.getElemento(indexMaior);
        this.setElemento(indexMaior, this.getElemento(indexMenor));
        this.setElemento(indexMenor, aux);
    }
    public void imprime()
    {
        int i;
        for(i = 0; i < this.getDimensao(); i++)
        {
            System.out.print(this.getElemento(i));
            if(i < (this.getDimensao() - 1))
            {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int dimensao = leitor.nextInt();
        Vetor vet = new Vetor(dimensao);
        int i, aux;
        for(i = 0; i < vet.getDimensao(); i++)
        {
            aux = leitor.nextInt();
            vet.setElemento(i, aux);
        }
        vet.trocaMaiorMenor();
        vet.imprime();
    }
}
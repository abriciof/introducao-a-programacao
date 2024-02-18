import java.util.Scanner;
public class Ponto
{
    private int numA;
    private int numB;
    Ponto(int A, int B)
    {
        this.setNumA(A);
        this.setNumB(B);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        scanner.close();
        Ponto ponto = new Ponto(numA, numB);
        ponto.imprimeResultado();
    }
    public void setNumA(int numero)
    {
        this.numA = numero;
    }
    public void setNumB(int numero)
    {
        this.numB = numero;
    }
    public int getNumA()
    {
        return this.numA;
    }
    public int getNumB()
    {
        return this.numB;
    }
    public void imprimeResultado()
    {
        if(2 * this.getNumA() + this.getNumB() == 3)
        {
            System.out.printf("%d e %d fazem parte da reta", this.getNumA(), this.getNumB());
        }
        else
        {
            System.out.printf("%d e %d nao fazem parte da reta", this.getNumA(), this.getNumB());
        }
    }
}
import java.util.Scanner;
public class Menoral
{
    private int numA;
    private int numB;
    private int numC;
    Menoral(int A, int B, int C)
    {
        this.setNumA(A);
        this.setNumB(B);
        this.setNumC(C);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        scanner.close();
        Menoral menoral = new Menoral(numA, numB, numC);
        menoral.imprimeResultado();
    }
    public void setNumA(int numero)
    {
        this.numA = numero;
    }
    public void setNumB(int numero)
    {
        this.numB = numero;
    }
    public void setNumC(int numero)
    {
        this.numC = numero;
    }
    public int getNumA()
    {
        return this.numA;
    }
    public int getNumB()
    {
        return this.numB;
    }
    public int getNumC()
    {
        return this.numC;
    }
    public int menor()
    {
        int resultado;
        if(this.getNumA() < this.getNumB() && this.getNumA() < this.getNumC())
        {
            resultado = this.getNumA();
        }
        else if(this.getNumB() < this.getNumA() && this.getNumB() < this.getNumC())
        {
            resultado = this.getNumB();
        }
        else
        {
            resultado = this.getNumC();
        }
        return resultado;
    }
    public void imprimeResultado()
    {
        System.out.printf("O Menor numero eh: %d", this.menor());
    }
}
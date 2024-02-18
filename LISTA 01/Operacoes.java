import java.util.Scanner;
public class Operacoes
{
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    Operacoes(int A, int B, int C, int D)
    {
        this.setNumA(A);
        this.setNumB(B);
        this.setNumC(C);
        this.setNumD(D);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();
        scanner.close();
        Operacoes operacoes = new Operacoes(numA, numB, numC, numD);
        operacoes.imprimeResultado();
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
    public void setNumD(int numero)
    {
        this.numD = numero;
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
    public int getNumD()
    {
        return this.numD;
    }
    public int multAB()
    {
        return this.getNumA() * this.getNumB();
    }
    public int subCD()
    {
        return this.getNumC() - this.getNumD();
    }
    public int resultado()
    {
        return this.multAB() + this.subCD();
    }
    public void imprimeResultado()
    {
        System.out.print(this.resultado());
    }
}
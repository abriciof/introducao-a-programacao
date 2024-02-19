import java.util.Scanner;
public class Fibonacci
{
    private int num;
    Fibonacci()
    {}
    Fibonacci(int numero)
    {
        this.setNum(numero);
    }
    public void setNum(int numero)
    {
        this.num = numero;
    }
    public int getNum()
    {
        return this.num;
    }
    public int fibo(int n)
    {
        int resultado;
        if(n <= 1)
        {
            resultado = n;
        }
        else
        {
            resultado = this.fibo(n - 1) + this.fibo(n - 2);
        }
        // System.out.println(resultado);
        return resultado;
    }
    public void calculaImprime(int entrada)
    {
        int resultado = this.fibo(entrada);
        this.setNum(resultado);
        System.out.println(this.getNum());
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        leitor.close();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.calculaImprime(entrada);
    }
}
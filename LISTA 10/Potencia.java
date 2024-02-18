import java.util.Scanner;
public class Potencia
{
    private int num;
    Potencia()
    {}
    Potencia(int num)
    {
        this.setNum(num);
    }
    public void setNum(int numero)
    {
        this.num = numero;
    }
    public int getNum()
    {
        return this.num;
    }
    public int pot(int base, int expoente)
    {
        int resultado = 0;
        if(expoente == 0)
        {
            resultado = 1;
        }
        else if(expoente > 0)
        {
            resultado = base * this.pot(base, expoente - 1);
        }
        else
        {
            resultado = 1 / this.pot(base, -expoente);
        }
        // System.out.println(resultado);
        return resultado;
    }
    public void calculaImprime(int base, int expoente)
    {
        int resultado = this.pot(base, expoente);
        this.setNum(resultado);
        System.out.println(this.getNum());
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int expoente = scanner.nextInt();
        Potencia potencia = new Potencia();
        potencia.calculaImprime(base, expoente);
    }
}
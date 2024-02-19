import java.util.Scanner;
public class Fatorial
{
    private int num;
    Fatorial(int numero)
    {
        this.setNum(numero);
    }
    public int getNum()
    {
        return this.num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    public void imprimeCalcula()
    {
        int resultado = this.calculoFatorialRecursivo(this.getNum());
        this.setNum(resultado);
        System.out.println(this.getNum());
    }
    public int calculoFatorialRecursivo(int numero)
    {
        int resultado;
        if((numero == 1) || (numero == 0))
        {
            resultado = 1;
        }
        else
        {
            resultado = this.calculoFatorialRecursivo(numero - 1) * numero;
        }
        // System.out.println(resultado);
        return resultado;
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        leitor.close();
        if(entrada < 0)
        {
            System.out.println("numero invalido");
        }
        else
        {
            Fatorial fatorial = new Fatorial(entrada);
            fatorial.imprimeCalcula();
        }
    }
}
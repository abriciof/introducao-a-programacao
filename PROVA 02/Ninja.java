import java.util.Scanner;
public class Ninja
{
    private int copias;
    Ninja(int novoCopias)
    {
        this.setCopias(novoCopias);
    }
    public int getCopias()
    {
        return this.copias;
    }
    public void setCopias(int novoCopias)
    {
        this.copias = novoCopias;
    }
    public int quantidadeDeUso()
    {
        int resultado = this.getCopias();
        int potencia = 0;
        while(resultado > 1)
        {
            resultado = resultado / 2;
            potencia = potencia + 1;
        }
        return potencia;
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        while(entrada != 0)
        {
            Ninja ninja = new Ninja(entrada);
            System.out.println(ninja.quantidadeDeUso());
            entrada = leitor.nextInt();
        }
    }
}
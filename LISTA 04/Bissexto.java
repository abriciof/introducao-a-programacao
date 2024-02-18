import java.util.Scanner;
public class Bissexto
{
    private int ano;
    Bissexto(int a)
    {
        this.setAno(a);
    }
    public void setAno(int a)
    {
        this.ano = a;
    }
    public int getAno()
    {
        return this.ano;
    }
    public void verifica()
    {
        if((this.getAno() % 400 == 0) || ((this.getAno() % 4 == 0) && !(this.getAno() % 100 == 0)))
        {
            System.out.println("Esse ano promete!! uhuuu");
        }
        else
        {
            System.out.println("Nao vai ser esse ano meu nobre :(");
        }
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        leitor.close();
        Bissexto bissexto = new Bissexto(a);
        bissexto.verifica();
    }
}
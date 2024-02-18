import java.util.Scanner;
public class Eleitor
{
    private int idade;
    Eleitor()
    {
        this.setIdade(0);
    }
    Eleitor(int novaIdade)
    {
        this.setIdade(novaIdade);
    }
    public int getIdade()
    {
        return this.idade;
    }
    public void setIdade(int novaIdade)
    {
        this.idade = novaIdade;
    }
    public void classeEleitoral()
    {
        String resultado = "";
        if(this.getIdade() < 16)
        {
            resultado = "nao votante";
        }
        else if((this.getIdade() >= 18) && (this.getIdade() <= 65))
        {
            resultado = "eleitor obrigatorio";
        }
        else
        {
            resultado = "eleitor facultativo";
        }
        System.out.println(resultado);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        Eleitor eleitor = new Eleitor(idade);
        eleitor.classeEleitoral();
    }
}
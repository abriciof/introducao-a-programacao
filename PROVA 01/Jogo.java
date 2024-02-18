import java.util.Scanner;
public class Jogo
{
    private int numDescoberto;
    private int numTentativa;
    Jogo(int numDescoberto, int numTentativa)
    {
        this.setNumDescoberto(numDescoberto);
        this.setNumTentativa(numTentativa);
    }
    public int getNumDescoberto()
    {
        return this.numDescoberto;
    }
    public int getNumTentativa()
    {
        return this.numTentativa;
    }
    public void setNumDescoberto(int numDescoberto)
    {
        this.numDescoberto = numDescoberto;
    }
    public void setNumTentativa(int numTentativa)
    {
        this.numTentativa = numTentativa;
    }
    public void verifica()
    {
        String resultado;
        if(this.getNumTentativa() < this.getNumDescoberto())
        {
            resultado = "menor";
        }
        else if(this.getNumTentativa() > this.getNumDescoberto())
        {
            resultado = "maior";
        }
        else
        {
            resultado = "igual";
        }
        System.out.println(resultado);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int ND = leitor.nextInt();
        int NT = leitor.nextInt();
        leitor.close();
        Jogo jogo = new Jogo(ND, NT);
        jogo.verifica();
    }
}
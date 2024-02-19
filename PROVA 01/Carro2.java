import java.util.Scanner;
public class Carro2
{
    private int ano;
    private float valor;
    Carro2(int ano, float valor)
    {
        this.setAno(ano);
        this.setValor(valor);
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    public void setValor(float valor)
    {
        this.valor = valor;
    }
    public int getAno()
    {
        return this.ano;
    }
    public float getValor()
    {
        return this.valor;
    }
    public void calculaTaxa()
    {
        float taxa;
        float imposto;
        if(this.getAno() >= 1990)
        {
            taxa = 0.015f;
        }
        else
        {
            taxa = 0.01f;
        }
        imposto = taxa * this.getValor();
        System.out.printf("%.2f", imposto);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int AF = leitor.nextInt();
        float V = leitor.nextFloat();
        leitor.close();
        Carro2 carro = new Carro2(AF, V);
        carro.calculaTaxa();
    }
}
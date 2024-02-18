import java.util.Scanner;
public class Tartaruga
{
    private float tamanhoAtual;
    private float taxaCrescimento;
    Tartaruga(float tamanhoAtual, float taxaCrescimento)
    {
        this.setTamanhoAtual(tamanhoAtual);
        this.setTaxaCrescimento(taxaCrescimento);
    }
    Tartaruga()
    {
        this.setTamanhoAtual(0);
        this.setTaxaCrescimento(0);
    }
    public float getTamanhoAtual()
    {
        return this.tamanhoAtual;
    }
    public void setTamanhoAtual(float novoTamanhoAtual)
    {
        this.tamanhoAtual = novoTamanhoAtual;
    }
    public float getTaxaCrescimento()
    {
        return this.taxaCrescimento;
    }
    public void setTaxaCrescimento(float novaTaxaCrescimento)
    {
        this.taxaCrescimento = novaTaxaCrescimento;
    }
    public void imprimaTempo(Tartaruga tart)
    {
        float diferencaDistancia = this.getTamanhoAtual() - tart.getTamanhoAtual();
        float diferencaTaxa = tart.getTaxaCrescimento() - this.getTaxaCrescimento();
        float tempo = diferencaDistancia / diferencaTaxa;
        System.out.printf("%.2f", tempo);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        float ta1, ta2, tc1, tc2;
        ta1 = leitor.nextFloat();
        tc1 = leitor.nextFloat();
        ta2 = leitor.nextFloat();
        tc2 = leitor.nextFloat();
        Tartaruga tart1 = new Tartaruga(ta1, tc1);
        Tartaruga tart2 = new Tartaruga(ta2, tc2);
        tart1.imprimaTempo(tart2);
    }
}
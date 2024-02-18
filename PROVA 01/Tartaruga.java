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
    public float getTamanhoAtual()
    {
        return this.tamanhoAtual;
    }
    public void setTamanhoAtual(float tamanhoAtual)
    {
        this.tamanhoAtual = tamanhoAtual;
    }
    public float getTaxaCrescimento()
    {
        return this.taxaCrescimento;
    }
    public void setTaxaCrescimento(float taxaCrescimento)
    {
        this.taxaCrescimento = taxaCrescimento;
    }
    public void calculaTempo(Tartaruga tart)
    {
        float distanciaDiff = this.getTamanhoAtual() - tart.getTamanhoAtual();
        float taxaCrescimentoDiff = tart.getTaxaCrescimento() - this.getTaxaCrescimento();
        float tempo = distanciaDiff / taxaCrescimentoDiff;
        System.out.printf("%.2f", tempo);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        float ta1 = leitor.nextFloat();
        float tc1 = leitor.nextFloat();
        float ta2 = leitor.nextFloat();
        float tc2 = leitor.nextFloat();
        leitor.close();
        Tartaruga tart1 = new Tartaruga(ta1, tc1);
        Tartaruga tart2 = new Tartaruga(ta2, tc2);
        tart1.calculaTempo(tart2);
    }
}
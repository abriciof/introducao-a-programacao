import java.util.Scanner;
public class LigaAcoInox
{
    private double aco;
    private double cromo;
    private double niquel;
    LigaAcoInox(double aco)
    {
        this.setAco(aco);
    }
    public double getAco()
    {
        return this.aco;
    }
    public double getCromo()
    {
        return this.cromo;
    }
    public double getNiquel()
    {
        return this.niquel;
    }
    public void setAco(double aco)
    {
        this.aco = aco;
    }
    public void setCromo(double cromo)
    {
        this.cromo = cromo;
    }
    public void setNiquel(double niquel)
    {
        this.niquel = niquel;
    }
    public void calculaNiveis()
    {
        double total = (100.0 * this.getAco()) / 74.0;
        this.setCromo(total * 0.18);
        this.setNiquel(total * 0.08);
        System.out.printf("%.2f\n", this.getCromo());
        System.out.printf("%.2f", this.getNiquel());
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        double AP = leitor.nextDouble();
        leitor.close();
        LigaAcoInox ligaAco = new LigaAcoInox(AP);
        ligaAco.calculaNiveis();
    }
}
import java.util.Scanner;
public class Juros
{
	private double deposito;
	private int meses;
	Juros(double novoDeposito, int novoMeses)
	{
		this.setDeposito(novoDeposito);
		this.setMeses(novoMeses);
	}
	public double getDeposito()
	{
		return this.deposito;
	}
	public int getMeses()
	{
		return this.meses;
	}
	public void setDeposito(double novoDeposito)
	{
		this.deposito = novoDeposito;
	}
	public void setMeses(int novoMeses)
	{
		this.meses = novoMeses;
	}
	public void imprimeTotal()
	{
		double total = this.getDeposito();
		for(int i = 0; i < this.getMeses(); i++)
		{
			total += total * 0.012;
			System.out.printf("\n%.2f", total);
		}
	}
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		double deposito = leitor.nextDouble();
		int meses = leitor.nextInt();
		Juros juros = new Juros(deposito, meses);
		juros.imprimeTotal();
		leitor.close();
	}
} 

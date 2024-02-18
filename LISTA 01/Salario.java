import java.util.Scanner;
public class Salario
{
    private float valorHoras;
    private int horas;
    public static void main(String[] args)
    {
        Salario salario = new Salario();
        Scanner scanner = new Scanner(System.in);
        float valorHoras = scanner.nextFloat();
        int horas = scanner.nextInt();
        scanner.close();
        salario.setValorHoras(valorHoras);
        salario.setHoras(horas);
        salario.imprimeSalario();
    }
    public void setValorHoras(float numero)
    {
        this.valorHoras = numero;
    }
    public void setHoras(int numero)
    {
        this.horas = numero;
    }
    public float getValorHoras()
    {
        return this.valorHoras;
    }
    public int getHoras()
    {
        return this.horas;
    }
    public void imprimeSalario()
    {
        float salario = getValorHoras() * getHoras();
        System.out.printf("O total do salario eh: %.2f", salario);
    }
}
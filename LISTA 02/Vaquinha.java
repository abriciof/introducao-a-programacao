import java.util.Scanner;
public class Vaquinha
{
    private float num;
    public static void main(String[] args)
    {
        Vaquinha vaquinha = new Vaquinha();
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        scanner.close();
        vaquinha.setNum(num);
        vaquinha.imprimeValor();
    }
    public void setNum(float numero)
    {
        this.num = numero;
    }
    public float getNum()
    {
        return this.num;
    }
    public void imprimeValor()
    {
        float valor = getNum() / 4;
        System.out.printf("%.2f", valor);
    }
}
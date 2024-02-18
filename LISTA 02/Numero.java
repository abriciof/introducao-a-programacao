import java.util.Scanner;
public class Numero
{
    private int num;
    Numero(int num)
    {
        this.setNum(num);
    }
    Numero()
    {}
    public void setNum(int numero)
    {
        this.num = numero;
    }
    public int getNum()
    {
        return this.num;
    }
    public void imprimeAntecessor()
    {
        int antecessor = getNum() - 1;
        System.out.println("Antecessor: " + antecessor);
    }
    public void imprimeSucessor()
    {
        int sucessor = getNum() + 1;
        System.out.println("Sucessor: " + sucessor);
    }
    public void imprimeNumero()
    {
        System.out.println("Numero: " + getNum());
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Numero numero = new Numero(num);
        scanner.close();
        numero.imprimeNumero();
        numero.imprimeAntecessor();
        numero.imprimeSucessor();
    }
}
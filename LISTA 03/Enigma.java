import java.util.Scanner;
public class Enigma
{
    private int x;
    private int y;
    Enigma(int n1, int n2)
    {
        this.setX(n1);
        this.setY(n2);
    }
    public int getX()
    {
        return this.x;
    }
    public void setX(int n)
    {
        this.x = n;
    }
    public int getY()
    {
        return this.y;
    }
    public void setY(int n)
    {
        this.y = n;
    }
    public void decifra()
    {
        if((this.getX() + this.getY()) == 42)
        {
            System.out.printf("A soma de %d e %d eh equivalente ao enigma do universo 42\n", this.getX(), this.getY());
        }
        System.out.printf("System Down");
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        leitor.close();
        Enigma enigma = new Enigma(n1, n2);
        enigma.decifra();
    }
}
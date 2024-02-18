import java.util.Scanner;
public class Multiplos
{
    private int x;
    private int y;
    Multiplos(int n1, int n2)
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
    public void verificaNum()
    {
        if(this.getX() > this.getY())
        {
            if(this.getX() % this.getY() == 0)
            {
                System.out.printf("Numero %d eh multiplo de %d\n", this.getX(), this.getY());
            }
        }
        else
        {
            if(this.getY() % this.getX() == 0)
            {
                System.out.printf("Numero %d eh multiplo de %d\n", this.getY(), this.getX());
            }
        }
        System.out.printf("The last mission is over");
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        leitor.close();
        Multiplos mult = new Multiplos(n1, n2);
        mult.verificaNum();
    }
}
import java.util.Scanner;
public class Maior
{
    private int numX;
    private int numY;
    Maior()
    {}
    Maior(int x, int y)
    {
        this.setNumX(x);
        this.setNumY(y);
    }
    public void setNumX(int x)
    {
        this.numX = x;
    }
    public void setNumY(int y)
    {
        this.numY = y;
    }
    public int getNumX()
    {
        return this.numX;
    }
    public int getNumY()
    {
        return this.numY;
    }
    public void compara()
    {
        if(this.getNumX() < this.getNumY())
        {
            System.out.printf("Numero %d eh inferior ao numero %d", this.getNumX(), this.getNumY());
        }
        else
        {
            System.out.printf("Numero %d eh inferior ao numero %d", this.getNumY(), this.getNumX());
        }
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        leitor.close();
        Maior maior = new Maior(x, y);
        maior.compara();
    }
}
import java.util.Scanner;
public class Media
{
    private float numA;
    private float numB;
    private float numC;
    public static void main(String[] args)
    {
        Media media = new Media();
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        scanner.close();
        media.setNumA(A);
        media.setNumB(B);
        media.setNumC(C);
        media.verifica();
    }
    public void setNumA(float numero)
    {
        this.numA = numero;
    }
    public void setNumB(float numero)
    {
        this.numB = numero;
    }
    public void setNumC(float numero)
    {
        this.numC = numero;
    }
    public float getNumA()
    {
        return this.numA;
    }
    public float getNumB()
    {
        return this.numB;
    }
    public float getNumC()
    {
        return this.numC;
    }
    public float soma()
    {
        return getNumA() + getNumB() + getNumC();
    }
    public float calculaMedia()
    {
        float media = soma() / 3;
        return media;
    }
    public void verifica()
    {
        if(this.calculaMedia() > 5)
        {
            System.out.printf("Media: %.2f, ta aprovado meu peixe", this.calculaMedia());
        }
        else
        {
            System.out.printf("Media: %.2f, infelizmente ta reprovado", this.calculaMedia());
        }
    }
}
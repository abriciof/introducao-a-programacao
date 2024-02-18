import java.util.Scanner;
public class Media
{
    private float numA;
    private float numB;
    private float numC;
    private float numD;
    public static void main(String[] args)
    {
        Media media = new Media();
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();
        float D = scanner.nextFloat();
        scanner.close();
        media.setNumA(A);
        media.setNumB(B);
        media.setNumC(C);
        media.setNumD(D);
        media.imprimeMedia();
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
    public void setNumD(float numero)
    {
        this.numD = numero;
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
    public float getNumD()
    {
        return this.numD;
    }
    public float soma()
    {
        return getNumA() + getNumB() + getNumC() + getNumD();
    }
    public void imprimeMedia()
    {
        float media = soma() / 4;
        System.out.printf("A media das notas eh: %.2f", media);
    }
}
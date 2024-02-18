import java.util.Scanner;
public class TempCelsius
{
    private float grausCelsius;
    TempCelsius(float grausC)
    {
        this.setGrausCelsius(grausC);
    }
    public void setGrausCelsius(float numero)
    {
        this.grausCelsius = numero;
    }
    public float getGrausCelsius()
    {
        return this.grausCelsius;
    }
    public void ConverteTemp()
    {
        float fahrenheit = (9.0 f / 5) * this.getGrausCelsius() + 32;
        System.out.printf("Temperatura em C: %.1f\n", this.getGrausCelsius());
        System.out.printf("Temperatura em F: %.1f\n", fahrenheit);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float grausC = scanner.nextFloat();
        scanner.close();
        TempCelsius conversor = new TempCelsius(grausC);
        conversor.ConverteTemp();
    }
}
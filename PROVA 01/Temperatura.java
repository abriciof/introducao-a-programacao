import java.util.Scanner;
public class Temperatura
{
    private float fahrenheit;
    Temperatura(float grausF)
    {
        this.setFahrenheit(grausF);
    }
    public float getFahrenheit()
    {
        return this.fahrenheit;
    }
    public void setFahrenheit(float grausF)
    {
        this.fahrenheit = grausF;
    }
    public void converteCelsius()
    {
        float grausC = (5.0 f / 9) * (this.getFahrenheit() - 32);
        System.out.printf("Temperatura em F: %.1f\n", this.getFahrenheit());
        System.out.printf("Temperatura em C: %.1f", grausC);
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        float grasF = leitor.nextFloat();
        leitor.close();
        Temperatura temperatura = new Temperatura(grasF);
        temperatura.converteCelsius();
    }
}
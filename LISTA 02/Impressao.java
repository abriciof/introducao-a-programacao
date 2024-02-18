import java.util.Scanner;
public class Frase
{
    private String palavraA;
    private String palavraB;
    public static void main(String[] args)
    {
        Frase frase = new Frase();
        Scanner scanner = new Scanner(System.in);
        String palavraA = scanner.nextLine();
        String palavraB = scanner.nextLine();
        scanner.close();
        frase.setPalavraA(palavraA);
        frase.setPalavraB(palavraB);
        frase.imprimeFrase();
    }
    public void setPalavraA(String palavra)
    {
        this.palavraA = palavra;
    }
    public void setPalavraB(String palavra)
    {
        this.palavraB = palavra;
    }
    public String getPalavraA()
    {
        return this.palavraA;
    }
    public String getPalavraB()
    {
        return this.palavraB;
    }
    public void imprimeFrase()
    {
        System.out.print(getPalavraA() + " " + getPalavraB());
    }
}
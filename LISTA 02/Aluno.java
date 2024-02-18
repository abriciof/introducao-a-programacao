import java.util.Scanner;
public class Aluno
{
    private String nome;
    private int idade;
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        scanner.close();
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.imprimeInformacoes();
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public String getNome()
    {
        return this.nome;
    }
    public int getIdade()
    {
        return this.idade;
    }
    public void imprimeInformacoes()
    {
        System.out.printf("%s\n%d", getNome(), getIdade());
    }
}
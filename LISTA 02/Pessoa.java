import java.util.Scanner;
public class Pessoa
{
    private String nome;
    private int ano;
    Pessoa(String novoNome, int novoAno)
    {
        this.setNome(novoNome);
        this.setAno(novoAno);
    }
    Pessoa()
    {}
    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getAno()
    {
        return this.ano;
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    public int calculaIdade()
    {
        int idade = 2021 - this.getAno();
        return idade;
    }
    public void imprimePessoa()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.calculaIdade());
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int ano = scanner.nextInt();
        scanner.close();
        Pessoa pessoa = new Pessoa(nome, ano);
        pessoa.imprimePessoa();
    }
}
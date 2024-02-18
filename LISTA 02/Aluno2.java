import java.util.Scanner;
public class Aluno2
{
    private String nome;
    private int idade;
    private String sexo;
    private float nota1;
    private float nota2;
    private float nota3;
    public static void main(String[] args)
    {
        Aluno2 aluno = new Aluno2();
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        scanner.nextLine();
        String sexo = scanner.nextLine();
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        scanner.close();
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setSexo(sexo);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        aluno.setNota3(nota3);
        aluno.imprimeAluno();
        aluno.imprimeMedia();
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    public void setNota1(float nota)
    {
        this.nota1 = nota;
    }
    public void setNota2(float nota)
    {
        this.nota2 = nota;
    }
    public void setNota3(float nota)
    {
        this.nota3 = nota;
    }
    public String getNome()
    {
        return this.nome;
    }
    public int getIdade()
    {
        return this.idade;
    }
    public String getSexo()
    {
        return this.sexo;
    }
    public float getNota1()
    {
        return this.nota1;
    }
    public float getNota2()
    {
        return this.nota2;
    }
    public float getNota3()
    {
        return this.nota3;
    }
    public void imprimeAluno()
    {
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %s\n", getNome(), getIdade(), getSexo());
    }
    public void imprimeMedia()
    {
        float media = (getNota1() + getNota2() + getNota3()) / 3;
        System.out.printf("Media: %.2f", media);
    }
}
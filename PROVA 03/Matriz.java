import java.util.Scanner;
public class Matriz
{
    private int qtLinhas;
    private int qtColunas;
    private int mat[][];
    Matriz()
    {
        this.setQtLinhas(3);
        this.setQtColunas(3);
        mat = new int[this.getQtLinhas()][this.getQtColunas()];
    }
    public void setQtLinhas(int num)
    {
        this.qtLinhas = num;
    }
    public void setQtColunas(int num)
    {
        this.qtColunas = num;
    }
    public void setElemento(int indexLinha, int indexColuna, int num)
    {
        this.mat[indexLinha][indexColuna] = num;
    }
    public int getElemento(int indexLinha, int indexColuna)
    {
        return this.mat[indexLinha][indexColuna];
    }
    public int getQtLinhas()
    {
        return this.qtLinhas;
    }
    public int getQtColunas()
    {
        return this.qtColunas;
    }
    public void imprimeDiferencaMaiorMenor()
    {
        int maior = this.getElemento(0, 0);
        int menor = this.getElemento(0, 0);
        for(int i = 0; i < this.getQtLinhas(); i++)
        {
            for(int j = 0; j < this.getQtColunas(); j++)
            {
                if(this.getElemento(i, j) > maior)
                {
                    maior = this.getElemento(i, j);
                }
                if(this.getElemento(i, j) < menor)
                {
                    menor = this.getElemento(i, j);
                }
            }
        }
        System.out.println(maior - menor);
        return maior;
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Matriz matriz = new Matriz();
        for(int i = 0; i < matriz.getQtLinhas(); i++)
        {
            for(int j = 0; j < matriz.getQtColunas(); j++)
            {
                matriz.setElemento(i, j, leitor.nextInt());
            }
        }
        matriz.imprimeDiferencaMaiorMenor();
        leitor.close();
    }
}
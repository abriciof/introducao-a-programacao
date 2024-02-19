import java.util.Scanner;
public class Matriz
{
    private int mat[][];
    private int qtLinhas;
    private int qtColunas;
    Matriz()
    {
        this.setQtLinhas(3);
        this.setQtColunas(3);
        mat = new int[this.getQtLinhas()][this.getQtColunas()];
    }
    public int getQtLinhas()
    {
        return this.qtLinhas;
    }
    public int getQtColunas()
    {
        return this.qtColunas;
    }
    public void setQtLinhas(int num)
    {
        this.qtLinhas = num;
    }
    public void setQtColunas(int num)
    {
        this.qtColunas = num;
    }
    public int getElemento(int indexLinha, int indexColuna)
    {
        return this.mat[indexLinha][indexColuna];
    }
    public void setElemento(int indexLinha, int indexColuna, int num)
    {
        this.mat[indexLinha][indexColuna] = num;
    }
    public void somaComInteiro(int num)
    {
        int aux;
        for(int i = 0; i < this.getQtLinhas(); i++)
        {
            for(int j = 0; j < this.getQtColunas(); j++)
            {
                aux = this.getElemento(i, j) + num;
                this.setElemento(i, j, aux);
            }
        }
    }
    public void imprime()
    {
        for(int i = 0; i < this.getQtLinhas(); i++)
        {
            for(int j = 0; j < this.getQtColunas(); j++)
            {
                System.out.print(this.getElemento(i, j) + " ");
            }
            System.out.println();
        }
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
        int numero = leitor.nextInt();
        matriz.somaComInteiro(numero);
        matriz.imprime();
    }
}
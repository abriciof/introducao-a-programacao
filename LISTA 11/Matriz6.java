import java.util.Scanner;
public class Matriz
{
    private int ordem;
    private int[][] mat;
    Matriz(int ordem)
    {
        this.setOrdem(ordem);
        mat = new int[this.getOrdem()][this.getOrdem()];
    }
    public int getOrdem()
    {
        return this.ordem;
    }
    public void setOrdem(int ordem)
    {
        this.ordem = ordem;
    }
    public int getElemento(int indexLinha, int indexColuna)
    {
        return this.mat[indexLinha][indexColuna];
    }
    public void setElemento(int indexLinha, int indexColuna, int novoValor)
    {
        this.mat[indexLinha][indexColuna] = novoValor;
    }
    public boolean somaLinhas(int somaCorreta)
    {
        int i = 0;
        int soma = 0;
        int j;
        boolean resultado = true;
        while(i < this.getOrdem() && resultado)
        {
            soma = 0;
            j = 0;
            while(j < this.getOrdem())
            {
                soma += this.getElemento(i, j);
                j++;
            }
            if(soma != somaCorreta)
            {
                resultado = false;
            }
            i++;
        }
        // System.out.println(soma);
        return resultado;
    }
    public boolean somaColunas(int somaCorreta)
    {
        int j = 0;
        int soma = 0;
        int i;
        boolean resultado = true;
        while(j < this.getOrdem() && resultado)
        {
            soma = 0;
            i = 0;
            while(i < this.getOrdem())
            {
                soma += this.getElemento(i, j);
                i++;
            }
            if(soma != somaCorreta)
            {
                resultado = false;
            }
            j++;
        }
        // System.out.println(soma);
        return resultado;
    }
    public boolean somaDiagonalPrincipal(int somaCorreta)
    {
        int soma = 0;
        boolean resultado = true;
        for(int i = 0; i < this.getOrdem(); i++)
        {
            soma += this.getElemento(i, i);
        }
        if(soma != somaCorreta)
        {
            resultado = false;
        }
        // System.out.println(soma);
        return resultado;
    }
    public boolean somaDiagonalSecundaria(int somaCorreta)
    {
        int soma = 0;
        boolean resultado = true;
        for(int i = 0; i < this.getOrdem(); i++)
        {
            soma += this.getElemento(i, this.getOrdem() - 1 - i);
        }
        if(soma != somaCorreta)
        {
            resultado = false;
        }
        // System.out.println(soma);
        return resultado;
    }
    public void ehQuadradoMagico()
    {
        String resultado = "nao eh um quadrado magico!";
        int somaCorreta = 0;
        for(int i = 0; i < this.getOrdem(); i++)
        {
            somaCorreta += this.getElemento(i, 0);
        }
        if(this.somaLinhas(somaCorreta) && this.somaColunas(somaCorreta) && this.somaDiagonalPrincipal(somaCorreta) && this.somaDiagonalSecundaria(somaCorreta))
        {
            resultado = "eh um quadrado magico!";
        }
        System.out.println(resultado);
    }
    public void imprimeMatriz()
    {
        int contColuna;
        int contLinha;
        System.out.println("Matriz");
        for(contLinha = 0; contLinha < this.getOrdem(); contLinha++)
        {
            for(contColuna = 0; contColuna < this.getOrdem(); contColuna++)
            {
                System.out.print(this.getElemento(contLinha, contColuna) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int ordem = scanner.nextInt();
        Matriz matriz = new Matriz(ordem);
        for(int i = 0; i < matriz.getOrdem(); i++)
        {
            for(int j = 0; j < matriz.getOrdem(); j++)
            {
                matriz.setElemento(i, j, scanner.nextInt());
            }
        }
        matriz.imprimeMatriz();
        matriz.ehQuadradoMagico();
        scanner.close();
    }
}
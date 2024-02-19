import java.util.Scanner;
public class FazendinhaToya
{
    private int quantidadeBranco;
    private int quantidadePreto;
    private float pesoBrancos;
    private float pesoPretos;
    FazendinhaToya()
    {
        this.setQuantidadeBranco(0);
        this.setQuantidadePreto(0);
        this.setPesoBrancos(0.0f);
        this.setPesoPretos(0.0f);
    }
    public int getQuantidadeBranco()
    {
        return this.quantidadeBranco;
    }
    public int getQuantidadePreto()
    {
        return this.quantidadePreto;
    }
    public float getPesoBrancos()
    {
        return this.pesoBrancos;
    }
    public float getPesoPretos()
    {
        return this.pesoPretos;
    }
    public void setQuantidadeBranco(int num)
    {
        this.quantidadeBranco = num;
    }
    public void setQuantidadePreto(int num)
    {
        this.quantidadePreto = num;
    }
    public void setPesoBrancos(float num)
    {
        this.pesoBrancos = num;
    }
    public void setPesoPretos(float num)
    {
        this.pesoPretos = num;
    }
    public void imprime()
    {
        System.out.printf("Quantidade de bois brancos: %d", this.getQuantidadeBranco());
        System.out.printf("\nPeso total dos bois brancos: %.2f KG", this.getPesoBrancos());
        System.out.printf("\nQuantidade de bois pretos: %d", this.getQuantidadePreto());
        System.out.printf("\nPeso total dos bois pretos: %.2f KG", this.getPesoPretos());
    }
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        FazendinhaToya fazenda = new FazendinhaToya();
        int qtde = leitor.nextInt();
        int qtde_aux = 0;
        float peso_aux = 0;
        String letra;
        for(int i = 0; i < qtde; i++)
        {
            leitor.nextLine();
            letra = leitor.nextLine();
            qtde_aux = leitor.nextInt();
            if(letra.equals("b"))
            {
                for(int b = 0; b < qtde_aux; b++)
                {
                    peso_aux += leitor.nextFloat();
                }
                qtde_aux += fazenda.getQuantidadeBranco();
                peso_aux += fazenda.getPesoBrancos();
                fazenda.setQuantidadeBranco(qtde_aux);
                fazenda.setPesoBrancos(peso_aux);
            }
            else if(letra.equals("p"))
            {
                for(int p = 0; p < qtde_aux; p++)
                {
                    peso_aux += leitor.nextFloat();
                }
                qtde_aux += fazenda.getQuantidadePreto();
                peso_aux += fazenda.getPesoPretos();
                fazenda.setQuantidadePreto(qtde_aux);
                fazenda.setPesoPretos(peso_aux);
            }
            qtde_aux = 0;
            peso_aux = 0.0f;
        }
        leitor.close();
        fazenda.imprime();
    }
}
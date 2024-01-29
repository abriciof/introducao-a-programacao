import java.util.Scanner;

public class DiaDaSemana{
        private int numDia;
        DiaDaSemana(int numDia){
                this.setNumDia(numDia);
        }
        public void setNumDia(int numDia){
                this.numDia = numDia;
        }
        public int getNumDia(){
                return this.numDia;
        }
        public void imprimeDia(){
                String dia = "";
                if (this.getNumDia() == 1){
                        dia = "Segunda";
                }else if (this.getNumDia() == 2){
                        dia = "Terca";
                }else if (this.getNumDia() == 3){
                        dia = "Quarta";
                }else if (this.getNumDia() == 4){
                        dia = "Quinta";
                }else if (this.getNumDia() == 5){
                        dia = "Sexta";
                }else if (this.getNumDia() == 6){
                        dia = "Sabado";
                }else if (this.getNumDia() == 7){
                        dia = "Domingo";
                }
                System.out.println(dia);
        }
        public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
                int numDia = leitor.nextInt();
                leitor.close();

                DiaDaSemana diaDaSemana = new DiaDaSemana(numDia);
                diaDaSemana.imprimeDia();
        }
}
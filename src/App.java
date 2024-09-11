import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {

    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       System.out.println("Pontuação do Professor: ");
       int pontuacao = ler.nextInt();
        if (pontuacao < 30) {
            System.out.println("Desepenho: Insatisfação " + pontuacao);
             }else if (pontuacao< 50) {
                 System.out.println("Desepenho: Regular " + pontuacao);
                }else if (pontuacao < 80) {
                     System.out.println("Dsepenho: Bom " + pontuacao);
                        }else
                             System.err.println("Desepenho: Otimo " + pontuacao);
    }
}

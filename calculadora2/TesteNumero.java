package calculadora2;
import java.util.HashMap;
import java.util.Scanner;
public class TesteNumero {
    public static void main(String[] args) {
       Calc2 n = new Calc2(); 

       Scanner scan = new Scanner(System.in);

       boolean continuar = true;

       while (continuar) {
        double x = 0;
        double y = 0 ;
        int operacao = 0;

        System.out.println("Digite a operação que deseja realizar:"
+                                                " \n 1 para soma "
+                                                " \n 2 para subtração "
+                                                " \n 3 para multiplicação"
+                                                "\n 4 para divisão" 
+                                                "\n 0 para finalizar o programa"         
);

        operacao = scan.nextInt();

        if (operacao == 0 ) {
            continuar= false;
            return;
        }

        System.out.println("Informe o primeiro número: ");
        x = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        y = scan.nextDouble();

        switch (operacao) {
            case 1:
                imprimeCalculadora(operacao, n.soma(x, y), x, y);
                break;
                case 2:
                imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                break;
                case 3:
                imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                break;
                case 4:
                imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                break;
        
            
        }
       }

       scan.close();
    }
    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacacao = new HashMap<>();
        mapOperacacao.put(1, " somado");
        mapOperacacao.put(2, " subtraido");
        mapOperacacao.put(3, " multiplicado");
        mapOperacacao.put(4, " dividido");

        System.out.println("\n O resultado de " + x + mapOperacacao.get(operacao) + " por " + y + " é igual a " + resultado + "\n");

        
    }
}

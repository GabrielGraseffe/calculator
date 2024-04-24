import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    public double readNumber(){
        do {
            try {
                System.out.println("Digite um numero:");
                return scanner.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Digite de novo!");
                scanner.next();
            }
        }while(true);
    }

    public String readOperator(){
        do{
            System.out.println("Qual operação (+,-,*,/) ou Digite (=) para encerrar?");
            String operator = scanner.next();
            // next see how to make it smaller
            if(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*") || operator.equals("=")) {
                return operator;
            }
            System.out.println("Parametro invalido");
        }while(true);
    }
}

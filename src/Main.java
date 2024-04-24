import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        double numbers = reader.readNumber();
        Calculator calculator = new Calculator(numbers);

        do {
            String operator = reader.readOperator();
            if(operator.equals("=")){
                System.out.println(numbers);
                break;
            } else {
                numbers = reader.readNumber();
                numbers = calculator.calculate(operator, numbers);
                System.out.println(numbers);
            }
        } while (true);
    }
}

/*
Challenge for next week:
- Repensar como mostramos o resultado final. Ou seja, ha como nao ficar botando o valor na variavel resultado e mostrar?
- Podemos repensar a forma como fazemos a repeticao ou usar o conceito de getter. Ou outra forma? Pensa (no pior dos casos, tenta chat gpt)
*/
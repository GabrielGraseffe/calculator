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
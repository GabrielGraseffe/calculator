public class Calculator {
    private double result;

    // This is a constructor - Sempre e chamado no momento que a classe e instanciada
    Calculator(double result) {
        this.result = result;
    }

    private double adicao(double numbers) {
        return this.result + numbers;
    }

    private double subtracao(double numbers) {
        return this.result - numbers;
    }

    private double divisao(double numbers) {
        return this.result / numbers;
    }

    private double multiplicacao(double numbers) {
        return this.result * numbers;
    }

    public double calculate (String operator, double numbers) {
        switch (operator) {
            case "+":
                System.out.println(result + " " + operator + " " + numbers);
                this.result = adicao(numbers);
                break;

            case "-":
                System.out.println(result + " " + operator + " " + numbers);
                this.result = subtracao(numbers);
                break;

            case "*":
                System.out.println(result + " " + operator + " " + numbers);
                this.result = multiplicacao(numbers);
                break;

            case "/":
                System.out.println(result + " " + operator + " " + numbers);
                this.result = divisao(numbers);
                break;
        }

        return this.result;
    }

}

/*
    * - Propriedade de uma classe
    * - Getter & Setter
    * - Construtor
    * - Quando usar o this e quando nao usar
    * - Diff de Private vs Public { Depois para frente ver protected }
*/
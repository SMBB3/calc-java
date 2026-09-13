import java.util.Scanner;

public class Main {
    static double[] results = new double[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Калькулятор");
        
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        double result = calculate(num1, num2, operation);
        System.out.println("Результат: " + result);
        
        results[count] = result;
        count++;
        
        System.out.print("Вычислить факториал? (да/нет): ");
        scanner.nextLine();
        String answer = scanner.nextLine();
        
        if (answer.equals("да")) {
            System.out.print("Введите число: ");
            int n = scanner.nextInt();
            long fact = factorial(n);
            System.out.println("Факториал: " + fact);
        }
        
        System.out.println("Результаты:");
        for (int i = 0; i < count; i++) {
            System.out.println(results[i]);
        }
        
        scanner.close();
    }
    
    static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
    
    static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
    
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

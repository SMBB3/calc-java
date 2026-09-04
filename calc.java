import java.util.Scanner;

public class Main {
    char operation;
    int num1;
    int num2;

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи операцию: ");
        operation = scanner.next().charAt(0);

    }
}

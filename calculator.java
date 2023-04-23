import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.net.SocketTimeoutException;

/**
 * Реализовать простой калькулятор
 * 3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
 */

public class calculator {

   public static void main(String[] args) {
      char op = '+';
      Scanner scan = new Scanner(System.in);

      File file = new File("log_calc.txt");
      try {
         FileWriter writer = new FileWriter(file, false);
         while (op != '@') {

            double ans = 0;

            System.out.print("Введите первое число: ");
            double num1 = scan.nextDouble();
            System.out.print("\nВведите операцию (+, -, *, /) или выход - @: ");
            op = scan.next().charAt(0);
            System.out.print("Введите второе число: ");
            double num2 = scan.nextDouble();
            switch (op) {
               case '+':
                  ans = num1 + num2;
                  break;
               case '-':
                  ans = num1 - num2;
                  break;
               case '*':
                  ans = num1 * num2;
                  break;
               case '/':
                  ans = num1 / num2;
                  break;
               default:
                  System.out.printf("Неверно ввели операцию");
                  break;
            }
            System.out.print("\nОтвет:\n");
            System.out.printf("%s %s %s = %s\n", num1, op, num2, ans);
            writer.write(Double.toString(num1) + op + Double.toString(num2) + " = " + Double.toString(ans)+"; ");
         }
         scan.close();
         writer.close();
      } catch (Exception e) {
         System.out.println("Что-то не так");
      }
   }
}
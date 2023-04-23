import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.net.SocketTimeoutException;

/**
 * ����������� ������� �����������
 * 3*�������������. � ������������ �� ����������� �� �������� �����������.
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

            System.out.print("������� ������ �����: ");
            double num1 = scan.nextDouble();
            System.out.print("\n������� �������� (+, -, *, /) ��� ����� - @: ");
            op = scan.next().charAt(0);
            System.out.print("������� ������ �����: ");
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
                  System.out.printf("������� ����� ��������");
                  break;
            }
            System.out.print("\n�����:\n");
            System.out.printf("%s %s %s = %s\n", num1, op, num2, ans);
            writer.write(Double.toString(num1) + op + Double.toString(num2) + " = " + Double.toString(ans)+"; ");
         }
         scan.close();
         writer.close();
      } catch (Exception e) {
         System.out.println("���-�� �� ���");
      }
   }
}
/*
 * ���������� �������� ���������� ��������� ��������� ������� (����� ����),
��������� ����� ������ �������� �������� � ���-����.
 */
import java.io.File;
import java.io.FileWriter;
import java.net.SocketTimeoutException;
import java.util.Arrays;

public class task1_1 {
    public static void main(String[] args) {
        int[] mas = { 11, 3, 14, 16, 7, 23, 5, 9 };
        File file = new File("log.txt");
        try{
            FileWriter writer = new FileWriter(file, false);
            for (int i = mas.length - 1; i > 0; i--) {
                writer.write("������ ����"+Arrays.toString(mas));
                for (int j = 0; j < i; j++) {
       
                   if (mas[j] > mas[j + 1]) {
                      int tmp = mas[j];
                      mas[j] = mas[j + 1];
                      mas[j + 1] = tmp;
                   }
                   writer.write("������ ����"+Arrays.toString(mas));
                }
             }
             writer.close();
             System.out.println("����������");
        }
        catch (Exception e){
            System.out.println("���-�� �� ���"); 
        }
    }
}

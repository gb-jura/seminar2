/*
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
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
                writer.write("Первый цикл"+Arrays.toString(mas));
                for (int j = 0; j < i; j++) {
       
                   if (mas[j] > mas[j + 1]) {
                      int tmp = mas[j];
                      mas[j] = mas[j + 1];
                      mas[j + 1] = tmp;
                   }
                   writer.write("Второй цикл"+Arrays.toString(mas));
                }
             }
             writer.close();
             System.out.println("Получилось");
        }
        catch (Exception e){
            System.out.println("Что-то не так"); 
        }
    }
}

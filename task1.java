/*
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class task1 {
   public static void main(String[] args) throws IOException  {
      Logger logger = Logger.getLogger(task1.class.getName());
      FileHandler fh = new FileHandler("logMain.log");
      logger.addHandler(fh);
      //XMLFormatter xml = new XMLFormatter();
      //fh.setFormatter(xml);
      logger.info("Sort Array");

      int[] mas = { 11, 3, 14, 16, 7, 23, 5, 9 };

      for (int i = mas.length - 1; i > 0; i--) {
         logger.info("Первый цикл"+Arrays.toString(mas));
         for (int j = 0; j < i; j++) {

            if (mas[j] > mas[j + 1]) {
               int tmp = mas[j];
               mas[j] = mas[j + 1];
               mas[j + 1] = tmp;
            }
            logger.info("Второй цикл"+Arrays.toString(mas));
         }
      }
      System.out.println(Arrays.toString(mas));
   }
   
}
// Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
// В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. 
// Мы просто выводим этот элемент на консоль с помощью метода System.out.println().
// В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String) и 
// число с плавающей запятой (Double). Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
// Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных, обеспечивая простоту и 
// гибкость использования.
public class Task2 {
      public static <T> void printArray(T[] ourArray) {
          for(T i: ourArray)
              System.out.print(i+" ");
          System.out.println();
      }
   public static void main(String[] args) {
       Integer[] intArray = {1,2,34,45,456,7,8,4};
       String[] stringArray = {"dfasdf", "fasdfasdf", "dfadfasdf"};
          printArray(intArray);
          printArray(stringArray);
   }
}

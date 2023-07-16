
// Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает 
// максимальное значение из них.
// В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable. 
// Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.
// В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String).
// В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.
// Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом безопасность типов.
public class Task3 {
    public static <T extends Comparable,V extends Comparable> void getMax(T firstNumber, V secondNumber){
        try{
            if(firstNumber.compareTo(secondNumber)==1) System.out.println(firstNumber+">"+secondNumber);
            else if(firstNumber.compareTo(secondNumber)==0) System.out.println(firstNumber+"="+secondNumber);
            else System.out.println(firstNumber+"<"+secondNumber);
        }catch(ClassCastException ex){
            System.out.println("You input incorrect data ("+firstNumber+' '+secondNumber+"), please try again.");
        }    
    }
 public static void main(String[] args) {
        getMax(15,17);
        getMax(20.0, 20.01);
 }
 
}

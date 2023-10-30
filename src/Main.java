import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1 + №2");
    int[] numbers = new int[3];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    double[] fractional = {1.57, 7.654, 9.986};
    int[] numbersTwo = new int[]{1, 4, 6, 8, 10, 15, 21, 31, 40};
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(fractional));
    System.out.println(Arrays.toString(numbersTwo));
    System.out.println();

    System.out.println("Задача №3");
    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.print(numbers[i]);
      if (i != 0) {
        System.out.print(", ");
      }
    }
    System.out.println();
    for (int i = fractional.length - 1; i >= 0; i--) {
      System.out.print(fractional[i]);
      if (i != 0) {
        System.out.print(", ");
      }
    }
    System.out.println();
    for (int i = numbersTwo.length - 1; i >= 0; i--) {
      System.out.print(numbersTwo[i]);
      if (i != 0) {
        System.out.print(", ");
      }
    }
    System.out.println();
    System.out.println();

    System.out.println("Задача №4");
    int[] numbers3 = {1, 3, 4, 6, 8, 10, 11, 13, 15, 18, 19, 20, 23, 25, 27, 30};
    for (int i = 0; i < numbers3.length; i++) {
      if (numbers3[i] % 2 != 0) {
        numbers3[i]++;
      }
    }
    for (int i = 0; i < numbers3.length; i++) {
      System.out.print(numbers3[i]);
      if (numbers3[i] < numbers3[15]) {
        System.out.print(", ");
      }
    }
  }
}
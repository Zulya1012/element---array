import java.util.Scanner;
public class arr9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size array:");
    int size = sc.nextInt();

    int[] array = new int[size];

    System.out.println("Enter element array:");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }

    System.out.print("Enter the number, that need found:");
    int number = sc.nextInt();

    boolean found = false;
    for (int i = 0; i < size - 1; i++) {
      if (array[i] == number && (array[i + 1] == number || (i < size - 2 && array[i + 2] == number))) {
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Number " + number + " found next to each other or through a single element.");
    } else {
      System.out.println("Number " + number + " not found next to each other or through a single element.");
    }
  }
}

import java.util.Scanner;

/**
 * program that checks if two arrays are the same
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create 2 different arrays so they can be compared
    int array1[] = new int[5];
    int array2[] = new int[5];

    // ask the user for 5 numbers for the first array
    System.out.println("Please enter the values for the first array:");
    for (int i = 0; i < array1.length; i++) {
      array1[i] = input.nextInt();
    }

    // ask the user for 5 numbers for the second array
    System.out.println("Please enter the values for the second array:");
    for (int i = 0; i < array2.length; i++) {
      array2[i] = input.nextInt();
    }

    // declare a count variable to keep count of how many numbers are the same
    int count = 0;

    // check each number for each array if they are the same
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] == array2[i]) {
        count++;
      }
    }
    // if every number for both arrays are the same
    if (count == 5) {
      System.out.println("These arrays are the same");

      // if 1 or more numbers are not the same
    } else {
      System.out.println("These arrays are not the same");
    }
  }
}
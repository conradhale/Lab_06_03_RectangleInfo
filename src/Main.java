import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    double width = 0;
    double height = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("Input width of rectangle: ");
    if(in.hasNextDouble()) {
      width = in.nextDouble();
    } else {
      String invalid = in.nextLine();
      System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      System.exit(-1);
    }
    System.out.print("Input height of rectangle: ");
    if(in.hasNextDouble()) {
      height = in.nextDouble();
    } else {
      String invalid = in.nextLine();
      System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      System.exit(-1);
    }
    double area = width * height;
    double perimeter = 2 * width + 2 * height;
    double diagonal = Math.sqrt(width * width + height * height);
    System.out.println("The area of the rectangle is: " + area);
    System.out.println("The perimeter of the rectangle is: " + perimeter);
    System.out.println("The length of the diagonal of the rectangle is: " + diagonal);

  }
}
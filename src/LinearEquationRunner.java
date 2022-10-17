import java.util.Scanner;

public class LinearEquationRunner {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //user creates an object
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();

        //index of parentheses and commas
        int indexOfParentheses = coordinate1.indexOf(")");
        int indexOfComma = coordinate1.indexOf(", ");

        //parsing of first coordinate
        int x1 = Integer.parseInt(coordinate1.substring(1,indexOfComma));
        int y1 = Integer.parseInt(coordinate1.substring(indexOfComma + 2, indexOfParentheses));

        //parsing of second coordinate
        System.out.println("Enter coordinate 2:" );
        String coordinate2 = scan.nextLine();
        int x2 = Integer.parseInt(coordinate2.substring(1,indexOfComma));
        int y2 = Integer.parseInt(coordinate2.substring(indexOfComma + 2, indexOfParentheses));

        //prints coordinates
        System.out.println("The two points are: " + "(" + x1 + ", " + y1 + ")");





    }
}

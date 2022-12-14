import java.util.Scanner;

public class LinearEquationRunner {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //program welcomes user and asks user to input coordinates
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        System.out.println("Enter coordinate 2:" );
        String coordinate2 = scan.nextLine();

        //index of parentheses and commas
        int indexOfParentheses = coordinate1.indexOf(")");
        int indexOfComma = coordinate1.indexOf(", ");

        //parsing of first coordinate
        int x1 = Integer.parseInt(coordinate1.substring(1,indexOfComma));
        int y1 = Integer.parseInt(coordinate1.substring(indexOfComma + 2, indexOfParentheses));

        //index of parentheses and commas
        int indexOfParentheses2 = coordinate2.indexOf(")");
        int indexOfComma2 = coordinate2.indexOf(", ");

        //parsing of second coordinate
        int x2 = Integer.parseInt(coordinate2.substring(1,indexOfComma2));
        int y2 = Integer.parseInt(coordinate2.substring(indexOfComma2 + 2, indexOfParentheses2));

        //before creating the object, the program will check if x1 = x2
        if (x1 == x2) {
            System.out.println("The points you have inputted forms a vertical line: " + "x = " + x1);

        } else {
            //creates an object
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

            //prints information on the linear equation
            System.out.println();
            System.out.println("--------------LINE INFO---------------");
            System.out.println(equation.lineInfo());

            //asks the user to enter an x value and the prints out the coordinate with the corresponding y value
            System.out.println();
            System.out.print("Enter a value for x: ");
            double xValue = scan.nextDouble();
            System.out.println(equation.coordinateForX(xValue));

        }


    }
}

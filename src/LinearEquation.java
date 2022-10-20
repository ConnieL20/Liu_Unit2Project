public class LinearEquation {
    //instance variables
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    //Linear Equation constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //helper method to round a value to the hundredth
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }

    //Calculates and returns distance between (x1, y1) and (x2, y2), rounded to the nearest hundredth
    public double distance() {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2));
        distance = roundedToHundredth(distance);
        return distance;
    }

    /* Calculates and returns the slope of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double differenceY = y2 - y1;
        double differenceX = x2 - x1;
        double slope = (differenceY) / (differenceX);
        slope = roundedToHundredth(slope);
        return slope;
    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        double mx = slope() * x1;
        return y1 - mx;

    }

    /* Returns a String that represents the linear equation of (x1, y1) and (x2, y2)
    in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5". */
    public String equation() {
        double numerator = y2 - y1;
        double denominator = x2 -x1;
        String newEquation = "";
        String fraction = "";

        /* condition to print the slope in fraction form IF the numerator is not divisible by the denominator */
        if (numerator % denominator == 0) {
            fraction = (int)(numerator / denominator) + "x";
            if (slope() == 1) {
                fraction = "x";
            } else if (slope() == -1){
                fraction = "-x";
            }
        } else {
            if (slope() < 0) {
                fraction = "-" + (int)Math.abs(numerator) + "/" + (int)Math.abs(denominator) + "x";
            } else if (slope() > 0){
                fraction = (int)Math.abs(numerator) + "/" + (int)Math.abs(denominator) + "x";
            }
        }

        //prints a horizontal line if the y values of the given coordinates are the same.
        // Else, the condition will test whether the y-intercept is negative or positive to print the correct equation.
        if (y1 == y2) {
            newEquation = "y = " + y1;
            return newEquation;
        } else if (yIntercept() < 0) {
            newEquation = "y = " + fraction + " - " + Math.abs(yIntercept());
            return newEquation;
        } else if (yIntercept() == 0) {
            newEquation = "y = " + fraction;
            return newEquation;
        } else {
            newEquation = "y = " + fraction +  " + " + yIntercept();
            return newEquation;
        }

    }

    /* returns the original two coordinate points, linear equation of the line, the slope of the line,
    the y-intercept of the line, and the distance of the line */
    public String lineInfo() {
        String info = "The original two points are: " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")" + "\n";
        info += "The equation of the line between these points is: " + equation() + "\n";
        info += "The slope of the line is: " + slope() + "\n";
        info += "The y-intercept of the line is: " + yIntercept() + "\n";
        info += "The distance between the two points is: " + distance() ;

        return info;
    }

    //takes in a user input and returns the coordinate using the user's input
    public String coordinateForX(double yValue) {
        double solution = roundedToHundredth((yValue * slope()) + yIntercept());
        return "The point on the line is: (" + yValue + ", " + solution + ")";
    }
}













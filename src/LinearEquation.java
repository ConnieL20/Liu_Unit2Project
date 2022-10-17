public class LinearEquation {
    //instance variables
    final private int  x1;
    final private int y1;
    final private int x2;
    final private int y2;

    //Linear Equation constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2));
        distance = Math.round(distance * 100.0) / 100.0;
        return distance;
    }

    /* Calculates and returns the slope of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double differenceY = y2 - y1;
        double differenceX = x2 - x1;
        double slope = (differenceY) / (differenceX);
        slope = Math.round(slope * 100.0) / 100.0;
        return slope;
    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {

        return 0.0;

    }


}








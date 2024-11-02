public class LinearEquation {
    private int x1, y1, x2, y2;
    private boolean isVerticle;
    private boolean isHorizantal;
    public boolean tester() {
        if (x1==x2) {
            isVerticle = true;
            return isVerticle;
        }
        if (y1==y2) {
            isHorizantal = true;
            return isHorizantal;
        }
        else return false;
    }
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        tester();
    }

    public double distance() {
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        double d = Math.sqrt(x+y);
        return roundedToHundredth(d);
    }

    public double yIntercept() {
        if (isHorizantal == true) {
            return y2;
        } else if (isVerticle == true) {
            return x2;
        } else {
            double slope = slope();
            double yIntercept = y1 - (slope * x1);
            return roundedToHundredth(yIntercept);
        }
    }

    public double slope() {
        if (isVerticle == true) {
            return 123456789;
        }
        if (isHorizantal == true) {
            return 0;
        } else {
            int newX = x2 - x1;
            int newY = y2 - y1;
            return roundedToHundredth((double) newY / newX);
        }
    }

    public String equation() {
        if (isVerticle == true) {
            return "X" + " = " + x2;
        }
        if (isHorizantal == true) {
            return "Y" + " = " + y2;
        } else {
            double slope = this.slope();
            double yIntercept = this.yIntercept();
            return "Y" + " = " + slope + "x " + "+ " + yIntercept;
        }
    }

    public String lineInfo() {
        if (isVerticle==true) {
            return "the equation is " + equation() + '\n' +
                    "there is no slope the line is verticle"  + '\n' +
                    "there is no y intercept" + '\n' +
                    "the distance is " + distance();
        }
        if (isHorizantal==true) {
            return "the equation is " + equation() + '\n' +
                    "the slope is " + 0 + '\n' +
                    "the y intercept is " + y2 + '\n' +
                    "the distance is " + distance();
        }
        return "the equation is " + equation() + '\n' +
                "the slope is " + slope() + '\n' +
                "the y intercept is " + yIntercept() + '\n' +
                "the distance is " + distance();
    }


    public String coordinateForX(double x) {
        double y = slope() * x + yIntercept();
        return "(" + roundedToHundredth(x) + ", " + roundedToHundredth(y) + ")";
    }

    private double roundedToHundredth(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

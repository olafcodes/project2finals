import java.util.Scanner;

public class LinearEquationLogic {
    public void start() {
        Boolean repeat = true;

        while (repeat == true) {

            Scanner s = new Scanner(System.in);
            System.out.print("Enter your first coordinate point: ");
            String userCoord1 = s.nextLine();
            System.out.print("Enter your second coordinate point: ");
            String userCoord2 = s.nextLine();
            String stringX1 = userCoord1.substring(userCoord1.indexOf("(") + 1, userCoord1.indexOf(","));
            String stringY1 = userCoord1.substring(userCoord1.indexOf(",") + 2, userCoord1.indexOf(")"));
            String stringX2 = userCoord2.substring(userCoord2.indexOf("(") + 1, userCoord2.indexOf(","));
            String stringY2 = userCoord2.substring(userCoord2.indexOf(",") + 2, userCoord2.indexOf(")"));
            int x1 = Integer.parseInt(stringX1);
            int y1 = Integer.parseInt(stringY1);
            int x2 = Integer.parseInt(stringX2);
            int y2 = Integer.parseInt(stringY2);
            LinearEquation a = new LinearEquation(x1, y1, x2, y2);
            System.out.println(a.lineInfo());
            System.out.println("Please enter a value for x: ");
            String x = s.nextLine();
            double newX = Integer.parseInt(x);
            System.out.println(a.coordinateForX(newX));
            System.out.println("Would you like to continue y/n");
            String answer = s.nextLine();
            if (answer.equals("y")) {
                repeat = true;
            } else {
                repeat = false;
            }
        }
    }
}



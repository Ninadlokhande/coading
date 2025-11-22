import java.util.*;

public class AREACALCULATOR {

    public static Double findRect(Double w, Double l) {
        return w * l;
    }

    public static Double findCir(Double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static Double findTri(Double b, Double h) {
        return 0.5 * b * h;
    }

    public static Double findSqua(Double l) {
        return Math.pow(l, 2);
    }

    public static Double findElli(Double a, Double b) {
        return Math.PI * a * b;
    }

    public static void squaArea(Scanner s) {
        System.out.println(" enter the length of the square");
        Double length = s.nextDouble();
        s.nextLine();
        System.out.println("\nthe area of square is: " + findSqua(length));
    }

    public static void triArea(Scanner s) {
        System.out.println(" enter the base of the triangle");
        Double base = s.nextDouble();
        System.out.println(" enter the height of the triangle");
        Double height = s.nextDouble();
        s.nextLine();
        System.out.println("\n the area of triangle is: " + findTri(base, height));
    }

    public static void elliArea(Scanner s) {
        System.out.println(" enter R1 of the ellipse");
        Double a = s.nextDouble();
        System.out.println(" enter R2 of the ellipse");
        Double b = s.nextDouble();
        s.nextLine();
        System.out.println("\n the area of ellipse is: " + findElli(a, b));
    }

    public static void rectArea(Scanner s) {
        System.out.println(" enter the width of the rectangle");
        Double width = s.nextDouble();
        System.out.println(" enter the length of the rectangle");
        Double length = s.nextDouble();
        s.nextLine();
        System.out.println("\n the area of rectangle is: " + findRect(width, length));
    }

    public static void cirArea(Scanner s) {
        System.out.println(" enter the radius of the circle");
        Double radius = s.nextDouble();
        s.nextLine();
        System.out.println("\n the area of circle is: " + findCir(radius));
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" THE AREA CALCULATOR");
        System.out.println(" enter the input among(rect ⏹️, squa ⬜, tri 📐, cir ⭕, elli ⚪)");

        String shape = s.nextLine().trim().toLowerCase();
        String choice = "y";
        boolean decision = true;

        while (decision) {

            switch (shape) {
                case "rect":
                    rectArea(s);
                    break;
                case "cir":
                    cirArea(s);
                    break;
                case "squa":
                    squaArea(s);
                    break;
                case "elli":
                    elliArea(s);
                    break;
                case "tri":
                    triArea(s);
                    break;
                default:
                    System.out.println("Invalid input. Enter: rect, squa, tri, cir, elli");
            }

            System.out.println("\nDo you want to continue? (Y/N)");
            choice = s.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println(" enter the input among(rect,squa,tri,cir,elli)");
                shape = s.nextLine().trim().toLowerCase();
            } else {
                decision = false;
            }
        }

        s.close();
    }
}

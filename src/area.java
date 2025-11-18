import java.util.*;

public class area {
        public static Double findrect (Double w, Double l){
            return w*l;

        }
        public static void rectarea(){

            Scanner s = new Scanner(System.in);
            System.out.println(" enter the width of the ractangle");
            Double width = s.nextDouble();
            System.out.println(" enter the length of the rectangle");
            Double length = s.nextDouble();

            System.out.println(findrect(width,length));
            System.out.println("do you want to calculate area  again(Y/N)");
            s.nextLine();
            String c = s.nextLine();
            if("Y".equals(c) || "y".equals(c)){
                rectarea();
            }
            else{
                System.out.println("the area calculator is stopped");
            }


        }
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println(" THE AREA CALCULATOR");
            rectarea();

        }


    }

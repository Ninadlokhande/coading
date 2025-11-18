import java.util.*;

public class area {
        public static Double findrect (Double w, Double l){
            return w*l;
        }
        public static Double findcir (Double r){
            return Math.PI*Math.pow(r,2);
        }
        public static Double findtri (Double b ,Double h){
            return 0.5*b*h;
        }
        public static Double findsqua(Double l){
            return Math.pow(l,2);
        }
        public static Double findelli(Double a, Double b){
            return Math.PI*a*b;
        }
        public static void squaarea() {
            Scanner s = new Scanner(System.in);
            System.out.println(" enter the length of the square");
            Double length = s.nextDouble();

            System.out.println(" the area of square is:"+ findsqua(length));
        }
    public static void triarea(){
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the base of the triangle");
        Double base = s.nextDouble();
        System.out.println(" enter the height of the rectangle");
        Double height = s.nextDouble();

        System.out.println("the area of triagnle is;"+findtri(base,height));

    }
    public static void elliarea(){
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the R1 of the ecllipse");
        Double a = s.nextDouble();
        System.out.println(" enter the R2 of the ecllipse");
        Double b = s.nextDouble();

        System.out.println( " the area of ellipce is:"+ findelli(a,b));

    }
        public static void rectarea(){

            Scanner s = new Scanner(System.in);
            System.out.println(" enter the width of the ractangle");
            Double width = s.nextDouble();
            System.out.println(" enter the length of the rectangle");
            Double length = s.nextDouble();

            System.out.println(" the area of rectangle is:"+ findrect(width,length));


        }
        public static void cirarea() {
            Scanner s = new Scanner(System.in);
            System.out.println(" enter the radius of the circle");
            Double radius = s.nextDouble();
            System.out.println(" the area of circle is "+ findcir(radius));

        }
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println(" THE AREA CALCULATOR");
            System.out.println(" enter the input among(rect(⏹️), squa(⬜) ,tri(📐),cir(⭕),elli(⚪))");
            String shape = s.nextLine();
            String choice = "y";
            boolean decision = true;
            while(decision){

            switch (shape){
                case "rect":
                   rectarea();
                    break;
                case "cir":
                     cirarea();
                    break;
                case "squa":
                    squaarea();
                    break;
                case "elli":
                     elliarea();
                    break;
                case "tri":
                     triarea();
                     break;
                default:
                    System.out.println(" Invalid input entered"+"  "+"enter the input among(rect,squa,tri,cir,elli)");
            }

                System.out.println(" do you want to continue");
                choice = s.nextLine();
                if(choice.equals("y")|| choice.equals("Y")){
                    decision = true;
                    System.out.println(" enter the input among(rect, squa ,tri,cir,elli)");
                    shape = s.nextLine();
                }
                else{
                    decision =false;
                }


        }


    }}

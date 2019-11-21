import java.util.Scanner;
public class WhileLoops {

    static Scanner scan = new Scanner(System.in);

    public static void fromHereToThere(int a, int b) {
        System.out.println("fromHereToThere(20,30): ");
        if (a > b) {
            System.out.print("Invalid input");
        }
        while (a <= b) {
            System.out.println(a);
            a += 1;
        }
    }

    public static void factors(int c) {
        System.out.println("The factors of 12 are: ");
        int num = 1;
        while (num <= c) {
            num += 1;
            if (c % num == 0)
            System.out.println(c/num);
        }
    }

    public static String countPosAndNeg() {
        System.out.println("Enter a positive number or a 0 to quit: ");
        int pcount = 0;
        int ncount = 0;
        int num = scan.nextInt();
        while (num != 0) {
            if (num > 0) {
                pcount += 1;
            }
            if (num < 0) {
                ncount += 1;
            }
            num = scan.nextInt();
        }
        return "There were " + pcount + " positive and " + ncount + " negative numbers";
    }

    public static String findMinAndMax() {
        System.out.println("Numbers: ");
        int counter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (counter < 5) {
            int num = scan.nextInt();
            counter += 1;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return "Max value is: " + max + " \nMin value is: " + min;

    }
    public static Double gradePoint(){
        int counter= 0;
        double total= 0;
        System.out.println("Enter seven letter grades (A,B,C,D, or F)");
        while (counter < 7){
            String grade = scan.next();
            counter+=1;
            if (grade.equals("A")) {
                total += 4.0;
            } else if (grade.equals("B")) {
                total += 3.0;
            } else if (grade.equals("C")) {
                total += 2.0;
            } else if (grade.equals("D")) {
                total += 1.0;
            }  else{
                total+=0.0;
            }

        }
        total/=7;
        total*=100;
        total=(int)(total+0.5);
        total/=100;
            return total;

        }


    public static void main(String[] args){
            fromHereToThere(20,30);
            factors(12);
            System.out.println(countPosAndNeg());
            System.out.println(findMinAndMax());
            System.out.println(gradePoint());
        }


}

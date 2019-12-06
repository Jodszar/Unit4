import java.util.Scanner;
public class NestedLoops {

    public static String xSquare() {
        String s = "";

        for (int x = 1; x <= 5; x++) {

            for (int y = 1; y <= 5; y++) {

                s += "X";
            }
            s+="\n";
        }
        return s;
    }

    public static String xSquare2(int n) {
        Scanner kb= new Scanner(System.in );
        System.out.println("Enter n: ");
        int b = kb.nextInt();
        String s= "";
        for( int x=1; x<+ n; x++){
            for (int y=1; y<=n; y++){
                s+= " X";
            }
            s+="\n";
        }
        return s;

    }
    public static String flippedTriangle(int n){
        String c="";
        for( int x=1; x<=n; x++){
            for( int y=x; y<=n; y++){
                c+= "*";
            }
            c+="\n";
        }
        return c;

    }
    public static String multiplicationTable(){
        String m="";
        for (int x=1; x<=9; x++){
            for (int y=1; y<=9; y++)
                if((x*y)>=10)
                    m += " "+x*y;

            else
                m +="  " +x*y;
                m += "\n";

        }
        return m;
        }


    public static void main(String[] args){
        System.out.println(xSquare());
        System.out.println(xSquare2(8));
        System.out.println(flippedTriangle(6));
        System.out.println(multiplicationTable());

    }


}

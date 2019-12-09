public class FizzBuzz {
    public static String FizzBuzZ(int num){
        String output="";
        for(int counter=1; counter <=num; counter++){
            if(counter%20==0)
                output+= " Buzz " + "\n";
            else if (counter%3 ==0)
                output+= " Fizz ";
            else if (counter%5==0)
                output+=" Buzz ";
            else
                output+=" "+counter;

        }
        return output;
    }
    public static void main(String[] args){
        System.out.print(FizzBuzZ(100));
    }
}

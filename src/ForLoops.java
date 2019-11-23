public class ForLoops {

    public static String printingHashTags(int num) {
        String hashtag = " ";
        for (int counter = 1; counter <= num; counter++) {
            hashtag += "#";
        }
        return hashtag;
    }
    public static String countDown(int a, int b){
        String countdown= " ";
        for(int counter = b; counter >=a ; counter--){
            countdown += counter +" ";
        }
        return countdown;
    }
    public static String countDown2(int a, int b){
        String output= " ";
        int big= 0;
        int small= 0;
        if (a>b){
            big+= a;
            small+= b;
        }
        else{
            big+= b;
            small+= a;
        }
        for(int counter = big; counter >=small; counter--){
            output+=counter+" ";
        }
        return output;
    }
    public static Integer sumNumbers(int a , int b){
        int total= 0;
        int big;
        int small;
        if (a>b){
            big = a;
            small = b;
        }
        else{
            big=b;
            small= a;
        }
        for(int counter =small; counter<= big; counter++ ){
            total += counter;
        }
        return total;
    }


        public static void main(String[] args){
            System.out.println(printingHashTags(7));
            System.out.println(countDown(0,10));
            System.out.println(countDown2(0,10));
            System.out.println(sumNumbers(5,10));
        }

    }

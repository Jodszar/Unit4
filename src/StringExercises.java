public class StringExercises {

    public static String printTheLetters(String s){
        String output="";
        for(int counter = 0; counter<s.length(); counter++){
            output+=s.substring(counter,counter+1)+"\n";
        }
        return output;
    }
    public static String everyOtherLetter(String s){
        String output="";
        for( int counter = 0; counter<s.length(); counter+=2){
            output+=s.substring(counter,counter+1);
        }
        return output;
    }
    public static int countTheVowels(String s) {
        int output = 0;
        s = s.toLowerCase();
        for (int counter = 0; counter < s.length(); counter++) {
            if (s.substring(counter, counter + 1).equals("a")) {
                output++;
            }
            if (s.substring(counter, counter + 1).equals("e")) {
                output++;
            }
            if (s.substring(counter, counter + 1).equals("i")) {
                output++;
            }
            if (s.substring(counter, counter + 1).equals("o")) {
                output++;
            }
            if (s.substring(counter, counter + 1).equals("u")) {
                output++;
            } else {
                output += 0;
            }
        }
        return output;
    }
    public static String differentStrings(String s1, String s2){
        String output="";
        String t1=s1;
        String t2=s2;
        int counter= 0;
        if (s1.equals(s2)){
            return s1+" and "+s2+" are the same.";
        }
        if (s1.length()>s2.length())
            t2+=" ";
        else {
            t1+=" ";
        }
        while(t1.substring(counter, counter+1).equals(t2.substring(counter, counter+1))){
            counter ++;
        }
        return s1+" and "+s2+" are not the same. They differ at "+(counter+1)+",";

    }
    public static void main (String[] args){
        System.out.println(printTheLetters("Pizza"));
        System.out.println(everyOtherLetter("Computer Science"));
        System.out.println(countTheVowels("COMPUTER science"));
        System.out.println(differentStrings("bowl","bowling"));

    }

}

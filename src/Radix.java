import java.util.HashMap;
public class Radix {

    public static void main(String[] args){
        String[] tests = {"google",	"gojo",	"amazingly", "jogo",	"luna",	"pup",	"solas",	"solo",	"pupperino",
                "amaterasu", "amazon",	"puppy",	"hydra",	"amazonia",	"vueltiao", "ama"};
        stringRadix(tests);
    }

    public static void stringRadix(String[] s){
        // find the length of longest string which determines number of iterations
        int maxLength =0;
        for(int q = 0; q <s.length; q++){
            if(s[q].length() > maxLength){
                maxLength = s[q].length();
            }
        }

        for(int i=0; i < maxLength; i++){
            HashMap<Integer,String[]> buckets = new HashMap<>();

            // this will be ht HashMap key and is the precedent and ordering of the buckets
            // 0 = null, 1 = non letter, 2-27 a-z
            int [] counts = new int[28];

            
        }






        //prints the sorted array.
        for(int p = 0; p<s.length; p++){
            System.out.print(s+",");
        }
    }
}

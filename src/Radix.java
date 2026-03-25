import java.util.HashMap;
public class Radix {

    public static void main(String[] args){
        String[] tests = {"google",	"gojo",	"amazingly", "jogo",	"luna",	"pup",	"solas",	"solo",	"pupperino",
                "amaterasu", "amazon",	"puppy",	"hydra",	"amazonia",	"vueltiao", "ama"};
        stringRadix(tests);
    }

    public static void stringRadix(String[] s){
        HashMap<Integer,String[]> buckets = new HashMap<>();
        








        //prints the sorted array.
        for(int p = 0; p<s.length; p++){
            System.out.print(s+",");
        }
    }
}

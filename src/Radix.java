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

            // get the count for each 'current' character for each string
            for(int j = 0; j < s.length;j++){
                if(s[j].length() < s.length){
                    counts[0] = counts[0] +1;
                }else{
                    counts[charPrec(s[j].charAt(i))] = counts[charPrec(s[j].charAt(i))]+1;
                }
            }

        }

        //prints the sorted array.
        for(int p = 0; p<s.length; p++){
            System.out.print(s+",");
        }
    }

    private static int charPrec(char c){
        if(c == 'a'){
            return 2;
        }else if(c == 'b'){
            return 3;
        }else if(c == 'c'){
            return 4;
        }else if(c == 'd'){
            return 5;
        }else if(c == 'e'){
            return 6;
        }else if(c == 'f'){
            return 7;
        }else if(c == 'g'){
            return 8;
        }else if(c == 'h'){
            return 9;
        }else if(c == 'i'){
            return 10;
        }else if(c == 'j'){
            return 11;
        }else if(c == 'k'){
            return 12;
        }else if(c == 'l'){
            return 13;
        }else if(c == 'm'){
            return 14;
        }else if(c == 'n'){
            return 15;
        }else if(c == 'o'){
            return 16;
        }else if(c == 'p'){
            return 17;
        }else if(c == 'q'){
            return 18;
        }else if(c == 'r'){
            return 19;
        }else if(c == 's'){
            return 20;
        }else if(c == 't'){
            return 21;
        }else if(c == 'u'){
            return 22;
        }else if(c == 'v'){
            return 23;
        }else if(c == 'w'){
            return 24;
        }else if(c == 'x'){
            return 25;
        }else if(c == 'y'){
            return 26;
        }else if(c == 'z'){
            return 27;
        }
        return 1;
    }
}

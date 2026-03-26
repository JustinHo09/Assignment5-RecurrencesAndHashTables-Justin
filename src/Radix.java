/**
 * This class performs and runs tests on a lexicographic radix sort algorithm
 * for an array of strings.
 * This utilizes the HashMap collection to make buckets each possible character.
 */

import java.util.HashMap;
public class Radix {

    /**
     * Runs 5 test cases on stringRadix() method to test if it does sort the
     * inputs correctly.
     * @param args User input not used here
     */
    public static void main(String[] args){
        String[] tests = {"google",	"gojo",	"amazingly", "jogo",	"luna",	"pup",	"solas",	"solo",	"pupperino",
                "amaterasu", "amazon",	"puppy",	"hydra",	"amazonia",	"vueltiao", "ama"};
        stringRadix(tests);
        System.out.println();

        String[] test2 = {"google",	"gojo",	"amazingly", "Jogo",	"luna",	"pup",	"solas",	"solo",	"pupperino",
                "amaterasu", "Amazon",	"puppy",	"Hydra",	"amazonia",	"vueltiao", "ama","amazon","amaZingly"};
        stringRadix(test2);
        System.out.println();

        String[] test3 = {"Ama","aMa","ama","AMa","aMA","Amb", "AmA"};
        stringRadix(test3);
        System.out.println();

        String[] test4 = {};
        stringRadix(test4);
        System.out.println();

        String[] test5 = {"Az","AZ","az","aZ","aZa","Aza", "aZA", "azA"};
        stringRadix(test5);
        System.out.println();

    }

    /**
     * Performs a radix sort on an array of string ordering them lexicographically, and then
     * prints the final sorted array.
     * @param s The input array of Strings to sort.
     */
    public static void stringRadix(String[] s){
        // find the length of longest string which determines number of iterations
        int maxLength =0;
        for(int j = 0; j <s.length; j++){
            if(s[j].length() > maxLength){
                maxLength = s[j].length();
            }
        }

        // Iterate through every character
        for(int i=maxLength-1; i >= 0; i--){
            String[][] mapBuckets = new String[53][];
            //HashMap<Integer,String[]> buckets = new HashMap<>();

            // this will be ht HashMap key and is the precedent and ordering of the buckets
            // 0 = null, 1-26 A-Z, 27-52 a-z
            int [] counts = new int[53];

            // get the count for each 'current' character for each string
            for(int j = 0; j < s.length;j++){
                if(i < s[j].length()){
                    counts[charPrec(s[j].charAt(i))] = counts[charPrec(s[j].charAt(i))]+1;
                }else{
                    counts[0] = counts[0] +1;
                }
            }

            //Intitilizes buckets to be an array of this size.
            // only 53 becuase there are only 53 options it's a lowercase
            // letter, 26, uperecase letter, 26, or null 1
            // so total of 53 buckeets.
            for(int k=0; k <counts.length; k++){
                mapBuckets[k] = new String[counts[k]];
                //buckets.put(k,new String[counts[k]]);
            }

            // Fill the buckets
            // keep track of the current index of array of the current bucket
            int[] tempCount = new int [53];
            int key = 0;
            for(int j = 0; j < s.length; j++){
                if(i < s[j].length()) {
                    key = charPrec(s[j].charAt(i));
                }else{
                    key =0;
                }
                mapBuckets[key][tempCount[key]] = s[j];
                //buckets.get(key)[tempCount[key]] = s[j];
                tempCount[key] = tempCount[key] +1;
            }

            // Reconstruct the array from the buckets
            // keep track of starting index to replace in original array.
            int reIndex = 0;
            // only 53 since 53 buckets
            for(int h=0; h < counts.length; h++){
                // the bucket has at least an element
                if(mapBuckets[h].length != 0){
                    for(int m = 0; m < mapBuckets[h].length; m++){
                        s[reIndex] = mapBuckets[h][m];
                        reIndex++;
                    }
                }
//                if(buckets.get(h).length !=0){
//                    for(int m = 0; m < buckets.get(h).length; m ++){
//                        s[reIndex] = buckets.get(h)[m];
//                        reIndex++;
//                    }
//                }
            }

        }

        //prints the sorted array.
        for(int p = 0; p<s.length; p++){
            System.out.print(s[p]+",");
        }
    }

    /**
     * Retrieves the inserted characters precedent value.
     * @param c The character to get the precedent value of.
     * @return An integer 1-52 representing its precedent among letter characters and -1 if
     *         is not a letter character.
     */
    private static int charPrec(char c){
        if(c == 'A'){
            return 1;
        }else if(c == 'B'){
            return 2;
        }else if(c == 'C'){
            return 3;
        }else if(c == 'D'){
            return 4;
        }else if(c == 'E'){
            return 5;
        }else if(c == 'F'){
            return 6;
        }else if(c == 'G'){
            return 7;
        }else if(c == 'H'){
            return 8;
        }else if(c == 'I'){
            return 9;
        }else if(c == 'J'){
            return 10;
        }else if(c == 'K'){
            return 11;
        }else if(c == 'L'){
            return 12;
        }else if(c == 'M'){
            return 13;
        }else if(c == 'N'){
            return 14;
        }else if(c == 'O'){
            return 15;
        }else if(c == 'P'){
            return 16;
        }else if(c == 'Q'){
            return 17;
        }else if(c == 'R'){
            return 18;
        }else if(c == 'S'){
            return 19;
        }else if(c == 'T'){
            return 20;
        }else if(c == 'U'){
            return 21;
        }else if(c == 'V'){
            return 22;
        }else if(c == 'W'){
            return 23;
        }else if(c == 'X'){
            return 24;
        }else if(c == 'Y'){
            return 25;
        }else if(c == 'Z'){
            return 26;
        }else if(c == 'a'){
            return 27;
        }else if(c == 'b'){
            return 28;
        }else if(c == 'c'){
            return 29;
        }else if(c == 'd'){
            return 30;
        }else if(c == 'e'){
            return 31;
        }else if(c == 'f'){
            return 32;
        }else if(c == 'g'){
            return 33;
        }else if(c == 'h'){
            return 34;
        }else if(c == 'i'){
            return 35;
        }else if(c == 'j'){
            return 36;
        }else if(c == 'k'){
            return 37;
        }else if(c == 'l'){
            return 38;
        }else if(c == 'm'){
            return 39;
        }else if(c == 'n'){
            return 40;
        }else if(c == 'o'){
            return 41;
        }else if(c == 'p'){
            return 42;
        }else if(c == 'q'){
            return 43;
        }else if(c == 'r'){
            return 44;
        }else if(c == 's'){
            return 45;
        }else if(c == 't'){
            return 46;
        }else if(c == 'u'){
            return 47;
        }else if(c == 'v'){
            return 48;
        }else if(c == 'w'){
            return 49;
        }else if(c == 'x'){
            return 50;
        }else if(c == 'y'){
            return 51;
        }else if(c == 'z'){
            return 52;
        }
        return -1;
    }
}

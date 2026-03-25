public class PalindromeTriplet {

    /**
     * Performs tests and prints the results of finding a palindrome triplet with the
     * tripletIndex() method from an array of strings.
     * @param args User input, not used in this.
     */
    public static void main(String[] args){
        String[] test = {"race","car","ecar",""};
        int [] [] result = tripletIndex(test);
        for(int i=0; i < result.length; i++){
            System.out.println("{"+result[i][0]+", "+result[i][1]+", "+result[i][2]+"}");
        }

        System.out.println("--------------");

        String[] test2 = {"RaC", "E", "cAr", ""};
        result = tripletIndex(test2);
        for(int i=0; i < result.length; i++){
            System.out.println("{"+result[i][0]+", "+result[i][1]+", "+result[i][2]+"}");
        }
    }

    /**
     * Find all possible palindrome triplet combinations from an array of strings
     * and returns a 2D array containing the index from the input of the strings
     * that from the palindrome triplet in the order i, j, k.
     * @param input Array of strings to find the index of palindrome triplets.
     * @return A 2D integer array with the index of every possible palindrome triplet
     *         in the order i, j, k.
     */
    public static int[][] tripletIndex(String[] input){

        int rowNum = 0;
        // check how many triplets are in there to determine the number of rows
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                for(int k = 0; k < input.length; k++){
                    if(i != j && j != k && i != k){
                        if(isPalindromeTriplet(input[i],input[j],input[k])){
                            rowNum++;
                        }
                    }
                }
            }
        }

        int[][] result = new int[rowNum][3];
        // keep track of row index
        int index = 0;
        // go through triplets again to now fill the 2D array
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                for(int k = 0; k < input.length; k++){
                    if(i != j && j != k && i != k){
                        if(isPalindromeTriplet(input[i],input[j],input[k])){
                            // add it in the order i, j, and k
                            result[index][0] = i;
                            result[index][1] = j;
                            result[index][2] = k;
                            index++;
                        }
                    }
                }
            }
        }


        return result;
    }

    /**
     * Checks if three strings, in their order, are a palindrome triplet, by checking
     * the front and back, and moving in until the middle is reached, or at any point
     * the left and right character do not match. It is analyzed as if it were one string
     * in the form i + j +k.
     * @param i The first string, which is the left section the potential palindrome.
     * @param j The second string, which is the middle section of the potential palindrome.
     * @param k The third string, which is the right section of the potential palindrome
     * @return True if the three strings are a palindrome triplet, False if not.
     */
    private static boolean isPalindromeTriplet(String i, String j, String k){
        // two pointers to analyze it as if it were one continuous string.
        int left = 0;
        int right = i.length() + j.length() + k.length()-1;
        char lefty;
        char righty;

        // loop throught end and front until they cross, to check if it matches, then
        // return false if they don't at any point
        while(left < right){
            //find left-most
            // left-most is at i
            if(left < i.length()){
                lefty = i.charAt(left);
            }else if(left < i.length()+j.length()){
                // left is at j and adjust it to the left equivalent of j
                lefty = j.charAt(left - i.length());
            }else{
                // left is at k and adjust it to be the left equivalent of k
                lefty = k.charAt(left - i.length() - j.length());
            }

            // find right-most
            // right-most is at k and adjust it to the right equivalent on k
            if(i.length()+j.length()-1 < right){
                righty = k.charAt(right - i.length() - j.length());
            }else if(i.length()-1 < right){
                // right at j, adjust right to the right equivalent of j
                righty = j.charAt(right - i.length());
            }else{
                // right at i
                righty = i.charAt(right);
            }

            // checks if left and right are not a pair, and if not it's not a
            // palindrome
            if(!caseAndPair(lefty,righty)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    /**
     * Check is two characters are a matching pair, meaning they are the same letter
     * regardless if it is upper or lower case.
     * @param first The first character in the pair to check.
     * @param second The second character in the pair to check.
     * @return True if the two are the same letter, False if they are not.
     */
    private static boolean caseAndPair(char first, char second){
        if((first == 'a' || first == 'A') && (second == 'a' || second == 'A')){
            return true;
        }else if((first == 'b' || first == 'B') && (second == 'b' || second == 'B')){
            return true;
        }else if((first == 'c' || first == 'C') && (second == 'c' || second == 'C')){
            return true;
        }else if((first == 'd' || first == 'D') && (second == 'd' || second == 'D')){
            return true;
        }else if((first == 'e' || first == 'E') && (second == 'e' || second == 'E')){
            return true;
        }else if((first == 'f' || first == 'F') && (second == 'f' || second == 'F')){
            return true;
        }else if((first == 'g' || first == 'G') && (second == 'g' || second == 'G')){
            return true;
        }else if((first == 'h' || first == 'H') && (second == 'h' || second == 'H')){
            return true;
        }else if((first == 'i' || first == 'I') && (second == 'i' || second == 'I')){
            return true;
        }else if((first == 'j' || first == 'J') && (second == 'j' || second == 'J')){
            return true;
        }else if((first == 'k' || first == 'K') && (second == 'k' || second == 'K')){
            return true;
        }else if((first == 'l' || first == 'L') && (second == 'l' || second == 'L')){
            return true;
        }else if((first == 'm' || first == 'M') && (second == 'm' || second == 'M')){
            return true;
        }else if((first == 'n' || first == 'N') && (second == 'n' || second == 'N')){
            return true;
        }else if((first == 'o' || first == 'O') && (second == 'o' || second == 'O')){
            return true;
        }else if((first == 'p' || first == 'P') && (second == 'p' || second == 'P')){
            return true;
        }else if((first == 'q' || first == 'Q') && (second == 'q' || second == 'Q')){
            return true;
        }else if((first == 'r' || first == 'R') && (second == 'r' || second == 'R')){
            return true;
        }else if((first == 's' || first == 'S') && (second == 's' || second == 'S')){
            return true;
        }else if((first == 't' || first == 'T') && (second == 't' || second == 'T')){
            return true;
        }else if((first == 'u' || first == 'U') && (second == 'u' || second == 'U')){
            return true;
        }else if((first == 'v' || first == 'V') && (second == 'v' || second == 'V')){
            return true;
        }else if((first == 'w' || first == 'W') && (second == 'w' || second == 'W')){
            return true;
        }else if((first == 'x' || first == 'X') && (second == 'x' || second == 'X')){
            return true;
        }else if((first == 'y' || first == 'Y') && (second == 'y' || second == 'Y')){
            return true;
        }else if((first == 'z' || first == 'Z') && (second == 'z' || second == 'Z')){
            return true;
        }
        return false;
    }

}

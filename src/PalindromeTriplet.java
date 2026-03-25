public class PalindromeTriplet {

    public static void main(String[] args){
        String[] test = {"race","car","ecar",""};

        int [] [] result = tripletIndex(test);
    }

    public static int[][] tripletIndex(String[] input){
        int rowNum = 0;
        // check how many triplets are in there to determine the number of rows

        int[][] result = new int[rowNum][3];
        // go through triplets again to now fill the 2D array


        return result;
    }

    private static boolean isPalindromeTriplet(String i, String j, String k){
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
            }else if(left > i.length()-1 && left < i.length()+j.length()){
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

            if(!caseAndPair(lefty,righty)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

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

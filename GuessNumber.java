/**
 *
 * @author Taylor
 */
public class GuessNumber {

    
    public static void main(String[] args) {
        
        //The game guesses between 1 and the maximum number entered by user
        StdOut.print("Enter maximum range: ");
        int maxNumber = StdIn.readInt();
        StdIn.readLine();  //Clears input buffer
        
        StdOut.println("Think of a number between 1 and " + maxNumber);
        
        StdOut.println("You are thinking of " + binarySearch(1,maxNumber));  //Prints out the result of the recursive binary search
    }
    
    //Uses binary search to find the number the user is thinking of
    public static int binarySearch(int low, int high) {
        if((high - low)==1) {  //If the program has arrived at the correct number
            return low;
        }
        int mid = low + (high - low) /2;  //Generates the middle number, rounding down
        
        StdOut.println("Is your number less than " + mid + "?");
        char response = StdIn.readChar();
        StdIn.readLine(); //Clears input buffer
        
        
        if (response  == 'y') {
            return binarySearch (low, mid); //Recursively search on the lesser half
        }
        else {
            return binarySearch (mid, high);  //Recursively search on the greater half
        }
    }
    
}

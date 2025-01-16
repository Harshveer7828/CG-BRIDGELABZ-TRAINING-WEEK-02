public class PallindromeChecker {

    //create attribute
    String text;

    //create constructor
    PallindromeChecker(String text){
        this.text = text;
    }

    //method to check if the string is pallindrome or not
    public static boolean isPallindrome(String text){
        int i = 0;
        int j = text.length() - 1;
        while(i < j){
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //method to display the result
    void displayResult(){
        if(isPallindrome(text)){
            System.out.println(text + " is a Pallindrome");
        }else{
            System.out.println(text + " is not a Pallindrome");
        }
    }

    public static void main(String[] args) {
        
        //Create an object of the PallindromeChecker class
        PallindromeChecker pallindromeChecker = new PallindromeChecker("naman");
        pallindromeChecker.displayResult();
    }
}
package lab2.lab1;
public class Palindrome {
    public static void main(String[] args) {

        String r = reverse("Doctor");
        //string r equal to the result of the word mama
        System.out.println(r);
    }

    public static String reverse(String args) {
        // args stands for whatever word the string reverse stands for in this case it is mama
        char[] letters = new char[args.length()];
        // here we make a array of letters which is just the size of the string args

        for (int i = args.length() - 1; i >= 0; i--) {
            // i stands for index, for loop here i=0 means that it will start from 0 to forward to the end of the character
            // i++ means that the for loop index i will go forward not reverse
           
            System.out.println(args.charAt(i));
            // here system print out the string args at the character at index
           } 
           return args;
           // return : ends function execution and specifies a value to be returned to the function caller.
    }
    
}
       
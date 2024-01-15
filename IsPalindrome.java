package lab2.lab1;
public class IsPalindrome {
    public static void main(String[] args){

        String s1 = "hello";
        String s2="hello";

        for(int i= 0; i< s1.length(); i++)
       
        if(s1.equals(s2))
        //Is Palindrome = Истина, Palindrome = Ложь
        {
            System.out.println("Is Palindrome");
        }
        else
        {
            System.out.println("Is not Palindrome");
        }
    }
}

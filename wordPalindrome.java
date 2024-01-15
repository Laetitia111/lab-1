package lab2.lab1;
public class wordPalindrome {
    public static void main(String[] args){

        String s1 = "madam racecar apple kayak song noon";

        String[] words = s1.split(" ");
        for (String word : words)// here we check if for each word its palindrome 
        {
            if (IsPalindrome(word)) {
                System.out.println(word + " is palindrome"); // if the word is palindrome then let it print
            }
           
        }
    }

    // making palindrome logic (аргумент командной строки)
    public static boolean IsPalindrome(String s1) {

        int i1 = 0; // Строка i1 начинается с 0
        int i2 = s1.length() -1; // we take s1 and whatever the lenght of the string is and subtract by 1

        while(i2 > i1) // i1 is the first character example madam i1 is m and i2 is m the last character 
         {
            if(s1.charAt(i1) != s1.charAt(i2)) // here we compare if the character i1 is equal to i2
             {
                return false; // if i1 and i2 not equals the it should return false
            }
            i1++; //i1 вперёд
            i2--; // i2 реверс
        }
        return true; // if i1 equals i2 then it return true, that means its palindrome
    }
}


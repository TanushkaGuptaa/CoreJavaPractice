/*
program: write java program to chek the number is palindrome or not.
@Author:Tanushka Gupta
@Date:18/08/2022
*/
class Main {
  public static void main(String[] args) {
 
        int rem, rev= 0, temp;
    int n=505; // user defined number to be checked for palindrome 
 
        temp = n;
 
        // reversed integer is stored in variable 
        while( n != 0 )
        {
            rem= n % 10;
            rev= rev * 10 + rem;
            n=n/10;
        }
 
        // palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
        if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}
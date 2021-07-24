// java assignment program https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1# // date: 24 july 2021
import java.lang.String;
import java.util.Scanner;

public class Main
{
    static String conRevstr(String S1, String S2) {
        // code here
         StringBuffer st=new StringBuffer();
        st=st.append(S1+S2);
        String s=new String(st.reverse());
        return s;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 Strings: ");
		String Str1=sc.nextLine();
		String Str2=sc.nextLine();
		String op=conRevstr(Str1,Str2);
		System.out.println(op);
	}
}
/*-----------------------------------------
output:
Enter 2 Strings: 

geeks

forgeeks

skeegrofskeeg
------------------------
Enter 2 Strings: 

final

out put

tup tuolanif








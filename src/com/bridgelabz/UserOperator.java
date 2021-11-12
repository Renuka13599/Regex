package com.bridgelabz;
/*Author:Renu
*Date:12/11/21
* Purpose:This program has to pass rule1 is minimum 8 characters is valid or not"
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void passrule1(String passrule1){
        String regex = "^[A-Z a-z 0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passrule1);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your name "+passrule1+" is Valid");
        }
        else{
            System.out.println("Your name "+passrule1+" is Invalid");
        }
    }

}

package com.bridgelabz;
/*Author:Renu
*Date:12/11/21
* Purpose:This program has to lastname is valid or not"
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void email(String email){
        String regex = "^[A-Z]{1}[- @ .][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your name "+email+" is Valid");
        }
        else{
            System.out.println("Your name "+email+" is Invalid");
        }
    }

}

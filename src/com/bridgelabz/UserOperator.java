package com.bridgelabz;
/*Author:Renu
*Date:12/11/21
* Purpose:This program has to pass rule3 is atlest one special character in the password must be passed valid or not"
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void passrule3(String password){
       // String regex = "^[A-Z a-z 0-9]{9}$";
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your password "+password+" is Valid");
        }
        else{
            System.out.println("Your password "+password+" is Invalid");
        }
    }

}

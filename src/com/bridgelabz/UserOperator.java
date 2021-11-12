package com.bridgelabz;
/*Author:Renu
*Date:12/11/21
* Purpose:This program has to mobile no is valid or not"
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void mobileno(String mobileno){
        String regex = "^[0-9]{2} [6-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileno);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your name "+mobileno+" is Valid");
        }
        else{
            System.out.println("Your name "+mobileno+" is Invalid");
        }
    }

}

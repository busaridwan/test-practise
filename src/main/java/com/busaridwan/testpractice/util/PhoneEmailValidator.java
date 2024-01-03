package com.busaridwan.testpractice.util;

import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@UtilityClass
@Component
public class PhoneEmailValidator {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&.-]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
    public boolean isValidEmailFormat(String email) {
        if (null == email || email.isEmpty()){
            return false;
        }
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean isValidPhoneNumber(String phoneNumber) {
        if (null == phoneNumber || phoneNumber.isEmpty()){
            return false;
        }
        String regex = "^(\\+\\d{1,2})?[-.\\s]?\\(?\\d{1,4}\\)?[-.\\s]?\\d{1,9}[-.\\s]?\\d{1,9}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(phoneNumber).matches();
    }

}


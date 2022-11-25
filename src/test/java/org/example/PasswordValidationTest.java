package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    public void correctPassword() {
        // given
        String pw = "MeinFancyPw12@";

        // when
        boolean actual = PasswordValidation.isValidPassword(pw);

        //then
        assertTrue(actual);
    }

    @Test
    public void stupidPassword() {
        // given
        String pw = "passwort";

        // when
        boolean actual = PasswordValidation.isValidPassword(pw);

        //then
        assertFalse(actual);
    }

    @Test
    public void NotLongEnoughPassword() {
        // given
        String pw = "Pwd123!";

        // when
        boolean actual = PasswordValidation.isValidPassword(pw);

        //then
        assertFalse(actual);
    }

    @Test
    public void noNumbersPassword() {
        // given
        String pw = "NoDigits@";

        // when
        boolean actual = PasswordValidation.isValidPassword(pw);

        //then
        assertFalse(actual);
    }

    @Test
    public void NoLowerCasePassword() {
        // given
        String pw = "193746HAHAHAPASSWORD@";

        // when
        boolean actual = PasswordValidation.isValidPassword(pw);

        //then
        assertFalse(actual);
    }

    @Test
    public void NoUpperCasePassword() {
        // given
        String pw = "193746hihipwd@";

        // when
        boolean actual = PasswordValidation.isValidPassword(pw);

        //then
        assertFalse(actual);
    }

}
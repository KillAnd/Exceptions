import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class TestExceptions {

    private static final Pattern LOGIN_CHECK_SYMBOLS = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    private static final Pattern PASSWORD_CHECK_SYMBOLS = Pattern.compile("[a-zA-Z0-9_]{1,20}");

    public static void enteringPersonalData(String login, String password, String confirmPassword) {

        if (!LOGIN_CHECK_SYMBOLS.matcher(login).matches()) {
            throw new  WrongLoginException("Неподходящий логин!");
        }

        if (!PASSWORD_CHECK_SYMBOLS.matcher(password).matches()) {
            throw new WrongPasswordException("Попробуйте записать пароль по другому!");
        }

        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают!");
        }


    }
}

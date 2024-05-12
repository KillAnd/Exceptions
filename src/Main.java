import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        try {
            TestExceptions.enteringPersonalData("Gorec_96",
                    "java_234",
                    "java_234");
        } catch (WrongLoginException e){
            System.out.println("В поле <логин> возможны только латиница, цифры и символ _");
        } catch (WrongPasswordException e){
            System.out.println("Проверьте правильность написания поля <пароль>," +
                    " возможны только латиница, цифры и символ _. Пароли должны совпадать.");
        }

    }
}
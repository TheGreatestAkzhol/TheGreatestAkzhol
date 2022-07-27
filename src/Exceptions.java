import java.io.IOException;
public class Exceptions {
    static CharSequence[] exception = {"(", ")", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/"};
    static boolean StringIsNotSupported(String input,boolean Exception) {
        /////////////////////If it has operator?/////////////////////////////////////////////
        if (!(input.contains(exception[11])) && !(input.contains(exception[12])) && !(input.contains(exception[13])) && !(input.contains(exception[14]))) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("This string is not supported, string is not mathematical operation");
                Exception = true;
            }
        }
        return Exception;
    }

    static boolean DifferentSystem(String input,boolean RomanNum) {
        ////////////////////////If our system is using different system?/////////////////
                for (int n = 2; n < 11; n++) {
                    if (input.contains(exception[n])) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("You are using different system, type the numbers of one system");
                            RomanNum = false;
                        }
                    }
                }
                return RomanNum;
        }

    }


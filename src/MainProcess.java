import java.io.IOException;
import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        while(true) {
            CharSequence[] romanNumeric = CharsAndArrays.romanNumeric;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = SpaceRemover.SpaceRemove(input);
            boolean exception1 = false;    //строка не является математической операцией
            boolean exception2 = false;    //несколько оперантов
            boolean RomanNum = false;
            boolean ArabicNum = false;
            exception1 = Exceptions.StringIsNotSupported(input,exception1);
            exception2 = IfItHasSeveralOperants.operants(input,exception2);
            if(exception2==true){
                try{
                    throw new IOException();
                }catch(IOException e){
                    System.out.println("The format of mathematical operation is unsupportable, there is several operants");
                }
                break;
            }
            if(exception1){
                try{
                    throw new IOException();
                }catch(IOException e){
                }
                break;
            }
            RomanNum = IsItRomanNum.CheckingForRoma(romanNumeric, input, RomanNum);
            if (RomanNum == false) {
                ArabicNum = true;
            }
            if (RomanNum) {
                try {
                   input = (IsItRomanNum.SolveRoma(input));
                   if(IsItRomanNum.exception){
                       try{
                           throw new IOException();
                       }catch(IOException e){
                       }
                       break;
                   }
                   System.out.println(input);

                } catch (NullPointerException e) {
                    System.out.println("and......");
                    System.out.println("NullPointerException)))))");
                    break;
                }
            } else if (ArabicNum) {
                input = (ArabicSolve.toSolve(input));
                if(ArabicSolve.exception){
                    try{
                        throw new IOException();
                    }catch(IOException e){
                    }
                    break;
                }
                System.out.println(input);
            }
            if(IsItRomanNum.exceptionOfNegative){
                try{
                    throw new IOException();
                }catch(IOException e){
                    break;
                }
            }
        }
        }
    }


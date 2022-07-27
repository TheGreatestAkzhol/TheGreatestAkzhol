import java.io.IOException;

public class IsItRomanNum {
    static boolean exceptionOfNegative = false;
    static boolean exception = false;
    static boolean CheckingForRoma(CharSequence[] romanNumeric, String input,boolean RomanNum) {
        for (int o = 0; o < romanNumeric.length; o++) {
            if (input.contains(romanNumeric[o])) {
                if((!(Exceptions.DifferentSystem(input,RomanNum)))==false){
                    RomanNum = false;
                }else {
                    RomanNum = true;
                }
                break;
            }
        }
        return RomanNum;
    }
    static String SolveRoma(String input) {
        String mainOperator = "";
        int[] numbers = new int[2];
        for(int i = 0; i< CharsAndArrays.operator.length; i++) {
            if (input.contains(CharsAndArrays.operator[i])) {
                mainOperator = CharsAndArrays.operators[i];
                String[] numStr = input.split(mainOperator);
                numStr[0] = ConvertToRoman.convertRomanToInt(numStr[0]);
                numStr[1] = ConvertToRoman.convertRomanToInt(numStr[1]);
                numbers[0] = Integer.parseInt(numStr[0]);
                numbers[1] = Integer.parseInt(numStr[1]);
            }
        }
        if(numbers[0]<numbers[1] && mainOperator == "-"){
            try{
                throw new IOException();
            }catch(IOException e){
                System.out.println("Roman numbers can't be negative");
                exceptionOfNegative = true;
            }
        }
        if (numbers[0] > 10 || numbers[1]>10) {
            try{
                throw new IOException();
            }catch(IOException e){
                System.out.println("Your numbers can't be bigger than 10");
                exception = true;
            }
        }
        int output = 0;
        switch(mainOperator){
            case "\\+":
                output = numbers[0] + numbers[1];
                break;
            case "-":
                output = numbers[0]-numbers[1];
                break;
            case "/":
                output = numbers[0]/numbers[1];
                break;
            case "\\*":
                output = numbers[0]*numbers[1];
                break;
        }
        if(output==0){
            try{
                throw new IOException();
            }catch(IOException e){
                System.out.println("Roman numbers can't be equal to zero");
                exceptionOfNegative = true;
            }
        }
        return IntToRoman.intToRoman(output);
    }
}

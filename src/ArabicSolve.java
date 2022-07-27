import java.io.IOException;

public class ArabicSolve {
    static boolean exception = false;
    static String toSolve(String given){
        given = SpaceRemover.SpaceRemove(given);
        CharSequence[] operator = CharsAndArrays.operator;
        String[] operators = CharsAndArrays.operators;
        String mainOperator = "";
        int[] numbers = new int[2];
        for(int i = 0; i< operator.length; i++) {
            if (given.contains(operator[i])) {
                mainOperator = operators[i];
                String[] numStr = given.split(mainOperator);
                numbers[0] = Integer.parseInt(numStr[0]);
                numbers[1] = Integer.parseInt(numStr[1]);
            }
        }
        if(numbers[0]>10||numbers[1]>10){
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
        return Integer.toString(output);
    }
}

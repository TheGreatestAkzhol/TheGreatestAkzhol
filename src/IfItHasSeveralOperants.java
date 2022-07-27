public class IfItHasSeveralOperants {
    static boolean operants(String input,boolean exception){
        int count = 0;
        for(int i = 0; i<input.length();i++){
            for(int c = 0; c<CharsAndArrays.operator.length;c++){
                if(input.charAt(i) == CharsAndArrays.operants[c]){
                    count++;
                }
            }
        }
        if(count>=2){
            exception = true;
        }
        return exception;
    }
}

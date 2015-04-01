package demo.cli;

public class CoolAverageCalculatorApplication {
    public static final String BAD_AVERAGE_INPUT_MESSAGE = "Bad Usage!!!";

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println(BAD_AVERAGE_INPUT_MESSAGE);
        }

        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.println(sum/args.length);
    }
}

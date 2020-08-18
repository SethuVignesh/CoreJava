public class LearnException {

    //checked
    //unchecked
    //throws
    //try catch finally
    //try-with-resources
    //https://docs.oracle.com/javase/tutorial/essential/exceptions/QandE/questions.html

    public static void main(String[] args) {
        dividebyZero();
        try {
            // int i = 1 / 0;
            dividebyZero();
            System.out.println("try block");
            // int i= 1/0;
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
    }

    private static int dividebyZero() throws ArithmeticException {
        int i = 1 / 0;
        return i;
    }
}

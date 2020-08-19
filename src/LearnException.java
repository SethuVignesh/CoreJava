public class LearnException {

    //checked
    //unchecked
    //throws
    //try catch finally
    //try-with-resources
    //https://docs.oracle.com/javase/tutorial/essential/exceptions/QandE/questions.html

    public static void main(String[] args) {

//        try {
//            int i = 1 / 0;
//        } catch (NullPointerException e) {
////            e.printStackTrace();
//            //user dialog null
//        } catch (ArithmeticException e) {
//            //1-8 select
//        } catch (Exception e) {
//
//        }


//        try {
//            System.out.println("try 1");
//            int i = 1 / 0;
//            System.out.println("try 2");
//        } catch (Exception e) {
//            System.out.println("exception");
//
//        } finally {
//            System.out.println("finally");
//        }

//        Thread.sleep(5000);

//        try {
//            dividBy0();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Please try agian");
//            System.out.println("thirumba try pannunga");
//        }

        try{

        }catch (MyException e){
            e.printStackTrace();
        }


    }


    private static void dividBy0() throws Exception {
        int i = 1 / 0;
    }


}

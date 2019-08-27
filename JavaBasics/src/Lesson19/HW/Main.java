package Lesson19.HW;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BusinessException b = new BusinessException("test");
        SeriousBusinessException c = new SeriousBusinessException("test2");
        try {
            int a = 15 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
        }
        try {
            throw new IOException("Message1");
        } catch (IOException e) {
            System.out.println("caught");
        }
        //        throw new NullPointerException();

        makeBusiness();

    }

    static void doBusiness() {
        throw new BusinessException("lets do some business");
    }

    static void doSeriousBusiness() throws SeriousBusinessException {
        throw new SeriousBusinessException("don't ever ask me about my business");
    }

    static void makeBusiness() {
        try {
            doBusiness();
        }
        catch (NullPointerException npe){
            System.out.println("caughtNullPointer");
        }
        try {
            doSeriousBusiness();
        } catch (SeriousBusinessException sbe) {
            System.out.println("caughtSerious");
        }
        try {
            throwException();
        }
        catch (Exception exc){
            System.out.println("caught exception");
        }
    }

    static void throwException() throws Exception {
        throw new Exception();
    }
}

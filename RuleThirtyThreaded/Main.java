
public class Main {
    public static final int SIZE = 30;

    public static void main(String[] args) {
        long threadStart, threadEnd, timeThreaded;
        long nonthreadStart, nonthreadEnd, timeNonThreaded;
        
        RuleThirtyThreaded test1 = new RuleThirtyThreaded(SIZE);
        RuleThirtyNonThreaded test2 = new RuleThirtyNonThreaded(SIZE);
        

        threadStart = System.currentTimeMillis();
        test1.print();
        threadEnd = System.currentTimeMillis();
        timeThreaded = threadEnd - threadStart;
        System.out.println("THREADED: " + timeThreaded);

        nonthreadStart = System.currentTimeMillis();
        test2.print();
        nonthreadEnd = System.currentTimeMillis();
        timeNonThreaded = nonthreadEnd - nonthreadStart;
        System.out.println("NON-THREADED: " + timeNonThreaded);
    }
}
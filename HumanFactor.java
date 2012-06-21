import static java.lang.Thread.sleep;

public class HumanFactor implements Runnable {

    public void run() {
        while (true) {
            doSomething();

            try {
                sleep(500);
            } catch (InterruptedException e) {
                //nevermind
            }

            doSomethingElse();
        }
    }

}


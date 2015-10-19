import org.junit.Test;

public class AppTest {
    @Test
    public void syncTest() {

    }

    private void m4t1(Inner inner) {
        synchronized (inner) {
            inner.method4t1();
        }
    }

    private void m4t2(Inner inner) {
        inner.method4t2();
    }

    public static void main(String[] args) {
        final AppTest app = new AppTest();
        final Inner inner = app.new Inner();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                app.m4t1(inner);
            }
        }, "Thread-t1");
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                app.m4t2(inner);
            }
        }, "Thread-t2");

        t1.start();
        t2.start();

    }

    class Inner {
        private void method4t1() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : Inner.m4t1()=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                }
            }
        }

        private void method4t2() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : Inner.m4t2()=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                }
            }
        }
    }

}


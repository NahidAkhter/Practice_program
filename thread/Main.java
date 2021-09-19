package thread;

import java.util.concurrent.*;

public class Main implements Runnable {

    private String appName;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<?> future = service.submit(new Main("N_APP"));
        System.out.println("future :: "+ future.get());

    }

    public Main(String appName) {
        this.appName = appName;
    }


//    @Override
//    public Object call() throws Exception {
//
//        return appName;
//    }

    @Override
    public void run() {
        System.out.println("callable Method...." + appName);
    }
}

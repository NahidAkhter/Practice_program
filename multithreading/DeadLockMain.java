package multithreading;

import java.util.Random;

public class DeadLockMain {

    public static void main(String[] args) throws InterruptedException {

        Intersection intersection = new Intersection();
        Thread threadA = new Thread(new TrainA(intersection));
        Thread threadB = new Thread(new TrainB(intersection));

        threadA.start();
        Thread.sleep(2000);

        threadB.start();

    }


    static class TrainA implements Runnable {

        private Intersection intersection;
        private Random random = new Random();

        public TrainA(Intersection intersection) {
            this.intersection = intersection;
        }

        @Override
        public void run() {

            while(true){
                intersection.railA();
            }

        }
    }

    static class TrainB implements Runnable {

        private Intersection intersection;
        private Random random = new Random();

        public TrainB(Intersection intersection) {
            this.intersection = intersection;
        }

        @Override
        public void run() {

            while(true){
                intersection.railB();
            }

        }
    }


    static class Intersection {

        private Object railA = new Object();
        private Object railB = new Object();

        public void railA(){
            synchronized (railA){
                System.out.println("railA is locked by thread - " + Thread.currentThread().getName());

                synchronized (railB){
                    System.out.println("Train is passing through railB -" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


        public void railB(){
            synchronized (railA){
                System.out.println("railB is locked by thread - " + Thread.currentThread().getName());

                synchronized (railB){
                    System.out.println("Train is passing through railA -" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }


}


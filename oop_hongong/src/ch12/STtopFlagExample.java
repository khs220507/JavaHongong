package ch12;

public class STtopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread.start();
        try{ Thread.sleep(1000);} catch (InterruptedException e) {}
        printThread.setStop(true); // 스레드를 종료하기 위해 stop필드를 true로 변경
    }
}

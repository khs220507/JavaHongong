package ch12;

public class ex03 {
    public static void main(String[] args) {
        Runnable beepTask = new ex02();
        Thread thread = new Thread(beepTask);
        thread.start();
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}

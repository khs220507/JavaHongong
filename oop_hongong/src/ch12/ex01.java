package ch12;

import java.awt.*;

public class ex01 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
        for(int i=0; i<5; i++)
        {
            toolkit.beep();
            try{Thread.sleep(500);} catch (Exception e){}
        }
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
}

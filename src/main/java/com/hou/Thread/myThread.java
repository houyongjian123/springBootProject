package com.hou.Thread;

    public class myThread extends Thread{
        public static int ticket=100;
        @Override
        public void run() {
            while(true){
                if(ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"还剩下"+--ticket+"张票");
            }
        }
    }


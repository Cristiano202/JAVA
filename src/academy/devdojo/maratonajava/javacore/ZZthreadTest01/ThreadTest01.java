package academy.devdojo.maratonajava.javacore.ZZthreadTest01;

class ThreadExample extends Thread {
    private char c;

    public ThreadExample (char c ){
        this.c=c;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<1000;i++){
            System.out.println(c);
            if (i%100==0){
                System.out.println();
            }
        }
    }
}

public class ThreadTest01 {

    public static void main(String[] args) {
        ThreadExample t1 =new ThreadExample('m');
        t1.run();

    }
}

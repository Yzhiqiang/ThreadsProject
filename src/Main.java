/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:03 2021/11/30
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
//
//        new Thread(new MyThread()).start();    //先创建一个新的线程，然后该线程调用此方法的run方法
//        for(int i = 0; i < 10000; i++) {
//            System.out.println("2222222222");
//        }
        new Thread(new Print("111111")).start();
        new Thread(new Print("222222")).start();
        for(int i = 0; i < 1000; i++) {
            System.out.println("33333");
        }
    }
}

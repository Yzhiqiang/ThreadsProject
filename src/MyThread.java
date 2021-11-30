/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:02 2021/11/30
 * @Modified By:
 */
public class MyThread extends Thread{
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println("1111111111");
        }
    }
}

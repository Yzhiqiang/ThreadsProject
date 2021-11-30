/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 19:24 2021/11/30
 * @Modified By:
 */
public class Print implements Runnable{
    private String message;
    Print (String message) {
        this.message = message;
    }
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(message);
        }
    }
}

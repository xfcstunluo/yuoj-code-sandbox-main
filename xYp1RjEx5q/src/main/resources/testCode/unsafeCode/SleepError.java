
/**
 * 在resources文件夹里面包名要去掉
 * 类名也要改为Main 因为执行时是全部按照名为Main来设置的
 * 无限睡眠（阻塞程序执行）
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR=60*60*1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("三点睡五点起，阎王夸我好身体");

    }
}

package bio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author 傅泽杭
 * @Data 2024-03-25 20:27
 * @Description
 */
public class BioClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        AtomicInteger connectCount = new AtomicInteger(0);
        //连接bio server
        CountDownLatch count = new CountDownLatch(1);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Socket socket = new Socket();
                        count.await();
                        socket.connect(new InetSocketAddress(9090));
                        System.out.println("连接完成" + connectCount.getAndIncrement());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
        count.countDown();
        Thread.sleep(100000);
    }
}
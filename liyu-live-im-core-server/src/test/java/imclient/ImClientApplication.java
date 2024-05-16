package imclient;


import imclient.handler.ClientHandler;
import org.liyu.live.im.constants.ImMsgCodeEnum;
import org.liyu.live.im.core.server.common.ImMsg;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.liyu.live.im.core.server.common.TcpImMsgDecoder;
import org.liyu.live.im.core.server.common.TcpImMsgEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author 傅泽杭
 * @Data 2024-03-25 20:27
 * @Description
 */
@SpringBootApplication
public class ImClientApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ImClientApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}


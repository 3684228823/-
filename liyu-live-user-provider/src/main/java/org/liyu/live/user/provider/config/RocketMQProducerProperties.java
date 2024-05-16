package org.liyu.live.user.provider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author RocketMQ生产者的配置信息
 * @Data 2024-03-01 15:32
 * @Description
 */
@ConfigurationProperties(prefix = "liyu.rmq.producer")
@Configuration
public class RocketMQProducerProperties {

    //rocketmq的nameServe地址
    private String nameSrv;
    //分组名称
    private String groupName;
    private String applicationName;
    //超时时间
    private Integer sendMsgTimeout;
    //消息重发次数
    private Integer retryTimes;

    public String getNameSrv() {
        return nameSrv;
    }

    public void setNameSrv(String nameSrv) {
        this.nameSrv = nameSrv;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Integer getSendMsgTimeout() {
        return sendMsgTimeout;
    }

    public void setSendMsgTimeout(Integer sendMsgTimeout) {
        this.sendMsgTimeout = sendMsgTimeout;
    }

    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    @Override
    public String toString() {
        return "RocketMQProducerProperties{" +
                "nameSrv='" + nameSrv + '\'' +
                ", groupName='" + groupName + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", sendMsgTimeout=" + sendMsgTimeout +
                ", retryTimes=" + retryTimes +
                '}';
    }
}

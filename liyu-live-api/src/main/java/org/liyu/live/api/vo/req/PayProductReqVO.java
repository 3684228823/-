package org.liyu.live.api.vo.req;

/**
 * @Author 傅泽杭
 * @Data 2024-04-20 11:59
 * @Description
 */
public class PayProductReqVO {

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 支付来源 (直播间，个人中心，聊天页面，第三方宣传页面，广告弹窗引导)
     * @see org.liyu.live.bank.constants.PaySourceEnum
     */
    private Integer paySource;

    /**
     * 支付渠道
     * @see org.liyu.live.bank.constants.PayChannelEnum
     */
    private Integer payChannel;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPaySource() {
        return paySource;
    }

    public void setPaySource(Integer paySource) {
        this.paySource = paySource;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    @Override
    public String toString() {
        return "PayProductReqVO{" +
                "productId=" + productId +
                ", payChannel=" + payChannel +
                ", paySource=" + paySource +
                '}';
    }
}

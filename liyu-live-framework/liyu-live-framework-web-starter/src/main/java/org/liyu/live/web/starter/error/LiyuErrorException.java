package org.liyu.live.web.starter.error;

/**
 * @Author 傅泽杭
 * @Data 2024-03-24 13:55
 * @Description
 */
public class LiyuErrorException extends RuntimeException{
    private int errorCode;
    private String errorMsg;

    public LiyuErrorException(int errorCode,String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public LiyuErrorException(LiyuBaseError LiyuBaseError) {
        this.errorCode = LiyuBaseError.getErrorCode();
        this.errorMsg = LiyuBaseError.getErrorMsg();
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

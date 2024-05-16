package org.liyu.live.web.starter.error;

/**
 * @Author 傅泽杭
 * @Data 2024-03-24 14:10
 * @Description
 */
public class ErrorAssert {


    /**
     * 判断参数不能为空
     *
     * @param obj
     * @param qiyuBaseError
     */
    public static void isNotNull(Object obj, LiyuBaseError qiyuBaseError) {
        if (obj == null) {
            throw new LiyuErrorException(qiyuBaseError);
        }
    }

    /**
     * 判断字符串不能为空
     *
     * @param str
     * @param qiyuBaseError
     */
    public static void isNotBlank(String str, LiyuBaseError qiyuBaseError) {
        if (str == null || str.trim().length() == 0) {
            throw new LiyuErrorException(qiyuBaseError);
        }
    }

    /**
     * flag == true
     *
     * @param flag
     * @param qiyuBaseError
     */
    public static void isTure(boolean flag, LiyuBaseError qiyuBaseError) {
        if (!flag) {
            throw new LiyuErrorException(qiyuBaseError);
        }
    }

    /**
     * flag == true
     *
     * @param flag
     * @param qiyuErrorException
     */
    public static void isTure(boolean flag, LiyuErrorException qiyuErrorException) {
        if (!flag) {
            throw qiyuErrorException;
        }
    }
}

package org.liyu.live.common.interfaces.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-26 11:36
 * @Description
 */
public class ListUtils {

    /**
     * 将一个大的List集合拆分成多个子List集合
     * @param list
     * @param subNum
     * @return
     * @param <T>
     */
    public static <T> List<List<T>> splistList(List<T> list, int subNum) {
        List<List<T>> resultList = new ArrayList<>();
        int priIndex = 0;
        int lastIndex = 0;
        int insertTimes = list.size() / subNum;
        List<T> subList;
        for (int i = 0; i <= insertTimes; i++) {
            priIndex = subNum * i;
            lastIndex = priIndex + subNum;
            if (i != insertTimes) {
                subList = list.subList(priIndex,lastIndex);
            } else {
                subList = list.subList(priIndex,list.size());
            }
            if (subList.size() > 0) {
                resultList.add(subList);
            }
        }
        return resultList;
    }
}

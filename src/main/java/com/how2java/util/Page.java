package com.how2java.util;

/**
 * 
 * 分页类
 *
 * @author 杨岸石 17749262827
 * @version 1.0, 2017年10月12日 下午1:37:49
 */
public class Page {
    int start=0;
    int count = 5;
    int last = 0;
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }
     
    /**
     * @Description: 计算末页
     *
     * @param total 设定文件
     * void 返回类型
     */
    public void caculateLast(int total) {
        // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
        if (0 == total % count)
            last = total - count;
        // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
        else
            last = total - total % count;       
    }
	
}
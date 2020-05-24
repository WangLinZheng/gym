package com.gym.pojo;


import java.io.Serializable;

/**
 * 分页实体类
 *
 * @author wlz
 */
public class PageBean implements Serializable {

    private int start; //当前位置：是指从第几页开始取数据。
    private int count; //每页显示的数据数量
    private int total; //数据总个数
    private String param;

    private static final int defaultCount = 5; //默认每页显示5条数据

    //getter和setter方法自动生成


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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public static int getDefaultCount() {
        return defaultCount;
    }

    //当类实例化一个对象时会自动调用这个空参构造方法
    public PageBean (){
        count = defaultCount;
    }

    //构造方法重载
    public PageBean(int start, int count) {
        this();//调用空参的构造方法
        this.start = start;
        this.count = count;
    }

    //判断是否有前一页。
    public boolean isHasPreviouse(){
        //如果当前位置的数据的数值是0，说明没有前一页。
        if(start==0)
            return false;
        return true;
    }

    //判断是否有后一页。
    public boolean isHasNext(){
        //如果当前位置的首条数据的数值=尾页的首条数据的数值，说明是同一页，所以没有后一页了。
        if(start==getLast())
            return false;
        return true;
    }

    //获取总页数。根据每页显示的数量count以及总共有多少条数据total，计算出总页数。
    public int getTotalPage(){
        int totalPage;
        // 假设总数是50，是能够被5整除的，那么就有10页。举例：50/5=10···0，20/5=4···0
        if (0 == total % count)
            totalPage = total /count;
            // 假设总数是51，不能够被5整除的，那么就有11页。举例：51/5=10···1
        else
            totalPage = total / count + 1;
        //如果总页数为0，默认总页数为一页。即4/5=0···4；3/5=0···3；
        if(0==totalPage)
            totalPage = 1;
        return totalPage;
    }

    //获取尾页的首条数据位置的数值。如第二页的首条数据的位置的数值是5（由第0条数据开始取，每页5条数据）
    public int getLast(){
        int last;
        // 假设总数是50，是能够被5整除的，那么推算出最后一页的开始位置的数据的数值就是45
        if (0 == total % count)
            last = total - count;
            // 假设总数是51，不能够被5整除的，那么推算出最后一页的开始的数据的数值就是50
        else
            last = total - total % count;
        last = last<0?0:last;
        return last;
    }

    @Override
    public String toString() {
        return "PageBean [start=" + start + ", count=" + count + ", total=" + total + ", getStart()=" + getStart()
                + ", getCount()=" + getCount() + ", isHasPreviouse()=" + isHasPreviouse() + ", isHasNext()="
                + isHasNext() + ", getTotalPage()=" + getTotalPage() + ", getLast()=" + getLast() + "]";
    }


}

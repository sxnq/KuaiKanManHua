package xunqaing.bwie.com.kuaikanmanhua.bean;

public class WeekInfoBean {
    private int day;
    private long daytime;

    public WeekInfoBean(int day, long daytime) {
        this.day = day;
        this.daytime = daytime;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public long getDaytime() {
        return daytime;
    }

    public void setDaytime(long daytime) {
        this.daytime = daytime;
    }
}

package com.example.httpsdk.bean;

public class JumpBean {


    String name;
    int type;
    int count;
    int times;
    String startTime;
    String endTime;
    String token;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

//    public int getOriginalCount()
//    {
//        return originalCount;
//    }
//    public void setOriginalCount(int originalCount)
//    {
//        this.originalCount = originalCount;
//    }


    public int getTimes(){
        return times;
    }
    public void setTimes(int times){
        this.times = times;
    }

//    public int getOriginalTimes()
//    {
//        return originalTimes;
//    }
//    public void setOriginalTimes(int originalTimes)
//    {
//        this.originalTimes = originalTimes;
//    }


    public String getStartTime() {
        return startTime;
    }


    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}

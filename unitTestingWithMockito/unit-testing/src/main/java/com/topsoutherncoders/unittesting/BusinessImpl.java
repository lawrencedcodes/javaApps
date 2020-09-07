package com.topsoutherncoders.unittesting;

public class BusinessImpl {

    private Dataservice dataservice;

    public void setDataservice(Dataservice dataservice) {
        this.dataservice = dataservice;
    }

    public int calcSum(int[] data) {
        int sum = 0;
        for (int i:data) {
          sum+=i;
        }
        return sum;
    }

    public int calcSumWithService() {
        int sum = 0;
        int[] data = dataservice.retrieveAllData();
        for (int i:data) {
            sum+=i;
        }
        return sum;
    }
}

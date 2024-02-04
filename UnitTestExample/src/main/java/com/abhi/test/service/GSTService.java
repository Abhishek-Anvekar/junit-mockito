package com.abhi.test.service;

public class GSTService {

    private GstProvider gstProvider;

    public GSTService(GstProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public int calculateGST(){
        System.out.println("calculating GST");
        int rate = this.gstProvider.getGSTDetails();
        System.out.println("GST rate is "+rate);
        return rate;
    }
}

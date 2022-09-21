package com.techprimers.kafka.springbootkafkaproducerexample.model;

public class Dog {

    private String originalOpertionId;
    private String status;
    private String statusDesc;

    public Dog(){}

    public String getOriginalOpertionId() {
        return originalOpertionId;
    }

    public void setOriginalOpertionId(String originalOpertionId) {
        this.originalOpertionId = originalOpertionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Dog(String originalOpertionId, String status, String statusDesc) {
        this.originalOpertionId = originalOpertionId;
        this.status = status;
        this.statusDesc = statusDesc;
    }
}

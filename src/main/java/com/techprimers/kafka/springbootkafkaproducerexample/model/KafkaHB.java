package com.techprimers.kafka.springbootkafkaproducerexample.model;

import java.security.PublicKey;

public class KafkaHB {
    private String rqUID_h;
    private String originalOpertionId_b;

    public KafkaHB () {}
    public String getRqUID_h() {
        return rqUID_h;
    }

    public void setRqUID_h(String rqUID_h) {
        this.rqUID_h = rqUID_h;
    }

    public String getOriginalOpertionId_b() {
        return originalOpertionId_b;
    }

    public void setOriginalOpertionId_b(String originalOpertionId_b) {
        this.originalOpertionId_b = originalOpertionId_b;
    }

    public KafkaHB(String rqUID_h, String originalOpertionId_b) {
        this.rqUID_h = rqUID_h;
        this.originalOpertionId_b = originalOpertionId_b;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("rqUID_h: ").append(rqUID_h).append("\n");
        sb.append("\n\n");
        sb.append("{\"").append("originalOpertionId_b\":").append(originalOpertionId_b).append("\"}");
        return sb.toString();
    }
}

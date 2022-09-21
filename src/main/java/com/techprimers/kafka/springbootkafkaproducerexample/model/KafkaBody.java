package com.techprimers.kafka.springbootkafkaproducerexample.model;

public class KafkaBody {

    private String originalOpertionId;
    private String code;

    public KafkaBody(String originalOpertionId, String code) {
        this.originalOpertionId = originalOpertionId;
        this.code = code;
    }

    public KafkaBody() {

    }

    public String getOriginalOpertionId() {
        return originalOpertionId;
    }

    public void setOriginalOpertionId(String originalOpertionId) {
        this.originalOpertionId = originalOpertionId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
package com.techprimers.kafka.springbootkafkaproducerexample.resource;

import com.techprimers.kafka.springbootkafkaproducerexample.model.KafkaBody;
import com.techprimers.kafka.springbootkafkaproducerexample.model.KafkaHB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, KafkaBody> kafkaTemplate1;
    private KafkaTemplate<String, KafkaHB> kafkaTemplate2;

    private static final String TOPIC = "channel2";

    @PostMapping(value = "/postbod1",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public KafkaBody kafkaBody(@RequestBody KafkaBody kafkaBody) {
        kafkaBody.getCode();
        kafkaBody.getOriginalOpertionId();
        kafkaTemplate1.send(TOPIC, kafkaBody);
        return kafkaBody;
    }


    public KafkaTemplate<String, KafkaHB> getKafkaTemplate2() {
        return kafkaTemplate2;
    }

    public KafkaTemplate<String, KafkaBody> getKafkaTemplate1() {
        return kafkaTemplate1;
    }
/*  @PostMapping(value = "/postbod2",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<KafkaBody> create(@RequestBody KafkaBody kafkaBody,
                                            @RequestBody KafkaHB kafkaHB,
                                            @RequestHeader("rqUID") String rqUID) {
        kafkaHB.setRqUID_h(rqUID);
        kafkaHB.getRqUID_h();
        kafkaBody.getCode();
        kafkaBody.getOriginalOpertionId();
        kafkaTemplate2.send(TOPIC, kafkaHB);
        return ResponseEntity.status(HttpStatus.OK)
                .header("Custom-Header", "foo")
                .body(kafkaBody);
    }*/


}

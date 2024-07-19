package delivery.infra;

import delivery.domain.*;
import delivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ViewViewHandler {

//<<< DDD / CQRS
    @Autowired
    private ViewRepository viewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_CREATE_ (@Payload  ) {
        try {

            if (!.validate()) return;

            // view 객체 생성
            View view = new View();
            // view 객체에 이벤트의 Value 를 set 함
            view.set();
            // view 레파지 토리에 save
            viewRepository.save(view);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




//>>> DDD / CQRS
}


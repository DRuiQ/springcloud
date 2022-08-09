package com.team.service.Impl;

import com.team.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)  //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;  //消息发送管道
    @Override
    public String send() {
        String s= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(s).build());
        System.out.println(s);
        return null;
    }
}

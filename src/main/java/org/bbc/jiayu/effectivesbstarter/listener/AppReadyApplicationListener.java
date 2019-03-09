package org.bbc.jiayu.effectivesbstarter.listener;

import org.bbc.jiayu.effectivesbstarter.event.HungryApplicationEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
@Component
public class AppReadyApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent hungryApplicationEvent) {
        System.out.println("接收到ApplicationReadyEvent事件："+hungryApplicationEvent.getClass());
    }
}
    

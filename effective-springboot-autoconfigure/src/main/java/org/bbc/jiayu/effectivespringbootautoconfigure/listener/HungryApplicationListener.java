package org.bbc.jiayu.effectivespringbootautoconfigure.listener;

import org.bbc.jiayu.effectivespringbootautoconfigure.event.HungryApplicationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
public class HungryApplicationListener implements ApplicationListener<HungryApplicationEvent> {
    private static Logger log = LoggerFactory.getLogger(HungryApplicationListener.class);
    @Override
    public void onApplicationEvent(HungryApplicationEvent hungryApplicationEvent) {
        log.info("接收到饥饿事件:"+hungryApplicationEvent.getHuman().toString());
    }
}
    

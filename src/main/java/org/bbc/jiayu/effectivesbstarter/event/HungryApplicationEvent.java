package org.bbc.jiayu.effectivesbstarter.event;

import org.bbc.jiayu.effectivesbstarter.entity.Human;
import org.springframework.context.ApplicationEvent;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
public class HungryApplicationEvent extends ApplicationEvent {
    private Human human;
    public HungryApplicationEvent(Object source) {
        super(source);
    }
    public HungryApplicationEvent(Human h) {
        super(h);
        human =h;
    }

    public Human getHuman() {
        return human;
    }
}
    

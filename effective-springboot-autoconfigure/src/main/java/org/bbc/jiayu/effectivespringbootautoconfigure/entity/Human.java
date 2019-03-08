package org.bbc.jiayu.effectivespringbootautoconfigure.entity;

import lombok.Builder;
import lombok.Getter;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
@Getter
@Builder
public class Human {
    private String name;
    private String feedMeWith;
    public String toString(){
        return String.format("Human:{%s},{%s}", name,feedMeWith);
    }
}
    

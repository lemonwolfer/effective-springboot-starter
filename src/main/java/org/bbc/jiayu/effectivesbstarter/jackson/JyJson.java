package org.bbc.jiayu.effectivesbstarter.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Throwables;
import java.io.IOException;

/**
 * author:lichao
 * date:2019/3/7
 * description:
 **/
public class JyJson {
    private static final Logger log = LoggerFactory.getLogger(JyJson.class);
    private ObjectMapper objectMapper;
    public JyJson(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }
    public <T> String obj2string(T t) {
        try {
            log.info("JyJsonobj2string:loginfo:{}",t.toString());
            return this.objectMapper.writeValueAsString(t);
        } catch (IOException var3) {
            throw Throwables.propagate(var3);
        }
    }

    public <T> String obj2string(T t, Class<?> serializationView) {
        try {
            log.info("JyJsonobj2string:loginfo:{}",t.toString());
            return this.objectMapper.writerWithView(serializationView).writeValueAsString(t);
        } catch (IOException var4) {
            throw Throwables.propagate(var4);
        }
    }

}
    

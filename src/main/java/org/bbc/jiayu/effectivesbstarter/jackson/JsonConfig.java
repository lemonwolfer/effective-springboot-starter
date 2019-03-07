package org.bbc.jiayu.effectivesbstarter.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;

/**
 * author:lichao
 * date:2019/3/7
 * description:
 **/
@Configuration
/*@ConditionalOnBean(ObjectMapper.class)*/
@AutoConfigureAfter(
        name = {"org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration"}
)
public class JsonConfig {
    public JsonConfig(){
    }
    @Bean
    @Primary
    @ConditionalOnBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();

        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<>() {
            /**
             * Method that can be called to ask implementation to serialize
             * values of type this serializer handles.
             *
             * @param value       Value to serialize; can <b>not</b> be null.
             * @param gen         Generator used to output resulting Json content
             * @param serializers Provider that can be used to get serializers for
             */
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString("empty");
            }


        });
        return objectMapper;
    }
    @Bean
    public JyJson getJson(ObjectMapper mapper){
        return new JyJson(mapper);
    }

}
    

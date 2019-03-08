package org.bbc.jiayu.effectivespringbootautoconfigure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
@Validated
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    @NotNull(
            message = "prefix必须填写"
    )
    private String prefix;
    private String suffix;


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}


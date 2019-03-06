package org.bbc.jiayu.effectivesbstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
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


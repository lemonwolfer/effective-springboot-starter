package org.bbc.jiayu.effectivesbstarter.service;

/**
 * author:lichao
 * date:2019/3/6
 * description:
 **/
public class ExampleService {

    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}

package com.SpringBoot.SpringBoot;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//myproject-service.url=http://hv.com
//        myproject-service.port=8085
@ConfigurationProperties(prefix = "myproject-service")
@Component
public class ServiceConfig {
        private String url ;
        private String port ;

        public String getUrl() {
            return url;
        }

        public String getPort() {
            return port;
        }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPort(String port) {
        this.port = port;
    }
}

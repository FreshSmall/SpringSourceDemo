package cn.com.extension.aware.messageSourceAware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;


@Component
public class DemoMessageSource implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {

    }
}

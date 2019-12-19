package cn.com.extension.applicationListener;

import org.springframework.context.ApplicationEvent;


/**
 * 用户注册事件
 */
public class UserRegisterEvent extends ApplicationEvent {

    public UserRegisterEvent(Object source) {
        super(source);
    }

}

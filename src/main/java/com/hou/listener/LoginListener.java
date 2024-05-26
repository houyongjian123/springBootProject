package com.hou.listener;

import com.hou.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;

public class LoginListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        Object source = event.getSource();
        System.out.println(source);
    }
}

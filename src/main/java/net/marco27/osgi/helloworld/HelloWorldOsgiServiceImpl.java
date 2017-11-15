package net.marco27.osgi.helloworld;

import org.osgi.service.component.annotations.Component;

@Component
public class HelloWorldOsgiServiceImpl implements HelloWorldOsgiService {

    @Override
    public void helloWorldOsgi() {
        System.out.println("Hello World OSGi!");
    }
}
package net.marco27.osgi.helloworld;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Component
@Service(value = HelloWorldService.class)
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public void helloWorld() {
        System.out.println("Hello World!");
    }
}
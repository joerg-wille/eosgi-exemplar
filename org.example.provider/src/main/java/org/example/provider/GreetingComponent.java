package org.example.provider;

import org.example.api.Greeting;
import org.osgi.service.component.annotations.Component;

@Component(
        property = {
                "osgi.command.scope=greeting",
                "osgi.command.function=sayHello"
        })
public class GreetingComponent implements Greeting {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}

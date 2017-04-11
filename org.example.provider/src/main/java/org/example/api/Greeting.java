package org.example.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Greeting {
    String sayHello(String name);
}

package org.example.provider;

import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import static org.junit.Assert.*;

public class GreetingTest {

    private final BundleContext context = FrameworkUtil.getBundle(GreetingTest.class).getBundleContext();

    @Test
    public void testGreeting() throws Exception {
        ServiceReference<?>[] refs = context.getAllServiceReferences("org.example.api.Greeting", null);
        assertNotNull(refs);
        assertEquals(1, refs.length);
    }
}

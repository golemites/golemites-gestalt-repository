package org.golemites.gestalt.webapp.example;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component (
        service = Foo.class, immediate = true)
public class Foo {

    private final static Logger LOG = LoggerFactory.getLogger(Foo.class);

    @Activate
    public void sayHello(BundleContext bc)
    {
        LOG.error("Here!!! ");
        System.out.println("Hello3!");
    }
}

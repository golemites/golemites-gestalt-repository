package org.golemites.gestalt.webapp.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {
    private final static Logger LOG = LoggerFactory.getLogger(Foo.class);

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        LOG.error("Here Bundle Activator: start");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        LOG.error("Here Bundle Activator: stop");
    }
}

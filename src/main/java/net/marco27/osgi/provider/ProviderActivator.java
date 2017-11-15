package net.marco27.osgi.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import net.marco27.osgi.helloworld.HelloWorldOsgiService;
import net.marco27.osgi.helloworld.HelloWorldOsgiServiceImpl;

public class ProviderActivator implements BundleActivator {
    private ServiceRegistration registration;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(
                HelloWorldOsgiService.class.getName(),
                new HelloWorldOsgiServiceImpl(),
                null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();
    }
}
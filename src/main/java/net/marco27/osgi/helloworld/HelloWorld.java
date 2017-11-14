package net.marco27.osgi.helloworld;

import java.util.Dictionary;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;

@Component(metatype = true, immediate = true, label = "Hello World Component")
@Property(name = HelloWorld.PROPERTY_NAME, value = { HelloWorld.PROPERTY_DEFAULT_VALUE })
public class HelloWorld {
    protected BundleContext bundleContext;

    protected static final String PROPERTY_NAME = "osgiPropertyName";
    protected static final String PROPERTY_DEFAULT_VALUE = "osgiPropertyValue";

    private String privateProperty;

    @Activate
    protected void activate(BundleContext bundleContext, ComponentContext componentContext) {
        this.bundleContext = componentContext.getBundleContext();
        Dictionary<?, ?> properties = componentContext.getProperties();
        this.privateProperty = properties.get(PROPERTY_NAME) != null ? (String) properties.get(PROPERTY_NAME) : PROPERTY_DEFAULT_VALUE;
    }
}
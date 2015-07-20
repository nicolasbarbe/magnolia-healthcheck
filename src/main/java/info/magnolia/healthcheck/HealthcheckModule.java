package info.magnolia.monitoring.healthcheck;

/**
 * This class is optional and represents the configuration for the healthcheck module.
 * By exposing simple getter/setter/adder methods, this bean can be configured via content2bean
 * using the properties and node from <tt>config:/modules/healthcheck</tt>.
 * If you don't need this, simply remove the reference to this class in the module descriptor xml.
 */
public class HealthcheckModule {
    /* you can optionally implement info.magnolia.module.ModuleLifecycle */

}

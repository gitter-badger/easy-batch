package org.easybatch.integration.osgi;

import org.easybatch.integration.osgi.api.EasyBatchService;
import org.easybatch.integration.osgi.impl.EasyBatchServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * An activator class for Easy Batch bundle.
 *
 * @author Mahmoud Ben Hassine (md.benhassine@gmail.com)
 */
public class Activator implements BundleActivator {

    ServiceRegistration easyBatchServiceRegistration;

    public void start(BundleContext context) throws Exception {
        EasyBatchService easyBatchService = new EasyBatchServiceImpl();
        easyBatchServiceRegistration = context.registerService(EasyBatchService.class.getName(), easyBatchService, null);
    }

    public void stop(BundleContext context) throws Exception {
        if (easyBatchServiceRegistration != null) {
            easyBatchServiceRegistration.unregister();
        }
    }

}

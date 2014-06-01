package org.easybatch.integration.osgi.impl;

import org.easybatch.core.api.EasyBatchReport;
import org.easybatch.core.impl.EasyBatchEngine;
import org.easybatch.integration.osgi.api.EasyBatchService;

/**
 * Easy Batch OSGi service implementation.
 *
 * @author Mahmoud Ben Hassine (md.benhassine@gmail.com)
 */
public class EasyBatchServiceImpl implements EasyBatchService {

    @Override
    public EasyBatchReport execute(final EasyBatchEngine easyBatchEngine) throws Exception {
        return easyBatchEngine.call();
    }

}

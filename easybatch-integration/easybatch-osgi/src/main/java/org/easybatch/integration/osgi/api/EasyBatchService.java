package org.easybatch.integration.osgi.api;

import org.easybatch.core.api.EasyBatchReport;
import org.easybatch.core.impl.EasyBatchEngine;

/**
 * Easy Batch OSGi service interface.
 *
 * @author Mahmoud Ben Hassine (md.benhassine@gmail.com)
 */
public interface EasyBatchService {

    /**
     * Call Easy Batch engine and return the batch execution report.
     * @param easyBatchEngine the engine to call
     * @return the batch execution report
     * @throws Exception thrown if a problem occurs during batch execution
     */
    EasyBatchReport execute(final EasyBatchEngine easyBatchEngine) throws Exception;

}

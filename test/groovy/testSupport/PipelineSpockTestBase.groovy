package testSupport

import com.lesfurets.jenkins.unit.RegressionTest
import spock.lang.Specification

/**
 * A base class for Spock testing using the pipeline helper
 */
class PipelineSpockTestBase extends Specification  implements RegressionTest {

    /**
     * Delegate to the test helper
     * https://docs.groovy-lang.org/2.4.7/html/gapi/groovy/lang/Delegate.html
     */
    @Delegate PipelineTestHelper pipelineTestHelper

    /**
     * Do the common setup
     */
    def setup() {

        // Set callstacks path for RegressionTest
        callStackPath = 'test/callstacks/'

        // Create and config the helper
        pipelineTestHelper = new PipelineTestHelper()
        pipelineTestHelper.setUp()
    }
}

// https://github.com/macg33zr/pipelineUnit/blob/master/pipelineTests/groovy/testSupport/PipelineSpockTestBase.groovy
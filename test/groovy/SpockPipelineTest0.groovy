
import org.junit.*
// import com.lesfurets.jenkins.unit.PipelineTestHelper
import testSupport.PipelineTestHelper
import testSupport.PipelineSpockTestBase
// import com.lesfurets.jenkins.unit.declarative.*

class SpockPipelineTest0 extends PipelineSpockTestBase {
    
    def script

    def setup() {
        script = loadScript("vars/testPipeline.groovy")
    }
    
    void "shouldExecuteWithoutErrors"() {
        when:
            script.call([:])
 
        then:
            assertJobStatusSuccess()
            printCallStack()
    }
}
import testSupport.PipelineSpockTestBase
import module_Artifact
import module_Notification
 
class SpockPipelineTest1 extends PipelineSpockTestBase {
 
    def script
    def mavenMock
    def artifactMock
    def notificationMock
 
    def setup() {
        registerMocks()
        registerPluginMethods()
        script = loadScript('vars/sampleMavenPipeline.groovy')
    }
 
    def cleanup() {
        printCallStack()
    }
 
    void 'Happy flow'() {
        when:
        script.call([:])
 
        then:
        assertJobStatusSuccess()
 
    }
 
    def registerPluginMethods() {
        // Junit
        // https://plugins.jenkins.io/junit
        helper.registerAllowedMethod('junit', [HashMap.class], null)
    }
 
    def registerMocks() {
        mavenMock = Mock(Closure)
        helper.registerAllowedMethod('module_Maven', [String.class], mavenMock)
 
        artifactMock = Mock(module_Artifact)
        binding.setVariable('module_Artifact', artifactMock)
 
        notificationMock = Mock(module_Notification)
        binding.setVariable('module_Notification', notificationMock)
    }
}
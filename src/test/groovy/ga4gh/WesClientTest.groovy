package ga4gh

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import io.swagger.model.Ga4ghWesState
import io.swagger.model.Ga4ghWesWorkflowListResponse
import io.swagger.model.Ga4ghWesWorkflowLog
import io.swagger.model.Ga4ghWesWorkflowRequest
import io.swagger.model.Ga4ghWesWorkflowRunId
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class WesClientTest extends Specification {

    @Shared @AutoCleanup EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared WesClient client = embeddedServer.applicationContext.getBean(WesClient)

    def "test wes get service-info with http client with context bean"() {

        when:
        def info = client.getServiceInfo()
        then:
        info.getEngineVersions().nextflow == '1.0'
    }

    def 'should get workflow status'() {
        when:
        def status = client.getWorkflowStatus('12345')
        then:
        status.getWorkflowId() == '12345'
        status.state == Ga4ghWesState.COMPLETE
    }

    def 'should list workflow' () {

        when:
        def resp = client.listWorkflows(new Long(10),'20','foo')
        then:
        resp instanceof Ga4ghWesWorkflowListResponse
        resp.getWorkflows().size() == 2

    }

    def 'should get workflow log' () {
        when:
        def resp = client.getWorkflowLog('54321')
        then:
        resp instanceof Ga4ghWesWorkflowLog
        resp.getWorkflowId() == '54321'
    }

    def 'should create run a new workflow' () {

        given:
        def req = new Ga4ghWesWorkflowRequest()
        req.setWorkflowDescriptor('echo hello')
        req.setWorkflowType('NFL')
        req.setWorkflowTypeVersion('1.0')
        req.setWorkflowParams('x=y')
        
        when:
        def resp = client.runWorkflow(req)

        then:
        resp instanceof Ga4ghWesWorkflowRunId
        resp.getWorkflowId() == '7584'

    }

    def 'should delete a running workflow' () {

        when:
        def resp = client.cancelJob('8943')
        then:
        resp instanceof Ga4ghWesWorkflowRunId
        resp.getWorkflowId() == '8943'

    }
}

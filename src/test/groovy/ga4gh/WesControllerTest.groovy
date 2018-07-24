package ga4gh

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import io.swagger.model.Ga4ghWesServiceInfo
import io.swagger.model.Ga4ghWesState
import io.swagger.model.Ga4ghWesWorkflowListResponse
import io.swagger.model.Ga4ghWesWorkflowLog
import io.swagger.model.Ga4ghWesWorkflowRequest
import io.swagger.model.Ga4ghWesWorkflowRunId
import io.swagger.model.Ga4ghWesWorkflowStatus
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class WesControllerTest extends Specification {

    @Shared @AutoCleanup EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared @AutoCleanup HttpClient client = HttpClient.create(embeddedServer.URL)

    def 'test wes get workflow status' () {

        when:
        def resp = client.toBlocking().retrieve(HttpRequest.GET('/ga4gh/wes/v1/workflows/123/status'), Ga4ghWesWorkflowStatus)
        then:
        resp instanceof Ga4ghWesWorkflowStatus
        resp.getWorkflowId() == '123'
        resp.state == Ga4ghWesState.COMPLETE
    }

    def 'test wes post workflow creation' () {

        when:
        def req = new Ga4ghWesWorkflowRequest()
        req.setWorkflowDescriptor('echo hello')
        req.setWorkflowType('NFL')
        req.setWorkflowTypeVersion('1.0')
        req.setWorkflowParams('x=y')
        def resp = client.toBlocking().retrieve(HttpRequest.POST('/ga4gh/wes/v1/workflows', req), Ga4ghWesWorkflowRunId)
        then:
        resp instanceof Ga4ghWesWorkflowRunId
        resp.getWorkflowId() == '7584'

    }

    def 'test wes post workflow with json' () {

        when:
        def req = '{"workflow_descriptor":"aa","workflow_params":"bbb","workflow_pype":"ccc","workflow_type_version":"dd", "key_values": {"foo":"xxx", "bar":"yyy"}}'

        def resp = client.toBlocking().retrieve(HttpRequest.POST('/ga4gh/wes/v1/workflows', req), Ga4ghWesWorkflowRunId)
        then:
        resp instanceof Ga4ghWesWorkflowRunId
        resp.getWorkflowId() == '7584'

    }


    def 'test wes get workflow log' () {

        when:
        def resp = client.toBlocking().retrieve(HttpRequest.GET('/ga4gh/wes/v1/workflows/123'), Ga4ghWesWorkflowLog)
        then:
        resp instanceof Ga4ghWesWorkflowLog
        resp.getWorkflowId() == '123'
    }

    def 'test wes delete workflow' () {

        when:
        def resp = client.toBlocking().retrieve(HttpRequest.DELETE('/ga4gh/wes/v1/workflows/8943'), Ga4ghWesWorkflowRunId)
        then:
        resp instanceof Ga4ghWesWorkflowRunId
        resp.getWorkflowId() == '8943'
    }


    def 'test wes list workflows' () {
        when:
        def resp = client.toBlocking().retrieve(HttpRequest.GET('/ga4gh/wes/v1/workflows?page_size=10&page_token=20&key_value_search=foo'), Ga4ghWesWorkflowListResponse)
        then:
        resp instanceof Ga4ghWesWorkflowListResponse
        resp.getWorkflows().size() == 2
    }

    def 'test wes get service-info with http client' () {

        when:
        def info = client.toBlocking().retrieve(HttpRequest.GET('/ga4gh/wes/v1/service-info'), Ga4ghWesServiceInfo)
        then:
        info instanceof Ga4ghWesServiceInfo
        info.getEngineVersions().nextflow == '1.0'
        info.getSupportedFilesystemProtocols().contains('file')
    }



}

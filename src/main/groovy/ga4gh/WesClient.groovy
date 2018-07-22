package ga4gh

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.Client
import io.swagger.model.Ga4ghWesServiceInfo
import io.swagger.model.Ga4ghWesWorkflowListResponse
import io.swagger.model.Ga4ghWesWorkflowLog
import io.swagger.model.Ga4ghWesWorkflowRequest
import io.swagger.model.Ga4ghWesWorkflowRunId
import io.swagger.model.Ga4ghWesWorkflowStatus
/**
 * Implements a declarative HTTP client
 *
 * See
 *   https://docs.micronaut.io/latest/guide/index.html#clientAnnotation
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Client('/ga4gh/wes/v1')
interface WesClient {

    /**
     * Get information about Workflow Execution Service.  May include information related (but not limited to) the workflow descriptor formats, versions supported, the WES API versions supported, and information about general the service availability.
     */
    @Get("/service-info")
    Ga4ghWesServiceInfo getServiceInfo()

    @Get('/workflows/{workflowId}/status')
    Ga4ghWesWorkflowStatus getWorkflowStatus(String workflowId)

    @Get('/workflows?pageSize={pageSize}&pageToken={pageToken}&keyValueSearch={keyValueSearch}')
    Ga4ghWesWorkflowListResponse listWorkflows(Long pageSize, String pageToken, String keyValueSearch)

    @Get("/workflows/{workflowId}")
    Ga4ghWesWorkflowLog getWorkflowLog(String workflowId)

    @Post("/workflows")
    Ga4ghWesWorkflowRunId runWorkflow(@Body Ga4ghWesWorkflowRequest body)

    @Delete("/workflows/{workflowId}")
    Ga4ghWesWorkflowRunId cancelJob(String workflowId)
}

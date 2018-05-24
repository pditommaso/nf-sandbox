package client

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.Client
import io.swagger.model.Ga4ghWesServiceInfo
/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Client('/ga4gh/wes/v1')
interface WesClient {


    /**
     * Get information about Workflow Execution Service.  May include information related (but not limited to) the workflow descriptor formats, versions supported, the WES API versions supported, and information about general the service availability.
     *
     */
    @Get("/service-info")
    Ga4ghWesServiceInfo getServiceInfo()


//    @Delete('/workflows/{workflow_id}')
////    @Path("/ga4gh/wes/v1/workflows/{workflow_id}")
////    @Consumes({ "application/json" })
////    @Produces({ "application/json" })
////    @ApiOperation(value = "Cancel a running workflow", tags={  })
////    @ApiResponses(value = {
////        @ApiResponse(code = 200, message = "", response = Ga4ghWesWorkflowRunId.class) })
//    Ga4ghWesWorkflowRunId cancelJob(String workflow_id)
//
//    /**
//     * Get detailed info about a running workflow
//     *
//     */
//    @Get('/workflows/{workflow_id}')
////    @Path("/ga4gh/wes/v1/workflows/{workflow_id}")
////    @Consumes({ "application/json" })
////    @Produces({ "application/json" })
////    @ApiOperation(value = "Get detailed info about a running workflow", tags={  })
////    @ApiResponses(value = {
////        @ApiResponse(code = 200, message = "", response = Ga4ghWesWorkflowLog.class) })
//    Ga4ghWesWorkflowLog getWorkflowLog(String workflow_id)
//
//    /**
//     * Get quick status info about a running workflow
//     *
//     */
//    @Get('/workflows/{workflow_id}/status')
////    @Path("/ga4gh/wes/v1/workflows/{workflow_id}/status")
////    @Consumes({ "application/json" })
////    @Produces({ "application/json" })
////    @ApiOperation(value = "Get quick status info about a running workflow", tags={  })
////    @ApiResponses(value = {
////        @ApiResponse(code = 200, message = "", response = Ga4ghWesWorkflowStatus.class) })
//    Ga4ghWesWorkflowStatus getWorkflowStatus(String workflow_id)
//
//    /**
//     * List the workflows, this endpoint will list the workflows in order of oldest to newest.  There is no guarantee of live updates as the user traverses the pages, the behavior should be decided (and documented) by each implementation.
//     *
//     */
//    @Get('/workflows')
////    @Path("/ga4gh/wes/v1/workflows")
////    @Consumes({ "application/json" })
////    @Produces({ "application/json" })
////    @ApiOperation(value = "List the workflows, this endpoint will list the workflows in order of oldest to newest.  There is no guarantee of live updates as the user traverses the pages, the behavior should be decided (and documented) by each implementation.", tags={  })
////    @ApiResponses(value = {
////        @ApiResponse(code = 200, message = "", response = Ga4ghWesWorkflowListResponse.class) })
//    Ga4ghWesWorkflowListResponse listWorkflows(@QueryParam("page_size")Long pageSize, @QueryParam("page_token")String pageToken, @QueryParam("key_value_search")String keyValueSearch)
//
//    /**
//     * Run a workflow, this endpoint will allow you to create a new workflow request and retrieve its tracking ID to monitor its progress.  An important assumption in this endpoint is that the workflow_params JSON will include parameterizations along with input and output files.  The latter two may be on S3, Google object storage, local filesystems, etc.  This specification makes no distinction.  However, it is assumed that the submitter is using URLs that this system both understands and can access. For Amazon S3, this could be accomplished by given the credentials associated with a WES service access to a particular bucket.  The details are important for a production system and user on-boarding but outside the scope of this spec.
//     *
//     */
//    @Post('/workflows')
////    @Path("/ga4gh/wes/v1/workflows")
////    @Consumes({ "application/json" })
////    @Produces({ "application/json" })
////    @ApiOperation(value = "Run a workflow, this endpoint will allow you to create a new workflow request and retrieve its tracking ID to monitor its progress.  An important assumption in this endpoint is that the workflow_params JSON will include parameterizations along with input and output files.  The latter two may be on S3, Google object storage, local filesystems, etc.  This specification makes no distinction.  However, it is assumed that the submitter is using URLs that this system both understands and can access. For Amazon S3, this could be accomplished by given the credentials associated with a WES service access to a particular bucket.  The details are important for a production system and user on-boarding but outside the scope of this spec.", tags={  })
////    @ApiResponses(value = {
////        @ApiResponse(code = 200, message = "", response = Ga4ghWesWorkflowRunId.class) })
//    Ga4ghWesWorkflowRunId runWorkflow(Ga4ghWesWorkflowRequest body)


}

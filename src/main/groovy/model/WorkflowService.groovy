package model

import grails.gorm.services.Service

/**
 * Implement a basic data access object using GORM data service.
 *
 * In a nutshell: The @Service annotation is an AST transformation
 * that will automatically implement the service for you.
 * You can then obtain the service by looking it up from the HibernateDatastore instance eg:
 *
 *   def service = hibernateDatastore.getService(WorkflowService)
 *
 * See
 *   http://gorm.grails.org/latest/hibernate/manual/index.html#dataServices
 *   https://docs.micronaut.io/latest/guide/index.html#_using_gorm_in_a_groovy_application
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Service(Workflow)
interface WorkflowService {

    Workflow get(Integer id)

    Workflow save(Workflow run)

}

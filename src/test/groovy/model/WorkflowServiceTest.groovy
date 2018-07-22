package model

import io.micronaut.context.ApplicationContext
import org.grails.orm.hibernate.HibernateDatastore
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class WorkflowServiceTest extends Specification {

    @Shared @AutoCleanup ApplicationContext context =
                        ApplicationContext.build().mainClass(WorkflowServiceTest).start()

    @Shared HibernateDatastore datastore = context.getBean(HibernateDatastore)

    def 'should save and retrieve a workflow run through service' () {
        given:
        def service = datastore.getService(WorkflowService)
        when:
        service.save(new Workflow(id: 1, workDir: '/some/path'))
        def run = service.get(1)
        then:
        run.workDir == '/some/path'
    }


}

package model

import io.micronaut.context.ApplicationContext
import model.Book
import model.BookDAO
import org.grails.orm.hibernate.HibernateDatastore
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class BookTest extends Specification {

    @Shared @AutoCleanup ApplicationContext context =
                        ApplicationContext.build().mainClass(BookTest).start()

    @Shared HibernateDatastore hibernateDatastore = context.getBean(HibernateDatastore)

    def 'should save and retrieve a workflow run with service' () {
        given:
        def dao = hibernateDatastore.getService(BookDAO)
        when:
        dao.save(new Book(id: 1, name: 'foo'))
        def run = dao.get(1)
        then:
        run.name == 'foo'
    }

    def 'should save and retrieve a workflow run' () {

        when:
        new Book(id: 1, name: 'foo').save()
        def run = Book.get(1)
        
        then:
        run.name == 'foo'

    }


}

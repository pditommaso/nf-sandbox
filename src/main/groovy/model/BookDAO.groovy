package model

import grails.gorm.services.Service

/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Service(Book)
interface BookDAO {

    Book get(Integer id)

    Book save(Book run)

}

package model

import grails.gorm.annotation.Entity
/**
 * Basic workflow entity to manage
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Entity
class Workflow {

    Integer id

    String workDir

}

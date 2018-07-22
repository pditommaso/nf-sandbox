package web

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

/**
 * Basic controller implement for a index page
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Controller("/")
class HomeController {

    @Get("/")
    @Produces(MediaType.TEXT_HTML)
    String index() {
        "<html><body>Hello world!</body></html>"
    }

}

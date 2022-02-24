package retrofit.okhttp.responseservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class Controller {

    @GetMapping("/hello")
    fun helloRetrofit(): String = "hello Retrofit2!"

    @GetMapping("/data")
    fun dataWithDate(): HelloResponse =
        HelloResponse(id = 1, today = LocalDateTime.now(), name = "seoin")

}
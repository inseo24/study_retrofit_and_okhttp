package retrofit.okhttp.responseservice

import java.time.LocalDateTime

data class HelloResponse(
    val id : Int,
    val today : LocalDateTime,
    val name : String
) {
}
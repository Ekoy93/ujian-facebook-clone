package Network

import Model.Posts
import retrofit2.http.GET

interface ApiServices {

    @GET("nashihu/production_stuff/master/hlv_apr21/facebook.json")
    suspend fun getFacebook() : List<Posts>
}
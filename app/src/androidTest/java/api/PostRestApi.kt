package api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostRestApi {

    companion object {

        private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        fun getService(): PostService {
            return retrofit.create(PostService::class.java)
        }

    }



}
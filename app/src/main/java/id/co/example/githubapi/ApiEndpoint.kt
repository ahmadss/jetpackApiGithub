package id.co.example.githubapi

import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("users/ahmadss/repos")
    fun getRepos(): Call<List<Repo>>

}
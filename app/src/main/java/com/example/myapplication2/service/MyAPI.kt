package com.example.myapplication2.service

import com.example.myapplication2.model.User
import io.reactivex.Observable
import retrofit2.http.GET


interface MyAPI {
    @get:GET("posts")
    val posts:Observable<List<User>>
}
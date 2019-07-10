package com.example.myapplication2.model

import com.google.gson.annotations.SerializedName

class UsersList {
    @SerializedName("results")
    var users: List<Users>? = null
}
package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication2.adapter.PostAdapter
import com.example.myapplication2.model.User
import com.example.myapplication2.service.MyAPI
import com.example.myapplication2.service.RetrofitClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    internal lateinit var jsonApi:MyAPI
    internal var  compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init api
        val retrofit = RetrofitClient.instance
        jsonApi = retrofit.create(MyAPI::class.java)

        recycler_posts.setHasTransientState(true)
        recycler_posts.layoutManager = LinearLayoutManager(this)
        fetchData()
    }


    private fun fetchData(){
        compositeDisposable.add(jsonApi.posts
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{posts->displayData(posts)}
        )
    }

    private fun displayData(posts: List<User>){
        val adapter = PostAdapter(this, posts!!)
        recycler_posts.adapter = adapter
    }
}

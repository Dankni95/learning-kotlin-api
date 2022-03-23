package com.watch.data.api

import com.watch.data.vo.AddressDetails
import retrofit2.Call
import retrofit2.http.GET


interface RetrofitService {

        @GET("/repos/octocat/hello-world/issues")
        fun getDataFromApi(): Call<List<AddressDetails>>

}
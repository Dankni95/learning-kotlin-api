package com.watch.data.api

import com.watch.data.vo.AddressDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptoApiInterface {

    //https://blockchain.info/rawaddr/$bitcoin_address
    @GET("rawaddr/{address}")
    fun fetchCryptoAddressInfo(@Path("address") address: String): Call<AddressDetails>


}
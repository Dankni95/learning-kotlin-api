package com.watch.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.watch.data.api.CryptoApiInterface
import com.watch.data.api.CryptoClient
import com.watch.data.api.RetrofitService
import com.watch.data.vo.AddressDetails
import retrofit2.*
import java.util.Objects

class CryptoViewModel : ViewModel() {

    var cryptoData = MutableLiveData<AddressDetails>()

    private val ADDRESS = "bc1qgulgqzx34cz82f2fyr3ytk57t8mzefpv207tne"

    fun getCryptoData(){
        val retrofitService = CryptoClient.getRetrofitInstance().create(CryptoApiInterface::class.java)

        retrofitService.fetchCryptoAddressInfo(ADDRESS).enqueue(object : Callback<AddressDetails> {

            override fun onResponse(
                call: Call<AddressDetails>,
                response: Response<AddressDetails>
            ) {
               cryptoData.value = response.body()
            }

            override fun onFailure(call: Call<AddressDetails>, t: Throwable) {
                Log.e("error", t.toString())
            }


        })
    }
}
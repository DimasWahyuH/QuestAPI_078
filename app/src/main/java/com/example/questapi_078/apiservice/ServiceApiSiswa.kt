package com.example.questapi_078.apiservice

import com.example.questapi_078.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET("bacateman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>

}

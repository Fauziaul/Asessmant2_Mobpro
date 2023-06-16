package org.d3if0097.hitungnilaiakhir.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import org.d3if0097.hitungnilaiakhir.model.Saran
import retrofit2.http.GET

private const val BASE_URL = "https://raw.githubusercontent.com/Fauziaul/json-hitung-nilai-akhir/main/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface KategoriApiService {
    @GET("kategori.json")
    suspend fun getNilai(): List<Saran>
}
object SaranApi{
    val service: KategoriApiService by lazy {
        retrofit.create(KategoriApiService::class.java)
    }
}

enum class ApiStatus { LOADING, SUCCESS, FAILED}
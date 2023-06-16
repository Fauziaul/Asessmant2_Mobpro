package org.d3if0097.hitungnilaiakhir.ui.saran

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if0097.hitungnilaiakhir.network.KategoriApiService
import java.lang.IllegalArgumentException

class SaranViewModelFactory (
    private val api: KategoriApiService
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(KategoriApiService::class.java)) {
            return SaranViewModel(api) as T
        }
        throw IllegalArgumentException("Unknow ViewModel class")
    }
}
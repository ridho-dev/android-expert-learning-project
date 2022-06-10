package com.dededev.expertstarterproject.core.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dededev.expertstarterproject.core.data.TourismRepository
import com.dededev.expertstarterproject.core.di.Injection
import com.dededev.expertstarterproject.detail.DetailTourismViewModel
import com.dededev.expertstarterproject.favorite.FavoriteViewModel
import com.dededev.expertstarterproject.home.HomeViewModel

class ViewModelFactory private constructor(private val tourismRepository: TourismRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance
                ?: synchronized(this) {
                instance
                    ?: ViewModelFactory(
                        Injection.provideRepository(
                            context
                        )
                    )
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                HomeViewModel(tourismRepository) as T
            }
            modelClass.isAssignableFrom(FavoriteViewModel::class.java) -> {
                FavoriteViewModel(tourismRepository) as T
            }
            modelClass.isAssignableFrom(DetailTourismViewModel::class.java) -> {
                DetailTourismViewModel(tourismRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
}
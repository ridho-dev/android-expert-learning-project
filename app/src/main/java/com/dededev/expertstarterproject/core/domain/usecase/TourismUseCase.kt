package com.dededev.expertstarterproject.core.domain.usecase

import androidx.lifecycle.LiveData
import com.dededev.expertstarterproject.core.data.Resource
import com.dededev.expertstarterproject.core.domain.model.Tourism

interface TourismUseCase {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}
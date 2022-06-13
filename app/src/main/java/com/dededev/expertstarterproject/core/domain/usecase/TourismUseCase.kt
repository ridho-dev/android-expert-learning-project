package com.dededev.expertstarterproject.core.domain.usecase

import com.dededev.expertstarterproject.core.data.Resource
import com.dededev.expertstarterproject.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flow<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}
package com.dededev.expertstarterproject.core.domain.repository

import com.dededev.expertstarterproject.core.data.Resource
import com.dededev.expertstarterproject.core.domain.model.Tourism
import io.reactivex.Flowable

interface ITourismRepository {
    fun getAllTourism(): Flowable<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flowable<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}
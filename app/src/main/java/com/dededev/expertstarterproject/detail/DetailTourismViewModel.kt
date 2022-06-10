package com.dededev.expertstarterproject.detail

import androidx.lifecycle.ViewModel
import com.dededev.expertstarterproject.core.data.TourismRepository
import com.dededev.expertstarterproject.core.data.source.local.entity.TourismEntity

class DetailTourismViewModel(private val tourismRepository: TourismRepository) : ViewModel() {
    fun setFavoriteTourism(tourism: TourismEntity, newStatus:Boolean) = tourismRepository.setFavoriteTourism(tourism, newStatus)
}


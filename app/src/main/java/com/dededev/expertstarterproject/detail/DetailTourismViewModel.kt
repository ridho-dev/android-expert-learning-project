package com.dededev.expertstarterproject.detail

import androidx.lifecycle.ViewModel
import com.dededev.expertstarterproject.core.domain.model.Tourism
import com.dededev.expertstarterproject.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) = tourismUseCase.setFavoriteTourism(tourism, newStatus)
}


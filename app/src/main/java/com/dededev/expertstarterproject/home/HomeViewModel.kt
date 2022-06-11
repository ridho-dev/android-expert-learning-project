package com.dededev.expertstarterproject.home

import androidx.lifecycle.ViewModel
import com.dededev.expertstarterproject.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val tourism = tourismUseCase.getAllTourism()

}


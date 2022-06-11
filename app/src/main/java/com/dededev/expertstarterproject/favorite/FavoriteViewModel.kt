package com.dededev.expertstarterproject.favorite

import androidx.lifecycle.ViewModel
import com.dededev.expertstarterproject.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism()

}


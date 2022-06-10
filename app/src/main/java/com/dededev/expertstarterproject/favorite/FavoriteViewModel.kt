package com.dededev.expertstarterproject.favorite

import androidx.lifecycle.ViewModel
import com.dededev.expertstarterproject.core.data.TourismRepository

class FavoriteViewModel(tourismRepository: TourismRepository) : ViewModel() {

    val favoriteTourism = tourismRepository.getFavoriteTourism()

}


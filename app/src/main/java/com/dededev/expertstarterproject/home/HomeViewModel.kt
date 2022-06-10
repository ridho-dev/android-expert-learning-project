package com.dededev.expertstarterproject.home

import androidx.lifecycle.ViewModel
import com.dededev.expertstarterproject.core.data.TourismRepository

class HomeViewModel(tourismRepository: TourismRepository) : ViewModel() {

    val tourism = tourismRepository.getAllTourism()

}


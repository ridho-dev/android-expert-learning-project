package com.dededev.expertstarterproject.core.di

import android.content.Context

import com.dededev.expertstarterproject.core.data.source.local.LocalDataSource
import com.dededev.expertstarterproject.core.data.source.local.room.TourismDatabase

import com.dededev.expertstarterproject.core.data.TourismRepository
import com.dededev.expertstarterproject.core.data.source.remote.RemoteDataSource
import com.dededev.expertstarterproject.core.utils.AppExecutors
import com.dededev.expertstarterproject.core.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): TourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}

package com.devcode.tourifyapp.data.repository

import com.devcode.tourifyapp.data.remote.response.DummyData
import com.devcode.tourifyapp.data.remote.response.ReviewsResponse
import com.devcode.tourifyapp.data.remote.response.TravelDataDummyResponse

class DummyDataRepository {

    fun getAllData(): List<TravelDataDummyResponse> = DummyData.dummyDataTravel
    fun getAllDataReviews(): List<ReviewsResponse> = DummyData.dummyDataReviews

    companion object {
        @Volatile
        private var instance: DummyDataRepository? = null

        fun getInstance(): DummyDataRepository =
            instance ?: synchronized(this) {
                DummyDataRepository().apply {
                    instance = this
                }
            }
    }

}
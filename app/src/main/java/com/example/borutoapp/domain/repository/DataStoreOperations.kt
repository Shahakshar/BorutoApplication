package com.example.borutoapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreOperations {
    suspend fun savedOnBoardingState(complete: Boolean)
    fun readOnBoardingBoolean(): Flow<Boolean>
}
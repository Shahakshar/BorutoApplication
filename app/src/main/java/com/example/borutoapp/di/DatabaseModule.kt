package com.example.borutoapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.borutoapp.data.local.BorutoDataBase
import com.example.borutoapp.data.repository.LocalDataSourceImpl
import com.example.borutoapp.domain.repository.LocalDataSource
import com.example.borutoapp.utils.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): BorutoDataBase {
        return Room.databaseBuilder(
            context,
            BorutoDataBase::class.java,
            BORUTO_DATABASE
        ).build()
    }

    @Singleton
    @Provides
    fun provideLocalDataSource(database: BorutoDataBase): LocalDataSource {
        return LocalDataSourceImpl(
            borutoDataBase = database
        )
    }
}
package com.example.borutoapp.data.repository

import com.example.borutoapp.data.local.BorutoDataBase
import com.example.borutoapp.domain.model.Hero
import com.example.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(
    borutoDataBase: BorutoDataBase
): LocalDataSource {

    private val heroDao = borutoDataBase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHeroes(heroId = heroId)
    }
}
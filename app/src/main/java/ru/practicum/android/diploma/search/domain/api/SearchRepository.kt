package ru.practicum.android.diploma.search.domain.api

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.filter.domain.models.Industry
import ru.practicum.android.diploma.search.domain.models.Resource
import ru.practicum.android.diploma.search.domain.models.SearchVacancyResult
import ru.practicum.android.diploma.search.domain.models.VacancySearchParams

interface SearchRepository {

    fun searchVacancy(vacancySearchParams: VacancySearchParams): Flow<Resource<SearchVacancyResult>>

    fun getSavedIndustries(): Industry?

    fun getSalary(): String

    fun getSalaryOnly(): Boolean
}

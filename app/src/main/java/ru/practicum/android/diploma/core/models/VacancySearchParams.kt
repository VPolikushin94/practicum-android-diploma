package ru.practicum.android.diploma.core.models

data class VacancySearchParams(
    val text: String,
    val areaId: String?,
    val salary: Int?,
    val isOnlyWithSalary: Boolean?,
    val industryId: String?
) {
    companion object{
        const val AREA = "area"
        const val SALARY = "salary"
        const val IS_ONLY_WITH_SALARY = "only_with_salary"
        const val INDUSTRY = "industry"
    }
}

fun VacancySearchParams.toMap(): Map<String, String> {
    return mutableMapOf<String, String>().apply {
        this["text"] = text
        if (!areaId.isNullOrEmpty()) {
            this[VacancySearchParams.AREA] = areaId
        }
        if (salary != null) {
            this[VacancySearchParams.SALARY] = salary.toString()
        }
        if (isOnlyWithSalary != null) {
            this[VacancySearchParams.IS_ONLY_WITH_SALARY] = isOnlyWithSalary.toString()
        }
        if (industryId != null) {
            this[VacancySearchParams.INDUSTRY] = industryId
        }
    }
}

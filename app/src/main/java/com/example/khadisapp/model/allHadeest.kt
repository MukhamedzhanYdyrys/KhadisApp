package com.example.khadisapp.model.allHadeest


data class allHadeest(
    val data: List<Data>,
    val meta: Meta
) {
    fun test() {
        meta.copy(current_page = meta.current_page + 1)
    }
}
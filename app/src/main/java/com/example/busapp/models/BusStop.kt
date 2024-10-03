package com.example.busapp.models

data class BusStop (
    val id: Int,
    val name: String
): Identifiable {

    override fun getIdentifier(): Int {
        return id;
    }
}
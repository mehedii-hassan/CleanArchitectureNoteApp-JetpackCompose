package com.example.noteappdemo_jetpackcompose.feature_note.domain.utill

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}

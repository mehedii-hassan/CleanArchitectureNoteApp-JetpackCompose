package com.example.noteappdemo_jetpackcompose.feature_note.presentation.notes

import com.example.noteappdemo_jetpackcompose.feature_note.domain.model.Note
import com.example.noteappdemo_jetpackcompose.feature_note.domain.utill.NoteOrder
import com.example.noteappdemo_jetpackcompose.feature_note.domain.utill.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

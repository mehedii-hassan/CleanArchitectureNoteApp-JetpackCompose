package com.example.noteappdemo_jetpackcompose.feature_note.presentation.notes

import com.example.noteappdemo_jetpackcompose.feature_note.domain.model.Note
import com.example.noteappdemo_jetpackcompose.feature_note.domain.utill.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

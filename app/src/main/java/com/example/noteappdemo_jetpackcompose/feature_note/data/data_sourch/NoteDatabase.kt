package com.example.noteappdemo_jetpackcompose.feature_note.data.data_sourch

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteappdemo_jetpackcompose.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}
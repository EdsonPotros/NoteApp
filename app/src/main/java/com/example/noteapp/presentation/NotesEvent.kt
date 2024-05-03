package com.example.noteapp.presentation;

import com.example.noteapp.data.Note



sealed interface NotesEvent {
    object SortNotes: NotesEvent
    data class DeleteNote(val note: Note): NotesEvent
    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent

}
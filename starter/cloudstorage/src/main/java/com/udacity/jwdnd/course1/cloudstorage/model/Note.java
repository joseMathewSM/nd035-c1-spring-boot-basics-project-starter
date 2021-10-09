package com.udacity.jwdnd.course1.cloudstorage.model;

public class Note {

    private Integer noteId, userId;
    private String noteHead, noteDescription;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNoteHead() {
        return noteHead;
    }

    public void setNoteHead(String noteHead) {
        this.noteHead = noteHead;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }
}

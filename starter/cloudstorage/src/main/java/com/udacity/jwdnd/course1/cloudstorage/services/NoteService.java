package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.mapper.NoteMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.Note;
import com.udacity.jwdnd.course1.cloudstorage.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private NoteMapper noteMapper;
    private UserService userService;
    private AuthenticationService authenticationService;

    public NoteService(NoteMapper noteMapper, UserService userService, AuthenticationService authenticationService) {
        this.noteMapper = noteMapper;
        this.userService = userService;
        this.authenticationService = authenticationService;
    }

    public void createNote(Note note){
        User user = userService.getUserByUserName(authenticationService.getLoggegInUserName());
        note.setUserId(user.getUserId());
        System.out.println(note.getUserId());
        System.out.println(note.getNoteHead());
        System.out.println(note.getNoteDescription());
        int rows = noteMapper.insert(note);
    }

    public List<Note> getNotes() {
        User user = userService.getUserByUserName(authenticationService.getLoggegInUserName());
        List<Note> tempNote = noteMapper.getNotes(user.getUserId());
        if(!tempNote.isEmpty()){
            System.out.println(tempNote.get(0).getNoteDescription());
        }
        return noteMapper.getNotes(user.getUserId());
    }
}

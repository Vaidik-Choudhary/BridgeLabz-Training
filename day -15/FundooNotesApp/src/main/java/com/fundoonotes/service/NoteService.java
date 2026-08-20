package com.fundoonotes.service;

import java.util.List;

import com.fundoonotes.dto.response.*;

public interface NoteService {

    NoteResponseDTO createNote(int userId, String title, String content);

    List<NoteResponseDTO> findByOwner(int userId);

    boolean deleteNote(int noteId,int requestingUserId);
    
    NoteResponseDTO archiveNote(int noteId, int userId);

    NoteResponseDTO trashNote(int noteId, int userId);

    NoteResponseDTO restoreNote(int noteId, int userId);

    NoteResponseDTO pinNote(int noteId, int userId);
}
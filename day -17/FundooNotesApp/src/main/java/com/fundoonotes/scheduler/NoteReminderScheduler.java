package com.fundoonotes.scheduler;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fundoonotes.entity.Note;
import com.fundoonotes.messaging.NoteReminderProducer;
import com.fundoonotes.repository.NoteRepository;

@Component
public class NoteReminderScheduler {

	private final NoteRepository noteRepository;
	private final NoteReminderProducer noteReminderProducer;

	public NoteReminderScheduler(NoteRepository noteRepository, NoteReminderProducer noteReminderProducer) {

		this.noteRepository = noteRepository;
		this.noteReminderProducer = noteReminderProducer;
	}

	
	
	
	@Scheduled(fixedRate = 60000)
	public void processDueReminders() {

		List<Note> dueNotes = noteRepository.findByReminderAtIsNotNullAndReminderAtLessThanEqualAndReminderSentFalse(LocalDateTime.now());

		for (Note note : dueNotes) {

			noteReminderProducer.sendReminder(note.getTitle(), note.getOwner().getUserId());

			note.setReminderSent(true);
			noteRepository.save(note);
		}
	}
}
package com.greatlearning.P2_denomination_service;

public class NotesCount {
	
	public void notesCountImplementation(int notes[],int amount) {
		
		int[] noteCounter = new int[notes.length];
		try {
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i]) {
					noteCounter[i]=amount/notes[i];
					amount = amount - noteCounter[i]*notes[i];
				}
				
			}
			if (amount>0) {
				System.out.println("\n\nExact amount cannot be given with highest denomination");
			}
			else {
				System.out.println("\n\nYour payment approach in order to give minimum number of notes is");
				for(int i=0;i<notes.length;i++) {
					if(noteCounter[i]!=0) {
						System.out.println(notes[i] + " : " + noteCounter[i]);
						
					}
				}
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	

	}
}

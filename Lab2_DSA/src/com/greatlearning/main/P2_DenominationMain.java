package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.P2_denomination_service.MergeSortImplementation;
import com.greatlearning.P2_denomination_service.NotesCount;

public class P2_DenominationMain {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		MergeSortImplementation msi = new MergeSortImplementation();
		NotesCount nc = new NotesCount();
		
		System.out.println("Enter size of currency denomination");
		int size = sc.nextInt();
		
		System.out.println("Enter currency denominations value");
		int[] notes = new int[size];
		for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
	
		System.out.println("Enter amount you want to pay");
		int amount = sc.nextInt();
		
		msi.sort(notes,0,notes.length-1);
		System.out.println("\nSorted denominations\n");
		for(int i=0;i<size;i++) {
			System.out.print(notes[i]+ "  ");
		}
		nc.notesCountImplementation(notes, amount);	
	}

}

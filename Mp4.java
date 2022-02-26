package com.example.sorting;

import java.util.ArrayList;
import java.util.Collections;

import com.song.api.Song;

import mutilitypackage.com.MyUtlil;

public class Mp4 {

	public Mp4() {
	}

	public static void main(String[] args) {

		//Song s0 = new Song("take me", " araj", 2006);
	//	Song s1 = new Song("raja  me", "jfhfraj", 206);
		Song s2 = new Song("i love  me", "rututgaj", 806);
		Song s3 = new Song("ye sang hai", "maaaaaaj", 20606);
		ArrayList<Song> musicList = new ArrayList<>();

	//	musicList.add(s0);
	//	musicList.add(s1);
		musicList.add(s2);
		musicList.add(s3);
		MyUtlil.iteratelist(musicList);
        System.out.println("without short list ");
		Collections.sort(musicList);
		
		System.out.println("after sorting base o year");
		
		MyUtlil.iteratelist(musicList);
		// IT GIVE ERRORS
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Song>)
//due to implement comparable interfave error go
	}
}

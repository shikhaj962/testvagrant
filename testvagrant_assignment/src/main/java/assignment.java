package main.java;

import java.util.List;

public class assignment {
	/*
	 * Problem Statement:
	Create an in-memory store for recently played songs that can accommodate N songs per
	user, with a fixed initial capacity. This store must have the capability to store a list of
	song-user pairs, with each song linked to a user. It should also be able to fetch recently
	played songs based on the user and eliminate the least recently played songs when the
	store becomes full.
	EXAMPLE
	Illustration, when 4 different songs were played by a user & Initial capacity is 3:
	Let's assume that the user has played 3 songs - S1, S2 and S3.
	● The playlist would look like -> S1,S2,S3
	● When S4 song is played -> S2,S3,S4
	● When S2 song is played -> S3,S4,S2
	● When S1 song is played -> S4,S2,S1
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        songPlaylist store = new songPlaylist(3);
	        store.addSong("user1", "S1");
	        store.addSong("user1", "S2");
	        store.addSong("user1", "S3");
	        store.addSong("user1", "S4");
	        store.addSong("user1", "S2");
	        store.addSong("user1", "S1");

	        List<String> recentlyPlayedSongs = store.getRecentlyPlayedSongs("user1");
	        System.out.println("Recently Played Songs: " + recentlyPlayedSongs);
	    }


}

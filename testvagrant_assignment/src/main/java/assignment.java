package main.java;

import java.util.List;

public class assignment {

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

package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class songPlaylist {
	private int capacity;
    private Map<String, List<String>> store =new HashMap<>();

    public songPlaylist(int initialCapacity) {
        this.capacity = initialCapacity;
    }

    public void addSong(String user, String song) {
        if (store.containsKey(user)) {
            List<String> songs = store.get(user);
            songs.add(song);
            if (songs.size() > capacity) {
                songs.remove(0);
            }
        } else {
            List<String> songs = new ArrayList<>();
            songs.add(song);
            store.put(user, songs);
        }
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        return store.get(user);
    }


}

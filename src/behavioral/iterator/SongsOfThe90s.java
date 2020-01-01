package behavioral.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();

    public SongsOfThe90s() {
        bestSongs.put(0,new SongInfo("Losing my Religion", "REM", 1991));
        bestSongs.put(1,new SongInfo("Creep", "Radiohead", 1993));
        bestSongs.put(2,new SongInfo("Walk on the Ocean", "Toad the Wet Sprocket", 1991));
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}


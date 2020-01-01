package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator{
    List<SongInfo> bestSongs = new ArrayList<>();

    public SongsOfThe70s() {
        bestSongs.add(new SongInfo("Imagine", "John Lennon", 1971));
        bestSongs.add(new SongInfo("Americna Pie", "Don McLean", 1971));
        bestSongs.add(new SongInfo("I will survive", "Gloria Gaynor", 1979));
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}


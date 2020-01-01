package behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    SongInfo[] bestSongs;

    public SongsOfThe80s() {
        bestSongs = new SongInfo[3];
        bestSongs[0] = new SongInfo("Roam", "B52s", 1989);
        bestSongs[1] = new SongInfo("Cruel Summer", "Bananarama", 1984);
        bestSongs[2] = new SongInfo("Head over Heels", "Tears for Fears", 1985);
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}

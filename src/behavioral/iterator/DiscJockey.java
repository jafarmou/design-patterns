package behavioral.iterator;

import java.util.Iterator;

public class DiscJockey {
    SongIterator iter70s;
    SongIterator iter80s;
    SongIterator iter90s;

    public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
        iter70s = newSongs70s;
        iter80s = newSongs80s;
        iter90s = newSongs90s;
    }

    public void showTheSongs2() {
        Iterator songs70s = iter70s.createIterator();
        Iterator songs80s = iter80s.createIterator();
        Iterator songs90s = iter90s.createIterator();

        System.out.println("\n---Songs of 70s: (Iterator)---");
        printTheSongs(songs70s);
        System.out.println("\n---Songs of 80s: (Iterator)----");
        printTheSongs(songs80s);
        System.out.println("\n---Songs of 90s: (Iterator)----");
        printTheSongs(songs90s);
    }

    public void printTheSongs(Iterator iterator) {
        while(iterator.hasNext()) {
            SongInfo song = (SongInfo) iterator.next();
            System.out.println("\nName: " + song.getSongName() +
                    "\nBand: " + song.getBandName() +
                    "\nRelease Date: " + song.getYearReleased());
        }
    }
}

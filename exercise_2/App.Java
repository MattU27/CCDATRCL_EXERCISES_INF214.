import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // 1. Create your own music playlist by creating a LinkedList object
        LinkedList<String> Playlist = new LinkedList<>();

        // 2. Add new songs to your playlist using the add() method
        Playlist.add("Asan Kana Ba?");
        Playlist.add("Diwata");
        Playlist.add("Binhi");
        Playlist.add("Di Na Muli");
        Playlist.add("Magkasuyo Buong Gabi");
        Playlist.add("I Need You More Today");
        Playlist.add("Sila");
        Playlist.add("Yakap");
        Playlist.add("Pano");
        Playlist.add("Hatid");

        // 3. Add a new song at the front of the playlist using the addFirst() method
        Playlist.addFirst("Kung Di Na Ako");

        // 4. Add a new song at the end of the playlist using the addLast() method
        Playlist.addLast("Maybe The Night");

        // 5. Display the song at the front of the playlist using the combination of
        // get() method and the println() method
        System.out.println(Playlist.get(0));
        

        // 6. Replace the last song using the set() method
        Playlist.set(11, "Pursue");

        // 7. Remove the first song using the remove() method
        Playlist.remove(0);

        // 8. Display all songs in your playlist using the println method
        System.out.println("My R&B/Pop Playlist: " + Playlist);
    }
}

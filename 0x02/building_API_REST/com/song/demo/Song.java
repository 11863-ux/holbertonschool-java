import java.util.Objects;

public class Song {
    Integer id;
    String name;
    String artist;
    String album;

    public Song(Integer id, String name, String artist, String album, String releaseYear) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.releaseYear = releaseYear;
    }

    public Song() {}

    String releaseYear;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) && Objects.equals(name, song.name) && Objects.equals(artist, song.artist) && Objects.equals(album, song.album) && Objects.equals(releaseYear, song.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, artist, album, releaseYear);
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                '}';
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

}

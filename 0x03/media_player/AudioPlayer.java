package media_player;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(MediaType mediaType,String fileName) {
        if (mediaType==MediaType.MP3){
            System.out.print("Playing MP3: "+fileName);
        }
        else {
            MediaPlayerAdapter mediaPlayerAdapter=new MediaPlayerAdapter(mediaType);
            mediaPlayerAdapter.play(mediaType,fileName);
        }
    }
}

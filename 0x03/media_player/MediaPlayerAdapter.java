public class MediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer  mediaPlayer;
    @Override
    public void play(MediaType mediaType,String fileName) {
        if (mediaType==MediaType.VLC){
            mediaPlayer.playVLC(fileName);
        }
        else if (mediaType==MediaType.MP4){
            mediaPlayer.playMP4(fileName);
        }
    }

    public MediaPlayerAdapter(MediaType mediaType) {
        if(mediaType != MediaType.MP3){
            mediaPlayer = new VideoMediaPlayer();
        }
    }
}

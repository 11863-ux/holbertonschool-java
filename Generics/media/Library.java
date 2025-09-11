package media;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {

    List<T> medias=new ArrayList<T>();

    public void addMedia(T media){
        medias.add(media);
    }

    public List<T> getMediaList(){
        return medias;
    }
}

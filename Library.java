import java.util.ArrayList;
import java.util.Date;
public  class Library <T extends Media>   {
    ArrayList<T> medias = new ArrayList<>();


    public void add(T media) {
     medias.add(media);

    }


    public void add(int index,T media) {
        medias.add(index,media);


    }

    public int size() {
        return medias.size();
    }


    public T get(int index) {
        return medias.get(index);
    }

    public void delete() {
        medias.remove(medias.size()-1);


    }

    public void delete(int index) {
        if (index > medias.size())
            return;

        medias.remove(index);

    }
}

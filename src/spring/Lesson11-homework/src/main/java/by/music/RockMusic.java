package by.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RockMusic implements Music {
    private List<String> songs=new ArrayList<String>();

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    public List<String> getSongs() {
        return  songs;
    }
}

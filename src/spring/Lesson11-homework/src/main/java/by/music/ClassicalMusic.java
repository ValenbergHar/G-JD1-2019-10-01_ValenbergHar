package by.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ClassicalMusic implements Music{
    private List<String> songs=new ArrayList<String>();
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }
    public List<String> getSongs() {
        return  songs;
    }
}

package ar.edu.unpaz.maxicorrea.tp0;

import java.io.IOException;
import org.junit.Test;


public class MainTest {

    @Test
    public void shouldCreateMainObject() throws IOException{
        Main.main(new String[]{"/home/max/Documents/example.txt"});
    }
}



import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;


public class PosterTest {

    @Test
    public void shouldAddFilm() {
        Poster manager = new Poster();
        manager.add("Matrix1");
        manager.add("Matrix2");
        manager.add("Matrix3");

        String[] expected = {"Matrix1", "Matrix2", "Matrix3"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddFilmm() {
        Poster manager = new Poster();
        manager.add("Matrix1");
        manager.add("Matrix2");
        manager.add("Matrix3");
        manager.add("Matrix4");
        manager.add("Matrix5");
        manager.add("Matrix6");

        String[] expected = {"Matrix1", "Matrix2", "Matrix3", "Matrix4", "Matrix5", "Matrix6"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast() {
        Poster manager = new Poster();
        manager.add("Matrix3");

        String[] expected = {"Matrix3"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindLastt() {
        Poster manager = new Poster(6);
        manager.add("Matrix6");

        String[] expected = {"Matrix6"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindLasttt() {
        Poster manager = new Poster();
        manager.add("Matrix4");

        String[] expected = {"Matrix4"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);


    }
}

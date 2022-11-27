package ru.netology.javaqa.postermanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void giveAllPostersTest() {
        PosterManager movies = new PosterManager();
        movies.addPoster("Movie 1");
        movies.addPoster("Movie 2");
        movies.addPoster("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = movies.giveAllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void giveLast6PostersTest() {
        PosterManager movies = new PosterManager(6);
        movies.addPoster("Hero 1");
        movies.addPoster("Hero 2");
        movies.addPoster("Hero 3");
        movies.addPoster("Hero 4");
        movies.addPoster("Hero 5");
        movies.addPoster("Hero 6");
        movies.addPoster("Hero 7");
        movies.addPoster("Hero 8");
        movies.addPoster("Hero 9");
        movies.addPoster("Hero 10");
        movies.addPoster("Hero 11");
        movies.addPoster("Hero 12");

        String[] expected = {"Hero 12", "Hero 11","Hero 10","Hero 9","Hero 8","Hero 7" };
        String[] actual = movies.giveLastPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void giveLast10PostersDefaultTest() {
        PosterManager movies = new PosterManager();
        movies.addPoster("Hero 1");
        movies.addPoster("Hero 2");
        movies.addPoster("Hero 3");
        movies.addPoster("Hero 4");
        movies.addPoster("Hero 5");
        movies.addPoster("Hero 6");
        movies.addPoster("Hero 7");
        movies.addPoster("Hero 8");
        movies.addPoster("Hero 9");
        movies.addPoster("Hero 10");
        movies.addPoster("Hero 11");


        String[] expected = {"Hero 11", "Hero 10","Hero 9", "Hero 8","Hero 7", "Hero 6", "Hero 5", "Hero 4", "Hero 3", "Hero 2" };
        String[] actual = movies.giveLastPosters();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void giveLast8PostersDefaultTest() {
        PosterManager movies = new PosterManager(11);
        movies.addPoster("Hero 1");
        movies.addPoster("Hero 2");
        movies.addPoster("Hero 3");
        movies.addPoster("Hero 4");
        movies.addPoster("Hero 5");
        movies.addPoster("Hero 6");
        movies.addPoster("Hero 7");
        movies.addPoster("Hero 8");

        String[] expected = {"Hero 8","Hero 7", "Hero 6", "Hero 5", "Hero 4", "Hero 3", "Hero 2", "Hero 1" };
        String[] actual = movies.giveLastPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

}

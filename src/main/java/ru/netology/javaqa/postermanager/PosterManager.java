package ru.netology.javaqa.postermanager;

public class PosterManager {

    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addPoster(String newPoster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newPoster;
        posters = tmp;
    }


    //  Далее эквивалент findAll
    public String[] giveAllPosters() {
        return posters;
    }


    // Далее эквивалент findLast с другим названием
    public String[] giveLastPosters() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}

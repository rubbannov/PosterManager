package ru.netology.poster.manager;

public class PosterManager {

    private int limit;

    public PosterManager() {
        this.limit = 10;
    }
    public PosterManager(int amountItems) {
        this.limit = amountItems;
    }
    private PosterItem[] posters = new PosterItem[0];

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = item;
        posters = tmp;
    }

    public PosterItem[] findAll() {
        return posters;
    }

    public PosterItem[] findLast() {
        int tmpLength;
        if (posters.length < limit) {
            tmpLength = posters.length;
        } else {
            tmpLength = limit;
        }
        PosterItem[] reversed = new PosterItem[tmpLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }


}

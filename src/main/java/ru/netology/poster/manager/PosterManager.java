package ru.netology.poster.manager;

public class PosterManager { //Я УЖЕ НЕ ЗНАЮ ЧТО ТУТ ЕЩЕ ИСПРАВЛЯТЬ
    private PosterItem[] posters = new PosterItem[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }
    public PosterManager(int amountItems) {
        this.limit = amountItems;
    }


    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = item;
        posters = tmp;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
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

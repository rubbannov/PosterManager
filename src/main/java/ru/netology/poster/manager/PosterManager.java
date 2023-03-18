package ru.netology.poster.manager;

public class PosterManager {
    PosterItem[] posters = new PosterItem[0];

    //Сохранение фильма
    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = item;
        posters = tmp;
    }

/*
    public PosterItem[] getPosters() {
        return posters;
    }
*/
    //Вызов списка фильмов в порядке добавления(чем get не угодил?)
    public PosterItem[] findAll() {
        return posters;
    }
    //Реализация лимита запроса на показ списка фильмов
    public int kolumn;

    public PosterManager() {
        kolumn = 10;
    }
    public PosterManager(int amountItems) {
        kolumn = amountItems;
    }
    public PosterItem[] findLast() {
        PosterItem[] reversed = new PosterItem[kolumn];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[kolumn - 1 - i];
        }
        return reversed;
    }


}

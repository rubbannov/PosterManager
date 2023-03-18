package ru.netology.poster.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manage = new PosterManager();
    PosterItem item1 = new PosterItem(1,"Джентельмены Удачи", "Комедия", 1971);
    PosterItem item2 = new PosterItem(2,"Аватар", "Научная фантастика/Боевик", 2009);
    PosterItem item3 = new PosterItem(3,"Мстители. Эра Альтрона", "Боевик/Приключения", 2015);
    PosterItem item4 = new PosterItem(4,"Нимфоманка: Часть 1", "Драма", 2013);
    PosterItem item5 = new PosterItem(5,"Вторая жизнь Уве", "Драма/Романтика", 2015);
    PosterItem item6 = new PosterItem(6,"Злеленая миля", "Драма", 1999);
    PosterItem item7 = new PosterItem(7,"Список Шиндлера", "Драма", 1993);
    PosterItem item8 = new PosterItem(8,"Побег из Шоушенка", "Драма", 1994);
    PosterItem item9 = new PosterItem(9,"Форест Гамп", "Драма", 1994);
    PosterItem item10 = new PosterItem(10,"Тайна Коко", "Мультфильм", 2017);
    PosterItem item11 = new PosterItem(11,"Властелин колец: Возвращение короля", "Фэнтези", 2003);
    PosterItem item12 = new PosterItem(12,"Интерстеллар", "Фантастика", 2014);
    @Test
    public void testAdding() {
        manage.save(item1);
        manage.save(item2);
        manage.save(item3);

        PosterItem[] expected = {item1, item2, item3};
        PosterItem[] actual = manage.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastFiveItems() {
        PosterManager manage = new PosterManager(5);
        manage.save(item1);
        manage.save(item2);
        manage.save(item3);
        manage.save(item4);
        manage.save(item5);

        PosterItem[] expected = {item5, item4, item3, item2, item1};
        PosterItem[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindLastDefaultItems() {
        manage.save(item1);
        manage.save(item2);
        manage.save(item3);
        manage.save(item4);
        manage.save(item5);
        manage.save(item6);
        manage.save(item7);
        manage.save(item8);
        manage.save(item9);
        manage.save(item10);

        PosterItem[] expected = {item10, item9, item8, item7, item6,item5, item4, item3, item2, item1};
        PosterItem[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindAllItems() {
        manage.save(item1);
        manage.save(item2);
        manage.save(item3);
        manage.save(item4);
        manage.save(item5);
        manage.save(item6);
        manage.save(item7);
        manage.save(item8);
        manage.save(item9);
        manage.save(item10);
        manage.save(item11);
        manage.save(item12);

        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12};
        PosterItem[] actual = manage.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

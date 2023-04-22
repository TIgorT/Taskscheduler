package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void usingTheMethodMatchesTestFirst() {
        SimpleTask simpleTask = new SimpleTask(4, "Новое хобби");
        boolean expected = true;
        boolean actual = simpleTask.matches("Новое");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void usingTheMethodMatchesTestSecond() {
        SimpleTask simpleTask = new SimpleTask(35, "Чтение книги");
        boolean expected = false;
        boolean actual = simpleTask.matches("Прогулка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void usingTheMethodMatchesTestThird() {
        String[] subtasks = {"Фильмы", "Бассейн", "Поездка", "Спорт"};
        Epic epic = new Epic(64, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Спорт");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void usingTheMethodMatchesTestFourth() {
        String[] subtasks = {"Фильмы", "Бассейн", "Поездка", "Спорт"};
        Epic epic = new Epic(64, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Бейсбол");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void usingTheMethodMatchesTestFifth() {
        Meeting meeting = new Meeting(
                75,
                "Бейсбол",
                "Сезонная игра",
                "Завтра в пол третьего дня");
        boolean expected = true;
        boolean actual = meeting.matches("Сезонная игра");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void usingTheMethodMatchesTestSixth() {
        Meeting meeting = new Meeting(
                75,
                "Бейсбол",
                "Сезонная игра",
                "Завтра в пол третьего дня");
        boolean expected = true;
        boolean actual = meeting.matches("Бейсбол");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void usingTheMethodMatchesTestSeventh() {
        Meeting meeting = new Meeting(
                75,
                "Бейсбол",
                "Сезонная игра",
                "Завтра в пол третьего дня");
        boolean expected = false;
        boolean actual = meeting.matches("Зеркало");
        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {

    // Доработка "Новые версии рецепта"

    @Test
    public void testingTheSearchRevisionTestFirst() {
        SimpleTask simpleTask = new SimpleTask(5, "Бородинский хлеб");

        String[] subtasks = {"молоко", "яйца", "хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "хлеб для уток",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.search("хлеб");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testingTheSearchRevisionTestSecond() {
        SimpleTask simpleTask = new SimpleTask(5, "Бородинский хлеб");

        String[] subtasks = {"молоко", "яйца", "мясо"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "хлеб для уток",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, meeting};
        Task[] actual = todos.search("хлеб");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testingTheSearchRevisionTestThird() {
        SimpleTask simpleTask = new SimpleTask(5, "Бородинский хлеб");

        String[] subtasks = {"молоко", "яйца", "мясо"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "хлеб для уток",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {epic};
        Task[] actual = todos.search("молоко");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testingTheSearchRevisionTestFourth() {
        SimpleTask simpleTask = new SimpleTask(5, "Бородинский хлеб");

        String[] subtasks = {"молоко", "яйца", "мясо"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "хлеб для уток",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {};
        Task[] actual = todos.search("майские праздники");
        Assertions.assertArrayEquals(expected, actual);
    }

    //////////////////////////////////////////////////////////////////////////
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testingTheSearchTestFirst() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {meeting};
        Task[] actual = todos.search("Приложение НетоБанка");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testingTheSearchTestSecond() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {epic};
        Task[] actual = todos.search("Яйца");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testingTheSearchTestThird() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask};
        Task[] actual = todos.search("Позвонить родителям");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testingTheSearchTestFourth() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Todos todos = new Todos();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {};
        Task[] actual = todos.search("Посмотреть фильм");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testingTheSearchTestFifth() {
        Todos todos = new Todos();
        Task[] expected = {};
        Task[] actual = todos.search("");
        Assertions.assertArrayEquals(expected, actual);
    }
}

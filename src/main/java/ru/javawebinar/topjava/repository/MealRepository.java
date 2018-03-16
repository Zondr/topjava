package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public interface MealRepository {//интерфейс чтения, добавления, удаления, обновления

    Meal save(Meal meal);

    // null, если обновленное питание не принадлежит userId
    Meal save(Meal meal, int userId);

    // ложь, если еда не принадлежит userId
    boolean delete(int id, int userId);

    // null, если еда не принадлежит userId
    Meal get(int id, int userId);

    // Упорядоченный desc даты и времени
    List<Meal> getAll(int userId);

    // Упорядоченный desc даты и времени
    List<Meal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);

    //void save(Meal meal);

    /*Meal save(Meal meal);

    void delete(int id);

    Meal get(int id);

    Collection<Meal> getAll();*/
}

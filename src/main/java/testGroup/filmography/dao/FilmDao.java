package testGroup.filmography.dao;

import testGroup.filmography.model.Film;

import java.util.List;

public interface FilmDao {
    List<Film> allFilms(int page);
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);

    int filmsCount();

    boolean checkTitle(String title);
}

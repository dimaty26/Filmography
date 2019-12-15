package testGroup.filmography.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testGroup.filmography.dao.FilmDao;
import testGroup.filmography.model.Film;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private FilmDao filmDao;

    @Autowired
    public void setFilmDao(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    @Transactional
    public List<Film> allFilms(int page) {
        return filmDao.allFilms(page);
    }

    @Override
    @Transactional
    public void add(Film film) {
        filmDao.add(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        filmDao.delete(film);
    }

    @Override
    @Transactional
    public void edit(Film film) {
        filmDao.edit(film);
    }

    @Override
    @Transactional
    public Film getById(int id) {
        return filmDao.getById(id);
    }

    @Override
    public int filmsCount() {
        return filmDao.filmsCount();
    }

    @Override
    public boolean checkTitle(String title) {
        return filmDao.checkTitle(title);
    }
}

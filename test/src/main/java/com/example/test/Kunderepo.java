package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class Kunderepo {

    @Autowired
    private JdbcTemplate db;

    public void lagreKunde(KundeFilm innFilm) {
        String sql = "INSERT INTO KundeFilm (filmValg, antall, fornavn, etternavn, telefonnr, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, innFilm.getFilmValg(), innFilm.getAntall(), innFilm.getFornavn(),
                innFilm.getEtternavn(), innFilm.getTelefonnr(), innFilm.getEpost());
    }

    public List<KundeFilm> hentAlleKunder() {

        String sql = "SELECT * FROM KundeFilm";
        List<KundeFilm> alleKunder = db.query(sql, new BeanPropertyRowMapper(KundeFilm.class));
        Collections.sort(alleKunder, (o1, o2) -> o1.getEtternavn().compareTo(o2.getEtternavn()));

        return alleKunder;
    }
    public void slettAlleKunder(){
        String sql = "DELETE FROM KundeFilm";
        db.update(sql);
    }

    public List<Film> hentAlleFilmer(){
        String sql = "SELECT * FROM Film";
        return db.query(sql, new BeanPropertyRowMapper(Film.class));
    }

}
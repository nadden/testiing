package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class FilmController {

    @Autowired
    private Kunderepo rep;


    @GetMapping("/hentFilmer")
    public List<Film> hentFilmer(){

        return rep.hentAlleFilmer();
    }

    @PostMapping("/lagre")
    public void lagreFilm(KundeFilm filmene){

        rep.lagreKunde(filmene);
    }

    @GetMapping("/hentAlle")
    public List<KundeFilm> hentAlle(){

        return rep.hentAlleKunder();
    }

    @GetMapping("/slettData")
    public void slettData(){

        rep.slettAlleKunder();
    }


}
package com.example.recyclephotos.service;

import com.example.recyclephotos.beans.Star;
import com.example.recyclephotos.dao.dao;

import java.util.ArrayList;
import java.util.List;

public class StarService implements dao<Star> {
    private List<Star> stars;
    private static StarService instance;

    private StarService() {
        this.stars = new ArrayList<>();
    }
    public static StarService getInstance() {
        if(instance == null)
            instance = new StarService();
        return instance;
    }
    @Override
    public boolean create(Star o) {
        return stars.add(o);
    }
    @Override
    public boolean update(Star o) {
        for(Star s : stars){
            if(s.getStar() == o.getId()){
                s.setImage(o.getImage());
                s.setNom(o.getNom());
                s.setStar(o.getStar());
            }
        }
        return true;
    }
    @Override
    public boolean delete(Star o) {
        return stars.remove(o);
    }
    @Override
    public Star findById(int id) {
        for(Star s : stars){
            if(s.getId() == id)
                return s;
        }
        return null;
    }
    @Override
    public List<Star> findAll() {
        return stars;
    }
}

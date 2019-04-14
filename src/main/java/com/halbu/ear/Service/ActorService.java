package com.halbu.ear.Service;


import com.halbu.ear.Model.Actor;
import com.halbu.ear.Repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActor() {
        List<Actor> actors = new ArrayList<>();
        actorRepository.findAll().forEach(actors::add);
        return actors;
    }

    public void addActor(Actor actor) {
        actorRepository.save(actor);
    }

    public Actor getActor(String id) {
        return actorRepository.findById(id).orElse(null);
    }

    public void updateActor(String id, String name) {
        actorRepository.setActorUpdate(id, name);

    }

    public void deleteActor(String id) {
        actorRepository.deleteById(id);
    }
}

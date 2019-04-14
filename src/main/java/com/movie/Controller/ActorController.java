package com.movie.Controller;


import com.movie.Model.Actor;
import com.movie.Service.ActorService;
import com.movie.helper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorController {

    private final ActorService actorService;
    @Autowired
    public ActorController(ActorService actorService){this.actorService = actorService;}

    @RequestMapping("/actor")
    public List<Actor> getAllActor() {
        return actorService.getAllActor();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/actor")
    public Actor addActor(@RequestBody Actor actor) {
        actorService.addActor(actor);
        return actor;
    }

    @DeleteMapping("/actor/{id}")
    public Response deleteActor(@PathVariable String id) {
        actorService.deleteActor(id);
        return new Response("200", "", "");
    }

    @GetMapping("/actor/{id}")
    public Actor getActor(@PathVariable String id){
        return actorService.getActor(id);
    }

    @PutMapping("/actor/{id}")
    public void updateActor(@PathVariable String id, @RequestBody Actor actor) {
        actorService.updateActor(id,actor.getFirstname());
    }

}

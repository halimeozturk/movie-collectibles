package com.movie.Repository;

import com.movie.Model.Movie;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MovieRepository extends CrudRepository<Movie,String> {


    @Modifying
    @Transactional
    @Query("UPDATE Movie c SET c.name = :name WHERE c.id = :id")
    void setMovieUpdate(String id, String name);

}

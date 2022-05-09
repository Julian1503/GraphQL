package com.graphql.platform.repositories;

import com.graphql.platform.entities.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {

}

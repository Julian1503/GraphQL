package com.graphql.platform.repositories;

import com.graphql.platform.entities.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {

}

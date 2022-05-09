package com.graphql.platform.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.platform.entities.Artist;
import com.graphql.platform.services.ArtifactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
  @Autowired
  private ArtifactoryService artistRepository;

  public Iterable<Artist> findAllArtists() {
    return artistRepository.findAllArtists();
  }

  public long countArtists() {
    return 1L;
  }
}
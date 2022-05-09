package com.graphql.platform.services;

import com.graphql.platform.entities.Artist;
import com.graphql.platform.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtifactoryService {
  private ArtistRepository artistRepository;

  public ArtifactoryService( ArtistRepository artistRepository) {
    this.artistRepository = artistRepository;
  }

  public Iterable<Artist> findAllArtists() {
    var artists = artistRepository.findAll();
    System.out.println("Artists: " + artists);
    return artists;
  }

  public long countArtists() {
    return artistRepository.count();
  }
}

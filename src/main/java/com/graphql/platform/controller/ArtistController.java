package com.graphql.platform.controller;

import com.graphql.platform.entities.Artist;
import com.graphql.platform.services.ArtifactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ArtistController {

  @Autowired
  private ArtifactoryService artistService;
  
  @QueryMapping
  public Iterable<Artist> finAllArtists() {
    return artistService.findAllArtists();
  }
}

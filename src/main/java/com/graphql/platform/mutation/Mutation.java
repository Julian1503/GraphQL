package com.graphql.platform.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.platform.entities.Artist;
import com.graphql.platform.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
  @Autowired
  private ArtistRepository artistRepository;

  public Artist newArtist(String name, String genre, String nickName, String lastName) {
    Artist artist = new Artist(0L, name, genre, nickName,lastName);
    return artistRepository.save(artist);
  }

  public boolean deleteArtist(Long id) {
    artistRepository.deleteById(id);
    return true;
  }

  public Artist updateArtist(Long id, String name, String genre, String nickName, String lastName) {
    Artist artist = artistRepository.findById(id).get();
    artist.setName(name);
    artist.setGenre(genre);
    artist.setNickName(nickName);
    artist.setLastName(lastName);
    return artistRepository.save(artist);
  }
}

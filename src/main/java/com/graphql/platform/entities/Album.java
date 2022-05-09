package com.graphql.platform.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name = "albums")
@Table(name = "albums")
@RequiredArgsConstructor
public class Album extends BaseEntity {

  @Column(name = "title")
  private String title;
  @Column(name = "discNumber")
  private String discNumber;
  @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Song> songs;
  @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Artist> artists;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDiscNumber() {
    return discNumber;
  }

  public void setDiscNumber(String discNumber) {
    this.discNumber = discNumber;
  }

//  public List<Song> getSongs() {
//    return songs;
//  }
//
//  public void setSongs(List<Song> songs) {
//    this.songs = songs;
//  }

  public List<Artist> getArtists() {
    return artists;
  }

  public void setArtists(List<Artist> artists) {
    this.artists = artists;
  }
}

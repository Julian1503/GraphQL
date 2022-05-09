package com.graphql.platform.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity(name = "artists")
@Table(name="artists")
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Artist extends BaseEntity {
  @Column(name = "name")
  private String name;
  @Column(name = "genre")
  private String genre;
  @Column(name = "nickName")
  private String nickName;
  @Column(name = "lastName")
  private String lastName;
  @ManyToOne(cascade = CascadeType.ALL)
  private Album album;

  public Artist(Long id, String name, String genre, String nickName, String lastName) {
    super();
    setId(id);
    this.name = name;
    this.genre = genre;
    this.nickName = nickName;
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }
}

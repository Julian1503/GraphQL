package com.graphql.platform.entities;

import java.sql.Time;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity(name = "songs")
@Table(name = "songs")
@RequiredArgsConstructor
public class Song extends BaseEntity {

  @Column(name = "title")
  private String title;
  @Column(name = "data")
  private Byte[] data;
  @Column(name = "duration")
  private Time duration;

  @ManyToOne(cascade = CascadeType.ALL)
  private Album album;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Time getDuration() {
    return duration;
  }

  public void setDuration(Time duration) {
    this.duration = duration;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }
}

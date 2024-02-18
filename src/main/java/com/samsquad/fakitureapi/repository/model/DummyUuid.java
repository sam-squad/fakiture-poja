package com.samsquad.fakitureapi.repository.model;

import com.samsquad.fakitureapi.PojaGenerated;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@PojaGenerated
@Entity
@Getter
@Setter
public class DummyUuid {
  @Id
  private String id;
}

package com.samsquad.fakitureapi.repository.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.samsquad.fakitureapi.PojaGenerated;
import lombok.Getter;
import lombok.Setter;

@PojaGenerated
@Entity
@Getter
@Setter
public class Dummy {
  @Id private String id;
}

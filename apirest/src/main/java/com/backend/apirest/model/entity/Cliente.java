package com.backend.apirest.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(schema = "BDTEST", name = "cliente")
public class Cliente implements Serializable {

  private static final long serialVersionUID = -3501295279055998630L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BDTES_SEQ_CLIENTE_ID_GEN")
  @SequenceGenerator(schema = "BDTEST", name = "BDTES_SEQ_CLIENTE_ID_GEN", sequenceName = "BDTES_SEQ_CLIENTE_ID", allocationSize = 1)
  private Long id;
  private String nombre;
  private String apellido;
  private String email;
  @Column(name = "create_at")
  @Temporal(TemporalType.DATE)
  private Date createAt;

}

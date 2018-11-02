package xyz.yooniks.casualtools_api.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import xyz.yooniks.casualtools_api.converter.UUIDConverter;

@Entity
@Table(name = "casualtools_users")
public class UserEntity {

  @Id
  @Column(name = "uuid", columnDefinition = "BINARY(16)", nullable = false, unique = true)
  @Convert(converter = UUIDConverter.class)
  private UUID uuid;

  @Column(name = "coins", columnDefinition = "INT(11)", nullable = false)
  private int coins;

  @Column(name = "level", columnDefinition = "INT(11)", nullable = false)
  private int level;

  @Column(name = "points", columnDefinition = "INT(11)", nullable = false)
  private int points;

  public UserEntity() {
  }

  public int getLevel() {
    return level;
  }

  public UUID getUuid() {
    return uuid;
  }

  public int getCoins() {
    return coins;
  }

  public int getPoints() {
    return points;
  }

}

package xyz.yooniks.casualtools_api.converter;

import java.util.UUID;
import javax.persistence.AttributeConverter;
import xyz.yooniks.casualtools_api.helper.UUIDHelper;

public class UUIDConverter implements AttributeConverter<UUID, byte[]> {

  @Override
  public byte[] convertToDatabaseColumn(UUID uuid) {
    return UUIDHelper.getBytesFromUUID(uuid);
  }

  @Override
  public UUID convertToEntityAttribute(byte[] bytes) {
    return UUIDHelper.getUUIDFromBytes(bytes);
  }

}

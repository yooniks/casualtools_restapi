package xyz.yooniks.casualtools_api.helper;

import java.nio.ByteBuffer;
import java.util.UUID;

public final class UUIDHelper {

  private UUIDHelper() {
  }

  public static byte[] getBytesFromUUID(UUID uuid) {
    final ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
    bb.putLong(uuid.getMostSignificantBits());
    bb.putLong(uuid.getLeastSignificantBits());

    return bb.array();
  }

  public static UUID getUUIDFromBytes(byte[] bytes) {
    final ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
    final Long high = byteBuffer.getLong();
    final Long low = byteBuffer.getLong();

    return new UUID(high, low);
  }

}
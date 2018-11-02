package xyz.yooniks.casualtools_api.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yooniks.casualtools_api.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}

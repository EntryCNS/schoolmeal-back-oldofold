package kr.hs.dgsw.cns.schoolmealbackng.domain.user.repository;

import kr.hs.dgsw.cns.schoolmealbackng.domain.user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

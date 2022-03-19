package kr.hs.dgsw.cns.schoolmealbackng.domain.oauth.repository;

import kr.hs.dgsw.cns.schoolmealbackng.domain.oauth.entity.OAuthUser;
import org.springframework.data.repository.CrudRepository;

public interface OAuthUserRepository extends CrudRepository<OAuthUser, Long> {

}

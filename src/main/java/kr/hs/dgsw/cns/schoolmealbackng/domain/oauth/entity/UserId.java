package kr.hs.dgsw.cns.schoolmealbackng.domain.oauth.entity;

import kr.hs.dgsw.cns.schoolmealbackng.domain.user.entity.User;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserId implements Serializable {

    @Column(name = "user_id")
    private User user;

}

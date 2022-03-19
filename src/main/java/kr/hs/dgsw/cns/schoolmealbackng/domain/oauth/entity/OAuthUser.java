package kr.hs.dgsw.cns.schoolmealbackng.domain.oauth.entity;

import kr.hs.dgsw.cns.schoolmealbackng.domain.user.entity.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class OAuthUser {

    @EmbeddedId
    private UserId userId;

    @NotNull
    @Length(max = 255, min = 255)
    private String token;


}

package com.jpa.demo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepo {

    @PersistenceContext
    private EntityManager em; //엔티티 매니저를 자동으로 생성한다.
//컨트로 시프트 T : 테스트 코드 작성

    public Long save(Member member){ //아이디 정보 조회

        em.persist(member);
        return member.getId();
    }

    public Member find(Long id){
        return em.find(Member.class,id);
    }

}

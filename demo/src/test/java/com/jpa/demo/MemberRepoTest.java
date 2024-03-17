package com.jpa.demo;

import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRepoTest {
    @Autowired MemberRepo memberRepository;

    @Test
    @Transactional
    public void testMember() throws Exception{

        //given
        Member member = new Member();
        member.setUsername("ASDf");

        //when
        Long savedId = memberRepository.save(member);
        Member findMember = memberRepository.find(savedId);


        //then
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());

    }
}
package com.example.replication.repository;

import com.example.replication.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.replication.entity.QUser.*;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomUserRepositoryImpl implements CustomUserRepository {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<User> findUserById(long id) {
        return jpaQueryFactory.selectFrom(user).where(user.id.eq(id)).fetch();
    }
}

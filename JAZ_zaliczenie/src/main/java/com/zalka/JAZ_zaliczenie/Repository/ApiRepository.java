package com.zalka.JAZ_zaliczenie.Repository;

import com.zalka.JAZ_zaliczenie.model.ApiModelDatabase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepository extends JpaRepository<ApiModelDatabase, Long> {
}

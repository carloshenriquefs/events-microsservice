package com.microservice.event.repositories;

import com.microservice.event.domain.Event;
import feign.Param;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {

    @Query(value = "SELECT * FROM events e WHERE PARSE(e.date AS TIMESTAMP) > :currentDate", nativeQuery = true)
    List<Event> findUpComingEvents(@Param("currentDate") LocalDateTime currentDate);

    @NonNull
    Optional<Event> findById(@NonNull String id);
}

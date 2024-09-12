package org.yoursfirst.YoursRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yoursfirst.YoursRest.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    
    List<Album> findByAccount_id(long id);
}

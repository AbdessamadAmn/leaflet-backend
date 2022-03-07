package com.example.leafletbackend.Repository;

import com.example.leafletbackend.Model.Archive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface ArchiveRepo extends JpaRepository<Archive , Date> {

    @Query("select a from Archive a where a.id_device = ?1")
    public List<Archive> getpaths(int id);
}

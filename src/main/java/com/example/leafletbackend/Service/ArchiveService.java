package com.example.leafletbackend.Service;

import com.example.leafletbackend.Model.Archive;
import com.example.leafletbackend.Repository.ArchiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchiveService {

    @Autowired
    private ArchiveRepo archiveRepo;

//    public List<Archive> getAllpaths(int id){
//        return archiveRepo.findById(id);
//    }
}

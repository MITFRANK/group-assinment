package com.library.book.service;

import com.library.book.model.Resource;
import com.library.book.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public Resource getResourceById(long id) {
        return resourceRepository.findById(id).orElse(null);
    }

    public Resource addResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public Resource updateResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public void deleteResource(long id) {
        resourceRepository.deleteById(id);
    }
}

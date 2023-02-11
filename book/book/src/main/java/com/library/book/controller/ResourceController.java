package com.library.book.controller;

import com.library.book.model.Resource;
import com.library.book.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @GetMapping
    public List<Resource> getAllResources() {
        return resourceService.getAllResources();
    }

    @GetMapping("/{id}")
    public Resource getResourceById(@PathVariable long id) {
        return resourceService.getResourceById(id);
    }

    @PostMapping
    public Resource addResource(@RequestBody Resource resource) {
        return resourceService.addResource(resource);
    }

    @PutMapping
    public Resource updateResource(@RequestBody Resource resource) {
        return resourceService.updateResource(resource);
    }

    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable long id) {
        resourceService.deleteResource(id);
    }
}

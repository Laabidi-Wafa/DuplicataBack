package com.project.service;

import java.util.stream.Stream;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Path;

import org.springframework.core.io.Resource;


public interface FilesStorageService {
  public void init();

  public void save(MultipartFile file);

  public Resource load(String filename);

  public void deleteAll();

  public Stream<Path> loadAll();
}

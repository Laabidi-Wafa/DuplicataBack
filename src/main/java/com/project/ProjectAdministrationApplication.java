package com.project;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.service.FilesStorageService;



@SpringBootApplication
public class ProjectAdministrationApplication implements CommandLineRunner {
	
	  @Resource
	  FilesStorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectAdministrationApplication.class, args);
	}
	  @Override
	  public void run(String... arg) throws Exception {
	    storageService.deleteAll();
	    storageService.init();
	  }
	
}

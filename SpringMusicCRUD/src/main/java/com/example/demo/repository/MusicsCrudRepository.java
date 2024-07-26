package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Music;

public interface MusicsCrudRepository extends CrudRepository<Music, Integer>{

}

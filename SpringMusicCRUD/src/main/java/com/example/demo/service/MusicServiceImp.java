package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Music;
import com.example.demo.repository.MusicsCrudRepository;
@Service
public class MusicServiceImp implements MusicService {
	@Autowired
	MusicsCrudRepository repository;
	
	@Override
	public Iterable<Music> findAll(){
		return repository.findAll();
	}
	@Override
	public void insertMusic(Music music) {
		repository.save(music);
	}
	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}
}

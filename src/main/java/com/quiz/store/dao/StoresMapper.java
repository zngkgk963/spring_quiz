package com.quiz.store.dao;

import java.util.List;

import com.quiz.store.domain.Stores;

public interface StoresMapper {
	public List<Stores> selectStoresList();
}

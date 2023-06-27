package com.quiz.store.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.store.dao.StoresMapper;
import com.quiz.store.domain.Stores;

@Service
public class StoresBO {
	@Autowired
	private StoresMapper storesMapper;

	public List<Stores> getStoresList() {
		return storesMapper.selectStoresList();
	}
}

package com.safwan.services.service;

import java.util.Set;

import com.safwan.data.exception.CustomException;
import com.safwan.data.model.Calllog;
import com.safwan.data.model.User;

public interface CalllogService {
	
	public Set<Calllog> listAllCalllogs() throws CustomException;
	
	public void saveOrUpdate(Calllog calllog);
	
	public Calllog findCalllogById(Long id);
	
	public void deleteCalllog(Long id);
	
	public Set<Calllog> listCalllogByUser(User user);
}

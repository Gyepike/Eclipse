package com.anti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anti.dao.Alien3;

public interface AlienRepo  extends JpaRepository<Alien3, Long>{
	public List<Alien3> findByAname(String aname);  // Derived Query Methods  predifined https://www.baeldung.com/spring-data-derived-queries
	long countByAnameLike(String aname);
	List<Alien3> findByAnameLike(String aname);
	List<Alien3> findByAnameOrderByAidDesc(String aname);
	
	@Query("from Alien3 a where a.aname like %?1%")  //select a
	List<Alien3> findByAnameEndsWith(String aname); 
}

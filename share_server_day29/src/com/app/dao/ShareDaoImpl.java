package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.ShareMarket;
@Repository
@Transactional
public class ShareDaoImpl implements ShareDao {
        @Autowired
        private SessionFactory sf;

	public List<ShareMarket> getShare(double min,double max) {
String jpql="select s from ShareMarket s where s.price>m1 or s.price<m2";

		return sf.getCurrentSession().createQuery(jpql,ShareMarket.class).
				setParameter("m1",min).setParameter("m2", max).getResultList();
	}

}

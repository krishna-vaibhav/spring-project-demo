package com.app.dao;

import java.util.List;

import com.app.pojos.ShareMarket;

public interface ShareDao {
List<ShareMarket> getShare(double min,double max);
}

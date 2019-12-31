package com.bw.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Goods;
import com.bw.entity.Type;
import com.bw.mapper.GoodsDao;
import com.bw.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsDao goodsDao;

	public List<Goods> queryGoods(Map<String, Object> map) {
		return goodsDao.queryGoods(map);
	}

	public List<Type> queryType() {
		return goodsDao.queryType();
	}

	public void addGoods(Goods goods) {
		goodsDao.addGoods(goods);
	}

	public void deleteGoods(String ids) {
		goodsDao.deleteGoods(ids);
	}

	public Goods queryGoodsById(Integer id) {
		return goodsDao.queryGoodsById(id);
	}

}

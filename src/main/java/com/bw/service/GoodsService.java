package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Goods;
import com.bw.entity.Type;

public interface GoodsService {
	public List<Goods> queryGoods(Map<String,Object> map);

	public List<Type> queryType();

	public void addGoods(Goods goods);

	public void deleteGoods(String ids);

	public Goods queryGoodsById(Integer id);
}

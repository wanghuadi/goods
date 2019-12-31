package com.bw.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Goods;
import com.bw.entity.Type;

public interface GoodsDao {
	public List<Goods> queryGoods(Map<String,Object> map);

	public List<Type> queryType();

	public void addGoods(Goods goods);

	public void deleteGoods(@Param("id")String ids);

	public Goods queryGoodsById(@Param("id")Integer id);
}

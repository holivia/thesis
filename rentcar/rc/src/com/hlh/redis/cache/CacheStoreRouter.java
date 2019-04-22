package com.hlh.redis.cache;

import java.util.List;

public interface CacheStoreRouter<CacheStore> {

	public abstract CacheStore pickUp(List<CacheStore> paramList, String paramString, Object paramObject);

}

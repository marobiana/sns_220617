package com.sns.like.bo;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.like.dao.LikeDAO;

@Service
public class LikeBO {

	@Autowired
	private LikeDAO likeDAO;
	
	public void likeToggle(int postId, int userId) {
		// 좋아요 있는지 확인
		
		// 있으면 제거
		// 없으면 추가
	}
	
	public int getLikeCountByPostIdOrUserId(int postId, Integer userId) {
		return likeDAO.selectLikeCountByPostIdOrUserId(postId, userId);
	}
	
	public boolean existLike(int postId, int userId) {
		return likeDAO.existLike(postId, userId);
	}
	
	public int getLikeCountByPostId(int postId) {
		return likeDAO.selectLikeCountByPostId(postId);
	}
}

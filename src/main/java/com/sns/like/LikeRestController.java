package com.sns.like;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikeRestController {
	
	//       /like?postId=111
	@RequestMapping("/like/{postId}")
	public Map<String, Object> like(
			@PathVariable int postId) {
		
		// 좋아요 있으면 삭제   없으면 추가
		
		return null;
	}
}




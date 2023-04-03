package com.som.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.som.db.SqlSessionManager;

public class HopeDAO {

SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	// 관리자가  희망상품 등록 작성
	public int insertHope(HopeVO vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		int cnt = sqlSession.insert("insertHope", vo);
		sqlSession.close();

		return cnt;
	}
	
	// 희망상품 불러오기
	public List<HopeVO> showHope(){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<HopeVO> hope_list = sqlSession.selectList("showHope");
		sqlSession.close();
		return hope_list;
	}
	
	// 희망상품 이름 불러오기
	public List<HopeVO> getName(String hope_name) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<HopeVO> hopeName = sqlSession.selectOne("getName", hope_name);
		sqlSession.close();
		
		return hopeName;
	}
	// 희망상품 가격 불러오기
	public List<HopeVO> getPrice(int hope_price){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<HopeVO> price = sqlSession.selectOne("getPrice", hope_price);
		sqlSession.close();
		
		return price;
	}
	
	// 희망상품 사진 불러오기
	public List<HopeVO> getPhoto(String hope_photo){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<HopeVO> photo = sqlSession.selectOne("getphoto", hope_photo);
		sqlSession.close();
		
		return photo;
	}
	
	
	
	// 희망상품 설명 불러오기
	public List<HopeVO> getContent(String hope_content){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<HopeVO> desc = sqlSession.selectOne("getContent" , hope_content);
		sqlSession.close();
		
		return desc;
	}
	
	// 희망상품 상세
	
	public HopeVO getHopeDetail(int hope_seq){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		HopeVO vo = sqlSession.selectOne("getHopeDetail", hope_seq);
		sqlSession.close();
		
		return  vo;
	}
}


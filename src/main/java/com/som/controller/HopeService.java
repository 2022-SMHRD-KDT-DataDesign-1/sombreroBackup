package com.som.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.som.command.Command;
import com.som.model.HopeDAO;
import com.som.model.HopeVO;

public class HopeService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("cccheck");
		String path = request.getServletContext().getRealPath("./file"); // 저장할 경로
		System.out.println("저장 위치: " + path);
		
		int maxSize = 10 * 1024 * 1024; // 10mb
		
		String encoding = "utf-8";
		// 중복제거
		DefaultFileRenamePolicy rename = new DefaultFileRenamePolicy();
		
		// file 업로드
		
		//MultipartRequest multi;
		
		String hope_name = "";
		int hope_price = 0;
		String hope_photo = "";
		String hope_content = "";
		
		MultipartRequest multi;
		
		try {
			multi = new MultipartRequest(request, path, maxSize, encoding, rename);
			hope_name = multi.getParameter("name");
			hope_price = Integer.parseInt(multi.getParameter("Price"));
			hope_photo = multi.getParameter("productImage");
			hope_content = multi.getParameter("description");
		} catch (Exception e) {
			System.out.println("오류발생");
		}
			
		/*String*/ 	
		/*String*/ 	hope_name = request.getParameter("name");
		System.out.println("상품 이름 :" + hope_name);
		/*int*/ 	hope_price = Integer.parseInt(request.getParameter("Price"));
		System.out.println("상품 가격 : " + hope_price);
		/*String*/ 	hope_photo = request.getParameter("productImage");
		System.out.println("상품 사진 : " + hope_photo);
		/*String*/ 	hope_content = request.getParameter("description");
		System.out.println("상품 설명 : " + hope_content);
		
		
		HopeVO vo = new HopeVO(hope_name, hope_price, hope_photo,  hope_content);
		HopeDAO dao = new HopeDAO();
		
		int cnt = dao.insertHope(vo);
		
		System.out.println("넘어오는 값 : " + hope_name);
		
		if(cnt>0) {
			// insert 성공
			System.out.println("희망 상품 insert 성공");
		}else {
			// insert 실패
			System.out.println("희망 상품 insert 실패");
			
		}
			
		
		return "blog.jsp";

	}
}


# varchar
비트캠프 3조 최종프로젝트 

------------------------------------------------------------------------------
                              Project Code 설명
                              
                              
                             < magnific-popup > 
                             
Modal창으로 gitbook EditPage 구현하는 방법. ( gitbook Layout을 벤치마킹 ) 
1. 팝업이 뜨면 보여줄 Layer를 Html파일로 작성한다.
2. 이벤트가 일어날 태그에 data-mfp-src= "Layer 최상단 class 이름" 을 붙혀준다.
  
  ex) 
  ```
  <a href="javascript:void(0)" data-mfp-src=".editBoardGroupPanelWrapper " class="editPage-popup-link"></a>
  ```
  
  
3. jquery 명령어로 getModalFormEditPage("이벤트가 일어날 class명", "모달창을 닫히게 할 수 있는 버튼의 class명") 을 적어준다.
 


 - html -
 ```
 <div th:replace="~{common/board/fragment/editPage :: editPage ( ${boardGroupList} ) }">
 <a href="javascript:void(0)" data-mfp-src=".editBoardGroupPanelWrapper " class="editPage-popup-link">
   <i class="fas fa-plus group_plus"></i>
  </a>
 ``` 
  
- js - 
```
$(function(){
  getModalFormEditPage("editPage-popup-link", ".boardGroupPanelHeaderClose");
})
```

 
------------------------------------------------------------------------------
                              Update 로그
------------------------------------------------------------------------------
06-02 09:46 :  Create Git repository
06-02 17:00 :  kojae merge Git Repository 


06-05  09:33 : kojae merge Master Git Repository 
06-05  19:10 : kojae merge Master Git Repository 

06-08 20:26 : kojae merge Master Git Repository 

------------------------------------------------------------------------------


#고재현
06-02 : 패키지구조 설정, SpringBoot Project DB까지 설정 완료 



#김종성


#진보형 
06-02 : 샘플데이터 작성중
깃 브랜치 생성, 커밋완료!!!
06-05  09:33 : kojae merge Master Git Repository 
06-05  19:10 : kojae merge Master Git Repository 

06-08 20:26 : kojae merge Master Git Repository 



------------------------------------------------------------------------------

06-02 : 패키지구조 설정, SpringBoot Project DB까지 설정 완료 

------------------------------------------------------------------------------

06-03 : JDBC 로그 레벨 상승. TEST로 데이터 잘 넘어오는지 확인
        thymeleaf 템플릿으로 반복적인 게시판 View 부분 Fragment 설정



------------------------------------------------------------------------------

06-04 : 게시글 리스트 , 게시글 등록 폼 제작.
- 텍스트 에디터 제작 -
H1,H2,H3,H4, Bold, Itelic, blackQuote, link, image - drag&drop 으로 올리기

------------------------------------------------------------------------------

#고재현
06-05 : 
customEditor : 이미지 등록 후 해당 강의에 맞는 폴더에 이미지 저장
navBar : 드롭업, 드롭다운 이벤트 구현
=======

06-05 : 
customEditor : 이미지 등록 후 해당 강의에 맞는 폴더에 이미지 저장
navBar : 드롭업, 드롭다운 이벤트 구현


------------------------------------------------------------------------------

06-08 : 
magnific js lib를 사용해
게시판 그룹 명 수정 Modal, 게시판  그룹 등록 Popup 작성
내비게이션 이벤트 : 여러개 요소 있을 때 클릭 시 나열되는 이벤트 구현
MockMvc Test 코드로 Test 구현 


------------------------------------------------------------------------------

06-09 : 
Thymeleaf Layout lib 를 사용하여 layout 지정.

강의별 게시판 완료.  Collection 사용해서 1:N SELECT
게시판 그룹 완료. INSERT 이후 강의별 게시판 컨트롤러 갔다오기


------------------------------------------------------------------------------

06-10 :
좌측 내비게이션 바 이벤트 처리 완료

( 강의별 게시판그룹 ON,OFF
  강의별 게시판그룹별 게시판 리스트 ON,OFF)
게시판그룹 등록, 게시판 그룹 수정. 게시판 등록 완료
게시판 클릭 시 게시글 리스트 뜨게하기.

------------------------------------------------------------------------------

06-11 :
게시판 클릭 시 게시글 조회 : 한개의 게시판에 여러개의 게시글리스트 조회 - 완료

게시글 등록 : execCommend로 만든 HTML 마크업 코드들 모두 DB에 저장   - 완료
게시글 조회 : DB에서 불러온 HTML 마크업 코드들을 적용. 게시글 상세에서 해당 게시판의 게시글이 뜨게끔 내비게이션 기능 적용.  - 완료
게시글 조회 - 게시글 내비게이션에 해당하는 HTML, CSS 적용 완료

------------------------------------------------------------------------------

06-12 :
게시글 등록 - 게시판명이 보이고 클릭 시 해당 게시판으로 이동.

임시저장 - 비동기로 임시저장 후,  임시저장 리스트 등록 , 임시저장 DB에 등록
임시저장 리스트 클릭 시 임시저장 게시글을 조회, 수정가능
게시글리스트 검색기능  - 검색한 텍스트가 노란색으로 마크됨.
내비게이션바 ON/OFF 화살표 이벤트 처리
구현했는데 자잘한 버그 수정..

------------------------------------------------------------------------------

06-14 :
댓글 조회, 댓글등록, 답글등록, 답글조회, 답글의 답글조회 완료

미완성 : 답글의 답글 등록,  댓글 등록 시 comment.js 이벤트가 끊김

------------------------------------------------------------------------------
06-15:
완료 :
답글 등록 - 부모 댓글 번호 찾아서 등록.  
답글 등록 후 fragment return 
일자검색 : 직접검색, 오늘, 최근 1주, 최근 1달 완료
페이징처리 : 게시글 갯수만큼 버튼나오기,  버튼 클릭 시 해당 글만 뜨기

미완료: 
댓글,답글 등록 시 이벤트 끊김.
일자 검색 : 범위검색 창이 뜨는데 끄는게 안됨
페이징 : 이전, 다음 아직 안했음.  
                최대 5개 버튼만 나오게 해야됨 (1,2,3,4,5 ... 7)
         ( 이전  1...7,8,9,10,11 ... 15 다음)


------------------------------------------------------------------------------

06-16 :
1. 게시글등록 - 파일 드래그엔 드롭 이미지 저장 (ajax로)                   
2. 게시글등록 - overflow - scroll event               			 
3. 임시저장 삭제                                                            					 
4. 나가기                                                                        					 
5. 임시저장 등록 에러  ( value 고정)                                
6. 불러온 임시저장에서 게시글등록 안됨. 								 
7. 댓글 암것도 없을 떄 2번처리됨								  	 
8. 게시글 조회시 조회수 증가								  		 
9. 댓글 수 보이기								  			     

------------------------------------------------------------------------------

06-17 :
1. 댓글 수 보이기								  	 	         - 완료 : LEFT OUTER JOIN/ 게시글 리스트 완료
2. 댓글 이벤트 처리.. 하는중.  글자처리 완료 ( *개 댓글, 답글등록, 답글달기 , 숨기기 ) 완료/ 댓글, 답글, 답글의 답글 등록 시 이벤트 처리 남음

------------------------------------------------------------------------------

06-18 :
1. 댓글 완료 !!! 아싸아싸 아자뵹
2. 댓글 수 보이기, 댓글 입력시 바뀌기 
3. 게시글 삭제	
4. 게시판 제목, 설명 수정 
5. 게시글 목록보기에서 이름 같은거 하이라이트됨. postNo으로 찾기	
6. 페이징 - 진행중 ( 5개씩 나오게 하는거랑, 6개 이상일때 처리만 하면됨)
				 - 6 개 이상일때 처리했는데  페이지가 더 있음에도 불구하고  6, 10 등 최소, 최고 버튼 누르면 이전,다음버튼이 비활성화 (이것만 수정하면 페이징끝)

------------------------------------------------------------------------------

06-19 : 
1. 페이징 - 완료  / 다음 끝까지 눌렀을 때  max까지 뜸. but 6번에서 다음 누르면 버튼이 사라짐 해결
                    페이징 첫번째 활성화땐 이전버튼 disabled, 끝페이지 활성화땐 다음버튼 활성화
          5개씩뜨고 마지막엔 그 숫자만큼뜸.  11, 12,13 남았을때 다음누르면 13으로 이동
          

				 
------------------------------------------------------------------------------

해야할 것:

-------------------------------------
게시글 등록
1. 게시글등록 - / 누를 시 메뉴박스 나오기 						     - 미완료    : 하
2. 게시글등록 - 파일선택 버튼 사라지고 이미지로 대체, 정렬 아이콘 생기게하기        - 미완료 /  : 중 / 버튼은 만들었는데, execCommend focus가 끊겨서.. ㅠㅠ 내 5시간
3. 게시글등록 - 파일 드래그엔 드롭 이미지 저장 (ajax로)                   - 완료  // drag event 시 ajax로 이미지 저장
4. 게시글등록 - overflow - scroll event               			 - 완료   // overflow:auto
5. 임시저장 삭제                                                            					 - 완료
6. 나가기                                                                        					 - 완료
7. 임시저장 등록 에러  ( value 고정)                                - 완료   // 게시글 상세 페이지만 고쳐서 temporaryPost안고침. nameSpace 달라서 매핑이 안됨
8. 불러온 임시저장에서 게시글등록 안됨. 								 - 완료   // 게시글 상세 페이지만 고쳐서 temporaryPost안고침. nameSpace 달라서 매핑이 안됨


-------------------------------------
게시판
1. 페이징 								  					 - 완료 / 상/ 이전, 다음, 버튼클릭시 이동하는건 완료
															// 50개 이상일때  6버튼만 나오게 하는건 아직 안함. (5개씩)
															// 이전, 다음 눌렀을때 +5 되는것도 아직. -> 데이터 넣고 실험해보기
2. 내글보기 								  					 - 완료 ( 전체글보기는 reload함. 다른방법 함 찾아보기 )
3. 게시판 제목, 설명 수정 								  		 - 완료 /  중
4. 게시글 조회시 조회수 증가								  		 - 완료 /   EASY ^^
5. 댓글 수 보이기								  			     - 완료 	/  DB에선 짜기 힘들었지만 mybatis 1:N으로 하니까 쉽게 해결됨 ㅠㅠ 내 3시간!!  GROUP 함수 공부하기 !
																	/  재사용성 고려안하고 하드코딩함 !! 쿼리 3개나 추가했어야 함. 반성할 것.ㅜ


-------------------------------------
게시글 상세
1. 댓글, 답글 이벤트처리 ( 글자 )								  	 - 완료  
2. 댓글 암것도 없을 떄 2번처리됨								  	 - 완료 /  fragment를 response 받아서 engine에선 한번 읽힌걸로 보였지만 2번의 function이 실행
3. 게시글 삭제								  	 				 - 완료 /  상
4. 게시글 목록보기에서 이름 같은거 하이라이트됨. postNo으로 찾기			 - 완료 /  중
5. 댓글 수 보이기								  	 	         - 완료 : LEFT OUTER JOIN/ 게시글리스트는 완료, 게시글 상세 진행중  / 완료
6. 게시글 목록 개수, <  >  이벤트처리			  	 	        	 - 미완료 /  중
-------------------------------------


버그 : 
드래그앤 드랍, 이미지등록 폼 : 이미지등록 폼에 이미지 등록 후 드래그 앤 드랍으로 하면 에러뜸.   / 완료  
페이징 : 끝까지 간 다음에 ( 11,12,13 있다고 가정하면 )   그 버튼들 누르면 disabled됨.  / 해결완료


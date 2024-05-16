package com.codestates.script;

public class part3 {
  /*
  ----------------------------------------------------------------------------------------------
      TODO: 유어클래스의 requirement를 참조하여, migration/schema.sql에 추가로 구성해주세요.
  */

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-1. category 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 category 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_1 = "desc category";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-2. content_category 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 content_category 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_2 = "DESC content_category";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-3. role 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 role 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_3 = "DESC role";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-1-4. user 테이블의 구조를 보기위한 SQL을 작성해주세요.
          - 요구사항에 맞는 user 테이블을 작성해야만, 테스트를 통과합니다.
  */
  public static final String PART3_1_4 = "DESC user";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-1. category 테이블에 존재하는 데이터에서 id, name을 찾는 SQL을 작성해주세요.
  */

  public static final String PART3_2_1 = "SELECT id, name FROM category";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-2. user의 name과 email 그리고 그 user가 속한 role name(컬럼명: roleName)을 찾기 위한 SQL을 작성해주세요.
          - 속한 role이 없더라도, user의 name과 email,role name을 모두 찾아야합니다.
  */
  public static final String PART3_2_2 = "SELECT user.name,user.email,role.name FROM user left join role on role.id = user.roleId";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-3. 어느 role에도 속하지 않는 user의 모든 컬럼 데이터를 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_3 = "SELECT * from user where roleId IS NULL ";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-4. content_category 테이블에 존재하는 모든 칼럼의 데이터를 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_4 = "SELECT * FROM content_category";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-5. minsanggu이 작성한 content의 title을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_5 = "SELECT content.title  from content join user on content.userId =user.id where user.name= 'minsanggu'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-6. minsanggu이 작성한 content의 category name을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_6 = "SELECT category.name from content join content_category on content_category.contentId = content.id join category on  category.id = content_category.categoryId  join user on user.id = content.userId where user.name = 'minsanggu' ";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-7. category의 name이 java인 content의 title, body, created_at을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_7 = "select content.title,content.body,content.created_at from content join content_category on content.id = content_category.contentId  join category on category.id=content_category.categoryId where category.name = 'java'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-8. category의 name이 java인 content의 title, body, created_at, user의 name을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_8 = "select content.title,content.body,content.created_at, user.name from content join content_category on content.id = content_category.contentId  join category on category.id=content_category.categoryId join user on content.userId= user.id where category.name = 'java'";;

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-9. teawoongna가 작성한 글의 개수 (컬럼명: ContentCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_9 = "SELECT count(*) AS ContentCount FROM content AS c JOIN user AS U  " +
          "ON u.id = c.uerId WHERE u.name = ''";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 3-2-10. 각 user(컬럼명: name)가 작성한 글의 개수 (컬럼명: ContentCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART3_2_10 = "select count(*) FROM content ";
}

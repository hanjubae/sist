/*
SEQUENCE : Ư���� ���� �ĺ��ڸ� �����ϴ� ������� ����ϴ� OBJECT
  UNIQUE, PRIMARY KEY
  ������ �Ϸù�ȣ
*/

CREATE SEQUENCE TEST_SEQ
INCREMENT BY 1
START WITH 10;

SELECT TEST_SEQ.NEXTVAL
FROM DUAL;

SELECT TEST_SEQ.CURRVAL
FROM DUAL;

SELECT TEST_SEQ.NEXTVAL
FROM DUAL
CONNECT BY LEVEL <=3;

--�������� ����
ALTER SEQUENCE TEST_SEQ
INCREMENT BY 3;

DROP SEQUENCE TEST_SEQ;

SELECT * FROM MYEMP;

/*

INDEX : ���̺� ���� Ư���� (ROW ID)�� �÷��� ���ĵ� ���� �����Ͽ�
�˻��� ���� �����ϱ� ���� ���

*/

CREATE TABLE TB_TEST_04(
  KEY_01 VARCHAR2(10),
  KEY_02 VARCHAR2(10),
  COL_01 VARCHAR2(100),
  COL_02 VARCHAR2(100),
  CONSTRAINT PK_TB_TEST_04 PRIMARY KEY(KEY_01, KEY_02),
  CONSTRAINT UK_TB_TEST_04 UNIQUE(KEY_01)
);

SELECT *
FROM ALL_INDEXES
WHERE INDEX_NAME IN('PK_TB_TEST_04', 'UK_TB_TEST_04');

SELECT OWNER, CONSTRAINT_NAME, TABLE_NAME, INDEX_OWNER, INDEX_NAME
FROM SYS.ALL_CONSTRAINTS
WHERE INDEX_NAME IN ('PK_TB_TEST_04', 'UK_TB_TEST_04');





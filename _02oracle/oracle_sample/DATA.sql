/*
CHAR
10BYTE
*/

CREATE TABLE TB_CHAR(
  �÷�1 CHAR(10 BYTE), 
  �÷�2 CHAR(10 CHAR),
  �÷�3 CHAR(10)
);

INSERT INTO TB_CHAR("�÷�1", "�÷�2", "�÷�3")
VALUES('ABC', 'ABC', 'ABC');

INSERT INTO TB_CHAR("�÷�1", "�÷�2", "�÷�3")
VALUES('������', '������', '������');
  --�ѱ� == 3 BYTE 3 + 9
SELECT * FROM TB_CHAR;

SELECT "�÷�1", �÷�2, �÷�3,
  LENGTHB(�÷�1), LENGTHB(�÷�2), LENGTHB(�÷�3)
  FROM TB_CHAR;
  
  -- VARCHAR, VARCHAR2
  
  CREATE TABLE TB_VARCHAR(
  COL1 VARCHAR2(10 BYTE),
  COL2 VARCHAR2(10 CHAR),
  COL3 VARCHAR2(10)
  );
  
  INSERT INTO TB_VARCHAR(COL1, COL2, COL3)
  VALUES('ABC', 'ABC', 'ABC');
  
  INSERT INTO TB_VARCHAR(COL1, COL2, COL3)
  VALUES('������', '������', '������');

  SELECT * FROM TB_VARCHAR;
  
  SELECT COL1, COL2, COL3, LENGTHB(COL1), LENGTHB(COL1), LENGTHB(COL1)
  FROM TB_VARCHAR;
  
  /*
  NCHAR, NVARCHAR2 ���� ������� �ʴ´�.
  �ٱ��� ������ ���� �����.
  ������ ����!
  */
  
  CREATE TABLE TB_NCHAR(
    COL1 NCHAR(10),
    COL2 NVARCHAR2(10)
  );
  
  INSERT INTO TB_NCHAR(COL1, COL2)
  VALUES('ABCD', 'ABCD');
  
  SELECT LENGTHB (COL1) , LENGTHB (COL2)
    FROM TB_NCHAR;
    
  CREATE TABLE TB_LONG(
    COL1 LONG
    --COL2 LONG
  );
  
  INSERT INTO TB_LONG(COL1)
  VALUES('SDFSFDSFSDFSF');
  
  -- LONG ���´� �ʹ��� �����̺��� �ϳ��� ����ؾ� �Ѵ�!
  
  /*
  ���� �ڷ���
  NUMBER
  NUMBER(5)
  NUMBER(5,2) �ִ� ���� �ڸ� 3�ڸ� �Ҽ� 2�ڸ�
  NUMBER(*, 2)  
  */
  
  CREATE TABLE TB_NUMBER(
    COL1 NUMBER,
    COL2 NUMBER(5),
    COL3 NUMBER(5,2),
    COL4 NUMBER(*,2)
  );
  
  INSERT INTO TB_NUMBER(COL1, COL2, COL3, COL4)
  VALUES(1234.56789, 1234.56789, 124.896, 1234.56789);
  
  SELECT * FROM TB_NUMBER;
  
  -- DATE
  
  CREATE TABLE TB_DATE(
    COL1 DATE,
    COL2 DATE
  );
  --SYSDATE : ������ �ð����� ���� �� �ִ�.
  INSERT INTO TB_DATE(COL1, COL2)
  VALUES(SYSDATE -1, TO_DATE('2016-12-25 12:30:23', 'YYYY-MM-DD HH24:MI:SS'));
  
  SELECT * FROM TB_DATE;
  
   INSERT INTO TB_DATE(COL1, COL2)
  VALUES(SYSDATE -1, ADD_MONTHS(SYSDATE, -1));
  
  
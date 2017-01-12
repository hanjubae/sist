/*
Sub Query
Sub ��밡���� ��Ģ

���� �� ���� �÷�
SELECT FROM WHERE ��ο��� SUB QUEREY ��� ����

���� �� ���� �÷�
FROM WHERE

*/

SELECT LAST_NAME --�÷��� �ϳ��� �ִ� ���� ������ ���� �÷�
FROM EMPLOYEES;

-- ���� �� ���� �÷�
SELECT FIRST_NAME, (SELECT MAX(SALARY) FROM JOBS)
FROM EMPLOYEES
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES);

-- ���� �� ���� �÷�
SELECT EMPLOYEE_ID,FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE (SALARY, JOB_ID)
  = (SELECT SALARY, JOB_ID
  FROM EMPLOYEES
  WHERE EMPLOYEE_ID = 101);

SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY,
  (SELECT SUM(SALARY) FROM EMPLOYEES) AS ������,
  (SELECT COUNT(*) FROM EMPLOYEES) AS ī����,
  (SELECT SUM(SALARY) FROM EMPLOYEES)
  / (SELECT COUNT(*) FROM EMPLOYEES) AS ���
FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, (SELECT SALARY FROM EMPLOYEES) -- ������ ���� �÷��̱� ������ 1�� �ټ��̱� ������ ���� ������ ����.
FROM EMPLOYEES;

--���� ������ �ذ��ϱ� ���� 3���� ���
--1. �׷��Լ��� ���

SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, (SELECT COUNT(SALARY) FROM EMPLOYEES)
FROM EMPLOYEES;

--2. PRIMARY(ù��°) KEY

SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, (SELECT SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID = 101) 
FROM EMPLOYEES;

--3. Rownum ������ �÷�

SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, (SELECT SALARY FROM EMPLOYEES WHERE ROWNUM = 1)
FROM EMPLOYEES;

-- ������ ���� �÷�
select EMPLOYEE_ID, START_DATE, END_DATE, JOB_HISTORY.JOB_ID,
DEPARTMENT_ID
from JOB_HISTORY
where (EMPLOYEE_ID, START_DATE)
  = (select EMPLOYEE_ID, EMPLOYEES.HIRE_DATE
  from EMPLOYEES
  where EMPLOYEE_ID = 102);

--������ ���� ����(Query_)

SELECT FIRST_NAME, SALARY
from EMPLOYEES
where job_id in (select JOB_ID from jobs);


SELECT FIRST_NAME, SALARY 
FROM EMPLOYEES
WHERE job_id = ANY(SELECT job_id FROM JOBS); -- <-> ALL (AND ����), ANY (OR ����)

SELECT FIRST_NAME, SALARY,
    (SELECT AVG(SALARY) 
    FROM EMPLOYEES B
    WHERE A.JOB_ID = B.JOB_ID)
FROM EMPLOYEES A
WHERE A.SALARY > (SELECT AVG(SALARY) 
                  FROM EMPLOYEES B WHERE A.JOB_ID = B.JOB_ID);

-- Ư�� ����(Query)
/*
  ���� �б�
  CASE
*/

SELECT EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER,
  CASE SUBSTR(PHONE_NUMBER, 1, 3)
    WHEN '515' THEN '����'
    WHEN '590' THEN '�λ�'
    WHEN '659' THEN '�뱸'
    WHEN '603' THEN '����'
    ELSE '��Ÿ' END AS ����
FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER,
  CASE WHEN SUBSTR(PHONE_NUMBER, 1, 3) >= '515' THEN '����'
    WHEN SUBSTR(PHONE_NUMBER, 1, 3) < '590' THEN '�λ�'
    WHEN SUBSTR(PHONE_NUMBER, 1, 3) = '659' THEN '�뱸'
    WHEN SUBSTR(PHONE_NUMBER, 1, 3) <= '603' THEN '����'
    ELSE '��Ÿ' END AS ����
FROM EMPLOYEES;

-- DECODE, NVL1, NVL2
SELECT EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER,
    DECODE(SUBSTR(PHONE_NUMBER, 1, 3),
    '515', '����',
    '590', '�λ�',
    '603', '����',
    '��Ÿ') AS ����
FROM EMPLOYEES;

--NVL1, NVL2
SELECT EMPLOYEE_ID, FIRST_NAME, MANAGER_ID,
  NVL(MANAGER_ID, EMPLOYEE_ID),
  NVL2(MANAGER_ID, '����', '����') -- (MANAGER_ID = NULL) ? '����' : '����'
FROM EMPLOYEES;

--ROWNUM ������ �÷�
SELECT ROWNUM, EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER
FROM (
  SELECT ROWNUM, EMPLOYEE_ID, FIRST_NAME, PHONE_NUMBER
  FROM EMPLOYEES
  order by EMPLOYEES.FIRST_NAME
)
--WHERE ROWNUM < 6;
WHERE ROWNUM >= 3 or rownum = 1; -- �߰����� �ǽ��ϸ� ���� �ȵȴ�. �ݵ�� 1�� ���ľ��Ѵ�.
--WHERE ROWNUM =6;

--ROW_NUMBER()
SELECT ROW_CNT, employee_id, FIRST_NAME, PHONE_NUMBER
FROM (
  SELECT employee_id, FIRST_NAME, PHONE_NUMBER,
  ROW_NUMBER() OVER (ORDER BY FIRST_NAME) AS ROW_CNT
  FROM EMPLOYEES
)
WHERE ROW_CNT < 6;

-- RANK(), DENSE_RANK, ROW_NUMBER()
SELECT FIRST_NAME, JOB_ID, SALARY,
  RANK() OVER (PARTITION BY JOB_ID ORDER BY SALARY DESC) AS RANK,
  DENSE_RANK() OVER (PARTITION BY JOB_ID ORDER BY SALARY DESC) AS DENSE_RANK,
  ROW_NUMBER() OVER (PARTITION BY JOB_ID ORDER BY SALARY DESC) AS ROW_NUMBER
FROM EMPLOYEES;

--���� ������
/*
union : ������
intersect : ������
minus : ������
*/

--������
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
UNION ALL
SELECT JOB_TITLE, MIN_SALARY
FROM JOBS;

--������
SELECT EMPLOYEE_ID
FROM EMPLOYEES
INTERSECT -- �ߺ��� ������ �����ϰ� ������
SELECT MANAGER_ID
FROM DEPARTMENTS;

SELECT A.EMPLOYEE_ID
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.EMPLOYEE_ID = B.MANAGER_ID;

SELECT JOB_ID
FROM EMPLOYEES
INTERSECT
SELECT JOB_ID
FROM JOBS;

SELECT DISTINCT A.JOB_ID
FROM EMPLOYEES A, JOBS B
WHERE A.JOB_ID = B.JOB_ID;

--SUB QUERY
SELECT A.JOB_ID
FROM EMPLOYEES A
WHERE A.JOB_ID IN (SELECT B.JOB_ID FROM JOBS B);

SELECT EMPLOYEE_ID
FROM EMPLOYEES
MINUS
SELECT DEPARTMENTS.MANAGER_ID
FROM DEPARTMENTS;

SELECT DISTINCT A.EMPLOYEE_ID
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.EMPLOYEE_ID = B.MANAGER_ID(+)
  AND B.MANAGER_ID IS NULL
  ORDER BY A.EMPLOYEE_ID;
--AND B.MANAGER_ID IS NOT NULL
--ORDER BY A.EMPLOYEE_ID;

--����1) EMPLOYEES ���̺����� Kochhar�� �޿����� ���� ����� ������ �����ȣ,�̸�,������,�޿��� ����϶�.

SELECT A.EMPLOYEE_ID, A.LAST_NAME, A.JOB_ID, A.SALARY
FROM EMPLOYEES A
WHERE SALARY > (SELECT SALARY FROM EMPLOYEES B WHERE B.LAST_NAME = 'Kochhar');

--����� Ǯ��
SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
where SALARY > (SELECT SALARY
                FROM EMPLOYEES
                WHERE LAST_NAME = 'Kochhar');

--����2) EMPLOYEES ���̺����� �޿��� ��պ��� ���� ����� ������ �����ȣ,�̸�,������,�޿�,�μ���ȣ�� ����Ͽ���.

SELECT EMPLOYEE_ID, A.LAST_NAME, A.JOB_ID, A.SALARY, A.DEPARTMENT_ID 
FROM EMPLOYEES A
WHERE A.SALARY < (SELECT AVG(B.SALARY) FROM EMPLOYEES B);

--����� Ǯ��
SELECT EMPLOYEE_ID, A.LAST_NAME, A.JOB_ID, A.SALARY, A.DEPARTMENT_ID 
FROM EMPLOYEES A
WHERE SALARY < (SELECT AVG(salary) FROM EMPLOYEES);

--����3) EMPLOYEES ���̺����� 100�� �μ��� �ּ� �޿����� �ּ� �޿��� ���� �ٸ� ��� �μ��� ����϶�

SELECT DISTINCT A.DEPARTMENT_ID, 
(SELECT MIN(B.SALARY) FROM EMPLOYEES B
WHERE NVL(A.DEPARTMENT_ID, 0) = NVL(B.DEPARTMENT_ID,0))
FROM EMPLOYEES A
WHERE (SELECT MIN(B.SALARY) FROM EMPLOYEES B
WHERE NVL(A.DEPARTMENT_ID, 0) = NVL(B.DEPARTMENT_ID,0)) > (SELECT MIN(SALARY) FROM EMPLOYEES B WHERE B.DEPARTMENT_ID = 100);

--����� Ǯ��

SELECT DEPARTMENT_ID, MIN(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING MIN(SALARY) > (SELECT MIN(SALARY)
                      FROM EMPLOYEES
                      WHERE DEPARTMENT_ID = 100);

--����4) �������� �ּ� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�μ���ȣ�� ����Ͽ���. �� �������� �����Ͽ���.

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, A.SALARY,   DEPARTMENT_ID
FROM EMPLOYEES A
WHERE SALARY = (SELECT MIN(B.SALARY) FROM EMPLOYEES B WHERE A.JOB_ID = B.JOB_ID)
ORDER BY A.JOB_ID;

--����� Ǯ��
SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY,   DEPARTMENT_ID
FROM EMPLOYEES
WHERE (JOB_ID, SALARY) IN (SELECT JOB_ID, MIN(SALARY)
                            FROM EMPLOYEES
                            GROUP BY JOB_ID)
ORDER BY JOB_ID;

--����5) EMPLOYEES �� DEPARTMENTS ���̺����� ������ ���ϵ�� ����� ������ �̸�,����,�μ���,�ٹ����� ����϶�.

SELECT A.LAST_NAME, A.JOB_ID, B.DEPARTMENT_NAME, B.LOCATION_ID
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID 
AND A.JOB_ID = 'SA_MAN';

--����� Ǯ��
SELECT LAST_NAME, JOB_ID, A.DEPARTMENT_ID, B.DEPARTMENT_NAME, B.LOCATION_ID
FROM (SELECT LAST_NAME, JOB_ID, DEPARTMENT_ID
      FROM EMPLOYEES
      WHERE JOB_ID = 'SA_MAN') A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID;      

--����6) ?EMP ���̺����� ���� ���� ����� ���� MANAGER�� �����ȣ�� ����϶�.

SELECT *
FROM(
SELECT A.MANAGER_ID,
  COUNT(*)
FROM EMPLOYEES A
GROUP BY A.MANAGER_ID
ORDER BY COUNT(*) DESC)
WHERE ROWNUM = 1; 

--����� Ǯ��

SELECT MANAGER_ID, COUNT(*)
FROM EMPLOYEES
GROUP BY MANAGER_ID
HAVING COUNT(MANAGER_ID)
    =(SELECT MAX(COUNT(*))
      FROM EMPLOYEES
      GROUP BY MANAGER_ID);

--����7) EMP?���̺�����?����?����?�����?�����ִ�?�μ���ȣ��?�������?����϶�.

SELECT * 
FROM(
  SELECT A.DEPARTMENT_ID, 
  COUNT(*)
  FROM EMPLOYEES A
  GROUP BY A.DEPARTMENT_ID
  ORDER BY COUNT(*) DESC)
WHERE ROWNUM = 1;

--����� Ǯ��

SELECT DEPARTMENT_ID, COUNT(*)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING COUNT(DEPARTMENT_ID) = (SELECT MAX(COUNT(*))
                               FROM EMPLOYEES
                                GROUP BY DEPARTMENT_ID);

--����8) ?EMP?���̺�����?�����ȣ��?123��?�����?������?����?�����ȣ��?192��?�����?�޿�(SAL)����?����?�����?�����ȣ,?�̸�,?����,?�޿���?����϶�.

SELECT A.EMPLOYEE_ID, A.FIRST_NAME, A.JOB_ID, A.SALARY
FROM EMPLOYEES A
WHERE JOB_ID = (SELECT B.JOB_ID FROM EMPLOYEES B WHERE B.EMPLOYEE_ID = 123)
AND A.SALARY > (SELECT B.SALARY FROM EMPLOYEES B WHERE B.EMPLOYEE_ID = 192);

--����� Ǯ��

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = (SELECT JOB_ID
                FROM EMPLOYEES
                WHERE EMPLOYEE_ID = 123)
      AND 
      SALARY > (SELECT SALARY
                FROM EMPLOYEES
                WHERE EMPLOYEE_ID = 192);


--����9) ? ����(JOB)����?�ּ�?�޿���?�޴�?�����?������?�����ȣ,?�̸�,?����,?�μ�����?����϶�.
-- ����1 :?��������?��������?����

SELECT A.EMPLOYEE_ID, A.LAST_NAME, A.JOB_ID, B.DEPARTMENT_NAME
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID
AND A.SALARY = (SELECT MIN(B.SALARY) FROM EMPLOYEES B WHERE A.JOB_ID = B.JOB_ID)
ORDER BY A.JOB_ID DESC;

--����� Ǯ��
SELECT A.EMPLOYEE_ID, A.LAST_NAME, A.JOB_ID, B.DEPARTMENT_NAME, A.SALARY
FROM EMPLOYEES A, DEPARTMENTS B
WHERE B.DEPARTMENT_ID = A.DEPARTMENT_ID
    AND A.SALARY IN (SELECT MIN(SALARY) 
                    FROM EMPLOYEES 
                    GROUP BY JOB_ID)
ORDER BY A.JOB_ID DESC;

--����10) EMPLOYEES ���̺����� �������� �ּ� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ�� ����϶� (IN)

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, HIRE_DATE, SALARY, DEPARTMENT_ID
FROM EMPLOYEES A
WHERE A.SALARY IN (SELECT MIN(B.SALARY) FROM EMPLOYEES B WHERE A.JOB_ID = B.JOB_ID);

--����11) EMPLOYEES ���̺����� 50�� �μ��� �ּ� �޿��� �޴� ��� ���� ���� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ�� ����϶�. �� 50���� ���� (ANY)

SELECT A.EMPLOYEE_ID, A.LAST_NAME, A.JOB_ID, A.HIRE_DATE, A.SALARY, A.DEPARTMENT_ID
FROM EMPLOYEES A
WHERE A.SALARY > ANY(SELECT B.SALARY FROM EMPLOYEES B WHERE B.DEPARTMENT_ID = 50)
AND A.DEPARTMENT_ID != 50;

--����� Ǯ��
SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, HIRE_DATE, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY > (SELECT MIN(SALARY)
                FROM EMPLOYEES
                WHERE DEPARTMENT_ID = 50)
      AND
      DEPARTMENT_ID != 50;

--����12) EMPLOYEES ���̺����� 50�� �μ��� �ְ� �޿��� �޴� ��� ���� ���� �޿��� �޴� ����� ������ �����ȣ,�̸�,����,�Ի�����,�޿�,�μ���ȣ������϶�. ��50���� ���� (ALL)

SELECT *
FROM EMPLOYEES A
WHERE A.SALARY > ALL(SELECT SALARY FROM EMPLOYEES B WHERE B.DEPARTMENT_ID = 50)
AND A.DEPARTMENT_ID != 50;
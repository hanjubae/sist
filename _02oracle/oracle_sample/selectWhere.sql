/*
  WHERE 절 == 조건절
*/

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME = 'John';

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >= 9000;

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME >= 'John';

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID IS NOT NULL;

SELECT * FROM EMPLOYEES;

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID IS NOT NULL
  AND SALARY >= 8000;
  
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME = 'John'
OR FIRST_NAME = 'Den';

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE FIRST_NAME = 'Shanta'
OR FIRST_NAME = 'John'
AND SALARY > 3000;

 -- ALL, ANY, IN, EXISTS, BETWEEN
 SELECT FIRST_NAME, LAST_NAME
 FROM EMPLOYEES
 WHERE FIRST_NAME = ALL('Julia');
 
 SELECT FIRST_NAME, LAST_NAME, JOB_ID, SALARY
 FROM EMPLOYEES
 WHERE SALARY >= ALL(SELECT SALARY FROM EMPLOYEES
                      WHERE JOB_ID = 'IT_PROG');
                      
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES                      
WHERE SALARY = ANY(8000, 3200, 6000);

SELECT FIRST_NAME, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY = ANY(SELECT SALARY FROM EMPLOYEES
                    WHERE JOB_ID = 'IT_PROG')
AND JOB_ID != 'IT_PROG';

--IN
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY IN (8000, 3200, 6000); -- NULL 사용할 수 없다

SELECT FIRST_NAME, LAST_NAME, MANAGER_ID
FROM EMPLOYEES
WHERE MANAGER_ID NOT IN (120, 100);

--EXISTS
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE EXISTS(SELECT 1 FROM DUAL);

SELECT FIRST_NAME, LAST_NAME, salary, JOB_ID
FROM EMPLOYEES A
WHERE NOT EXISTS(SELECT * FROM DUAL B
            WHERE A.JOB_ID = 'IT_PROG');

-- BETWEEN
SELECT *
FROM EMPLOYEES
WHERE SALARY BETWEEN 3200 AND 9000; -- <-> SALARY <3200 OR SALARY > 9000

--LIKE
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'G_ra_d';

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'G%d';

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, salary, DEPARTMENT_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_MAN';

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, salary, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE HIRE_DATE > '19820101';

SELECT LAST_NAME, JOB_ID, salary, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY BETWEEN 3000 AND 5000;

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, HIRE_DATE
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN(145, 152, 203);

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE HIRE_DATE LIKE '05%';

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMMISSION_PCT, DEPARTMENT_ID
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, HIRE_DATE, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY >= 1100
AND JOB_ID = 'ST_MAN';

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY >= 10000
OR JOB_ID = 'ST_MAN';

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE JOB_ID NOT IN('ST_MAN', 'SA_MAN', 'ST_REP');

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE (JOB_ID = 'AD_PRES' AND SALARY >= 12000)
OR JOB_ID = 'SA_MAN';

SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE (JOB_ID = 'AD_PRES' OR JOB_ID = 'SA_MAN')
AND SALARY >= 12000;


-- 요일 이름을 반환(영어)
SELECT DAYNAME(curdate());

-- LAST_DAY(DATE)
-- 월의 마지막날 구하기
SELECT
	CURDATE(),
	LAST_DAY('2026-05-01');

-- DATE_ADD(날짜, INTERVAL 단위)
-- INTERVAL 단위 : 얼마만큼을 단위로 더할 것인가
SELECT
	NOW(),
	DATE_ADD(NOW(), INTERVAL 10 DAY);
	DATE_ADD(NOW(), INTERVAL 3 MONTH);
	DATE_ADD(NOW(), INTERVAL 2 HOUR);

-- DATE_SUB()
-- 날짜에서 기간을 뺀다.
SELECT
	NOW(),
	DATE_SUB(NOW(), INTERVAL 10 DAY),
	DATE_SUB(NOW(), INTERVAL 3 MONTH),
	DATE_SUB(NOW(), INTERVAL 2 HOUR);

-- 날짜 간의 차이 계산
-- DATEDIFF()
-- 두 날짜 사이의 차이를 "일수"로 계산한다.
SELECT
	DATEDIFF('2026-05-10','2026-04-30'),
	DATEDIFF('2026-04-30','2026-05-10');

-- 자주 쓰는 포맷 기호
-- %Y : 4자리 년도		2026
-- %y : 2자리 년도		26
-- %m : 2자리 월		04
-- %c : 1~2자리 월	4
-- %d : 2자리 일		01
-- %e : 1~2자리 일	1
-- %H : 24시간제 시	15
-- %h : 12시간제 시	03
-- %i : 분
-- %s : 초
-- %W : 요일명		Thursday
-- %a : 잛은 요일명	Thu
select date_format('2026-04-30 15:20:10', '%Y년 %m월 %d일 %H시 %i분');

-- MAKEDATE(연도, 일수)
select MAKEDATE(2026,32);

CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer VARCHAR(50),
    order_date DATE,
    ship_date DATE,
    price INT
);

INSERT INTO orders (customer, order_date, ship_date, price) VALUES
('홍길동', '2025-01-02', '2025-01-05', 30000),
('이몽룡', '2025-01-10', '2025-01-12', 45000),
('성춘향', '2024-12-28', '2025-01-03', 52000),
('김철수', '2025-02-01', '2025-02-03', 15000),
('박영희', '2025-02-10', NULL, 22000);  -- 아직 배송되지 않음

-- 주문테이블에서 고객의 이름과 주문날짜의 년,월,일을 조회하세요
select customer,
	year(order_date),
	month(order_date),
	day(order_date)
	from orders;

-- 배공까지 걸린 일수를 이름과 함께 조회하기
select customer,
	DATEDIFF(ship_date,order_date)
from orders
where ship_date is not null;

-- 2025년 1월에 주분된 주문만 조회
select * from orders
where year(order_date) = 2025
and month(order_date) = 1;

-- 주문날짜를 기준으로 2024년에 주문된 기록만 조회
select * from orders
where year(order_date) = 2024;
-- where year(order_date) = year(curdate())-1;

DROP TABLE IF EXISTS EMPLOYEES;

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    EMAIL VARCHAR(100),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(20),
    SALARY INT,
    COMMISSION_PCT DECIMAL(3,2),
    MANAGER_ID INT,
    DEPARTMENT_ID INT
);

INSERT INTO EMPLOYEES VALUES
(100, 'Steven', 'King', 'SKING', '2003-06-17', 'AD_PRES', 24000, NULL, NULL, 90),
(101, 'Neena', 'Kochhar', 'NKOCHHAR', '2005-09-21', 'AD_VP', 17000, NULL, 100, 90),
(102, 'Lex', 'De Haan', 'LDEHAAN', '2001-01-13', 'AD_VP', 17000, NULL, 100, 90),
(103, 'Alexander', 'Hunold', 'AHUNOLD', '2006-01-03', 'IT_PROG', 9000, NULL, 102, 60),
(104, 'Bruce', 'Ernst', 'BERNST', '2007-05-21', 'IT_PROG', 6000, NULL, 103, 60),
(105, 'David', 'Austin', 'DAUSTIN', '2005-06-25', 'IT_PROG', 4800, NULL, 103, 60),
(106, 'Valli', 'Pataballa', 'VPATABAL', '2006-02-05', 'IT_PROG', 4800, NULL, 103, 60),
(107, 'Diana', 'Lorentz', 'DLORENTZ', '2007-02-07', 'IT_PROG', 4200, NULL, 103, 60),
(108, 'Nancy', 'Greenberg', 'NGREENBE', '2002-08-17', 'FI_MGR', 12000, NULL, 101, 100),
(109, 'Daniel', 'Faviet', 'DFAVIET', '2002-08-16', 'FI_ACCOUNT', 9000, NULL, 108, 100),
(110, 'John', 'Chen', 'JCHEN', '2005-09-28', 'FI_ACCOUNT', 8200, NULL, 108, 100),
(111, 'Ismael', 'Sciarra', 'ISCIARRA', '2005-09-30', 'FI_ACCOUNT', 7700, NULL, 108, 100),
(112, 'Jose Manuel', 'Urman', 'JMURMAN', '2006-03-07', 'FI_ACCOUNT', 7800, NULL, 108, 100),
(113, 'Luis', 'Popp', 'LPOPP', '2007-12-07', 'FI_ACCOUNT', 6900, NULL, 108, 100),
(114, 'Den', 'Raphaely', 'DRAPHEAL', '2002-12-07', 'PU_MAN', 11000, NULL, 100, 30),
(115, 'Alexander', 'Khoo', 'AKHOO', '2003-05-18', 'PU_CLERK', 3100, NULL, 114, 30),
(116, 'Shelli', 'Baida', 'SBAIDA', '2005-12-24', 'PU_CLERK', 2900, NULL, 114, 30),
(117, 'Sigal', 'Tobias', 'STOBIAS', '2005-07-24', 'PU_CLERK', 2800, NULL, 114, 30),
(118, 'Guy', 'Himuro', 'GHIMURO', '2006-11-15', 'PU_CLERK', 2600, NULL, 114, 30),
(119, 'Karen', 'Colmenares', 'KCOLMENA', '2007-08-10', 'PU_CLERK', 2500, NULL, 114, 30);

select * from EMPLOYEES

-- 부서번호가 30번인 사원들의 이름을 출력하되, 이름 중 'el'을 모두 '**'로 마스킹 처리하여 출력
select replace(first_name, 'el', '**')
from employees
where department_id = 30;

-- 이름이 6글자 이상인 사원의 사번과 이름, 급여를 조회
select FIRST_NAME, SALARY
from EMPLOYEES
where CHAR_LENGTH(FIRST_NAME) >=6;

-- 이름과 사원번호를 출력하되, 사원번호는 짝수면 0, 홀수면 1로 출력
select MOD(EMPLOYEE_ID,2), FIRST_NAME
from EMPLOYEES;

-- 사원번호가 짝수인 사람들의 사원번호와 이름 조회
select EMPLOYEE_ID, FIRST_NAME
from EMPLOYEES
where MOD(EMPLOYEE_ID,2) =0;

-- 사원테이블에서 이름, 급여, 1000당 ■로 개수를 채워 조회하기
-- EX 홍길동 8000 ■■■■■■■■ (네모8개)
select FIRST_NAME, SALARY, REPEAT('■',ROUND(SALARY/1000))
from EMPLOYEES;

-- 사원테이블에서 이름, 입사날짜, 6개월 뒤 입사날짜 순으로 조회
select FIRST_NAME, HIRE_DATE, DATE_ADD(HIRE_DATE, INTERVAL 6 MONTH)
from EMPLOYEES;

-- 집계함수
-- 여러 행의 값을 하나의 결과값으로 요약해주는 함수

# 학생 점수를 저장한 score 테이블을 먼저 만들고 데이터를 넣는다.
CREATE TABLE score (
  id INT,
  name VARCHAR(30),
  subject VARCHAR(20),
  point INT
);

INSERT INTO score VALUES
(1, '홍길동', '국어', 85),
(2, '김철수', '영어', 90),
(3, '이영희', '수학', 78),
(4, '박민수', '영어', 92),
(5, '최다혜', '국어', NULL);

-- COUNT()
-- 값의 개수를 반환하는 함수
select COUNT(POINT) from SCORE; -- 점수가 NULL이 아닌 개수
select COUNT(NAME) from SCORE;
select COUNT(*) from SCORE; -- NULL을 포함한 모든 행의 개수

-- SUM()
-- NULL은 제외한 총합을 구한다.
select SUM(POINT) from SCORE;

-- AVG()
-- NULL을 제외하고 평균을 구한다.
select AVG(POINT) from SCORE;

-- MAX()
-- 최대값을 구한다.
select MAX(POINT) from SCORE;

-- MIN()
-- 최소값을 구한다.
select MIN(POINT) from SCORE;

-- 사원테이블에서 직종이(JOB_ID)가 'IT_PROG'인 사람들의
-- 평균 급여, 급여 최고액, 급여 최저액, 급여의 총 합계를 출력
select AVG(SALARY), MAX(SALARY), MIN(SALARY), SUM(SALARY)
from EMPLOYEES
where JOB_ID = 'IT_PROG';

-- 100번 부서의 사원들의 급여의 평균(소수점 한자리까지)을 출력
select ROUNT(AVG(SALARY),1)
from EMPLOYEES
where DEPARTMENT_ID = 100;

-- 총 사원수
select COUNT(*) from EMPLOYEES;

-- 급여가 5000 이상인 사원들의 평균급여
select AVG(SALARY)
from EMPLOYEES
where SALARY >= 5000;

-- 2005년에 입사한 사원 수
select COUNT(*)
from EMPLOYEES
where YEAR(HIRE_DATE) = 2005;

-- 일반적으로 집계함수와 일반 속성의 조회는 SELECT절에서 불가능
select JOB_ID, COUNT(*)
from EMPLOYEES
group by JOB_ID;

-- GROUP BY로 묶은 속성은 SELECT에서 집계함수와 함께 사용 가능

-- 사원테이블에서 각 직종별 급여의 합 구하기
select JOB_ID, SUM(SALARY)
from EMPLOYEES
group by JOB_ID;

-- 부서별로 가낭 높은 급여 조회
select DEPARTMENT_ID, MAX(SALARY)
from EMPLOYEES E
group by DEPARTMENT_ID;

-- 그룹별로 구분을 할 때 기준이 꼭 하나일 필요는 없다.
select DEPARTMENT_ID, JOB_ID, COUNT(*)
from EMPLOYEES
-- where JOB_ID like '%PROG';
group by DEPARTMENT_ID, JOB_ID;


-- 입사년도별 사원수를 조회, 년도 이름순으로 조회하기
select YEAR(HIRE_DATE), COUNT(*)
from EMPLOYEES
group by YEAR(HIRE_DATE);

-- 부서별로 최고 급여와 최저 급여의 차이를 구하세요.
select DEPARTMENT_ID, MAX(SALARY)-MIN(SALARY)
from EMPLOYEES
group by DEPARTMENT_ID;

-- 이름에 'a'가 포함된 사원들만 대상으로, 이름 길이별 사원수를 구하세요.
select CHAR_LENGTH(FIRST_NAME), COUNT(*)
from EMPLOYEES
where FIRST_NAME like '%a%'
group by CHAR_LENGTH(FIRST_NAME)

-- 입사일 기준 요일별 사원수를 구하세요.
select DAYNAME(HIRE_DATE), COUNT(*)
from EMPLOYEES
group by DAYNAME(HIRE_DATE);


-- having

-- 급여가 5000 이상인 사원들을 디상으로
-- 부서별 평균 급여가 7000 이상인 부서 조회하기
select DEPARTMENT_ID, AVG(SALARY) 
from EMPLOYEES
where SALARY >= 5000
group by DEPARTMENT_ID
having AVG(SALARY) >= 7000;

-- 많이 하는 실수
-- where 절에 그룹함수 조건 걸기
-- group by 안한 속성을 select에서 사용
-- having 대신에 where 사용

-- 부서별 사원수를 구하고 사원수가 3명 이상인 부서만 조회
selecT DEPARTMENT_ID, COUNT(*)
from EMPLOYEES E
group by DEPARTMENT_ID
having COUNT(*) >= 3;

-- 부서별 최고 급여가 10000 이상인 부서 조회
selecT DEPARTMENT_ID, MAX(SALARY)
from EMPLOYEES
group by DEPARTMENT_ID
having MAX(SALARY) >= 10000;

-- 입사년도별 사원수 중 5명 이상인 년도만 출력
select year(HIRE_DATE), COUNT(*)
from EMPLOYEES
group by year(HIRE_DATE)
having COUNT(*) >= 5;

DROP TABLE IF EXISTS sales;

CREATE TABLE sales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(50),
    amount INT,
    sale_date DATE
);

INSERT INTO sales (category, amount, sale_date) VALUES
('식품', 80000, '2025-01-01'),
('식품', 70000, '2025-01-02'),
('식품', 60000, '2025-01-03'),

('전자제품', 250000, '2025-01-01'),
('전자제품', 150000, '2025-01-02'),

('의류', 30000, '2025-01-01'),
('의류', 25000, '2025-01-03'),

('도서', 12000, '2025-01-02'),

('가구', 180000, '2025-01-03'),
('가구', 50000, '2025-01-04'),

('문구', 10000, '2024-12-31'),
('문구', 15000, '2025-01-02');

select * from sales

-- 판매가 2번 이상 발생한 카테고리만 조회
select category, count(*)
from sales
having count(*) >= 2;

-- 카테고리별 평균 결제 금액이 100,000원 이상인 것만 조회
select amount, avg(amount)

-- 2025-01-02 이후의 거래만 대상, 카테고리별 총액이 20,000원 이상인 경우만 조회















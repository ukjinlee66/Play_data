-- Select01.sql --

-- select 컬럼, ,, 컬럼 from 데이터베이스.테이블;

-- select * from empdb.dept;
-- use empdb;
-- select * from empdb.dept;
-- select * from empdb.salgrade;
-- select * from empdb.emp;

-- -- 직원들의 이름, 사번, 급여는 ?

-- select ename, empno, sal
-- from emp;

-- -- 부서들의 부서명, 위치는 ?
-- select dname, loc
-- from dept;

-- -- 직원들의 이름, 사번, 업무, 급여, 입사일지는 ?

-- select ename as "사원이름", empno "사번", job as 업무, sal 급여, hiredate
-- from emp;

-- select distinct job from emp; -- distinct < -- 중복 제거

-- select ename, empno, job from emp order by ename desc; -- asc[기본값] 오름차순 desc[내림차순]alter

-- 직원들의 부서번호, job, 이름, 사번 출력하는데 단 부서번호는 내림차순으로. job 오름차순
-- select deptno, job, ename, empno from dept, emp order by deptno desc, job;
use empdb;
select deptno as "부서번호", job as "일", ename as "이름", empno "사번" from emp order by deptno desc, job;


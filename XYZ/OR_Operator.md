DDL 
-> This language is used to define the table



Q> WAQTD employee name and department number who are working in dept number 20 and 10.

SQL> select ename, deptno
from emp
where deptno = 10 and deptno = 20;

ENAME          DEPTNO
---------- ----------
SMITH              20
JONES              20
CLARK              10
SCOTT              20
KING               10
ADAMS              20
FORD               20
MILLER             10
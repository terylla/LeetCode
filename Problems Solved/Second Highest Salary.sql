Write a SQL query to get the second highest salary from the Employee table.

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

# Write your MySQL query statement below
SELECT ( 
    SELECT DISTINCT Salary 
FROM Employee
ORDER BY Salary DESC
LIMIT 1,1
        ) AS SecondHighestSalary
# LIMIT 1,1 => first 1: the row to return, in this case, 0 = 300, 1 = 200, 2 = 100, return 1 for 2nd highest
    ## second 1: number of row to return, we only need 1

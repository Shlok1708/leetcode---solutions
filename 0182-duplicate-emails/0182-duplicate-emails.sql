# Write your MySQL query statement below
SELECT email AS Email
FROM person 
group by email
having count(*)>1;
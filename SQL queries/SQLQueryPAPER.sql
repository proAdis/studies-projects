--15
select p.*
from Products p
where  UnitsInStock=0

--16
select count(p.ProductID)  AS [OUT OF STOCK]
from Products p
where  UnitsInStock=0




--28
select e.FirstName, e.LastName, count(o.EmployeeID)
from Employees e  left join  orders o on e.EmployeeID=o.CustomerID
where count(o.CustomerID)>0
group by o.EmployeeID

--29 

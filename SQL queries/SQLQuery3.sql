select ProductName, UnitsOnOrder, (UnitsInStock*UnitPrice) as [sum of order price]
from Products
where UnitsOnOrder>0
order by productName
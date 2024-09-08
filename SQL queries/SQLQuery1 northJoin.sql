select products.*,Categories.CategoryName, Suppliers.CompanyName
from products
inner join Categories on Products.CategoryID=Categories.CategoryID
inner join Suppliers on Suppliers.SupplierID=Products.SupplierID
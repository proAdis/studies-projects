select Country ,count(SupplierID) as [num of supplier in the country]
from Suppliers
group by Country
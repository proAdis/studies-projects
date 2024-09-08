select e.*
from Employees e left join Orders o on E.Country=o.ShipCountry
where o.ShipCountry is null

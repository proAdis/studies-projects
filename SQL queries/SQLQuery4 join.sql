select tblClients.ClientName
from tblClients
inner join tblLendings on tblClients.clientId=tblLendings.clientId
inner join tblCassettes on tblLendings.cassetteId=tblCassettes.cassetteId
where tblCassettes.cassetteName='purim'
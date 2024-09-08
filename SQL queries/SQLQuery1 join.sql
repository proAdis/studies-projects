select tblLendings.*, tblClients.ClientName, tblCassettes.cassetteName 
from (tblLendings
inner join tblClients on tblClients.clientId=tblLendings.clientId
inner join tblCassettes on tblCassettes.cassetteId=tblLendings.cassetteId)
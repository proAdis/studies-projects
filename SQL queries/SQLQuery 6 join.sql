select tblCassettes.cassetteName
from tblCassettes
inner join tblLendings on tblCassettes.cassetteId=tblLendings.cassetteId
inner join tblClients on tblClients.clientId=tblLendings.clientId
inner join tblAuthors on tblAuthors.authorId=tblCassettes.authorId
where tblClients.ClientName='levi'
order by authorName
select tblCassettes.cassetteName
from tblCassettes
inner join tblAuthors on tblCassettes.authorId=tblAuthors.authorId
where authorName='Avraham Frid'
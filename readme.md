# API TODO

Project create for learning about rest API with JAVA usign postgresql

## Methods

`POST` Create new todo

return `201` if a sucess case
return `400` if it is a invalid JSON
return `422` if is a field is not parseable

`PUT` Update todo

return `200` if a sucess case
return `400` if it is a invalid JSON
return `402` if a data not exist
return `422` if is a field is not parseable

`DELETE` Delete todo

return `204` if a sucess case

`GET` Get all todos

return `200` if a sucess case
return `405` if there is no data
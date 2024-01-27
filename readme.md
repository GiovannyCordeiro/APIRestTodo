# API TODO

Project create for learning about rest API with JAVA usign postgresql

## Methods

### `POST` Create new todo

Return `201` if a sucess case
Return `400` if it is a invalid JSON
Return `422` if is a field is not parseable

### `PUT` Update todo

Return `200` if a sucess case
Return `400` if it is a invalid JSON
Return `402` if a data not exist
Return `422` if is a field is not parseable

### `DELETE` Delete todo

Return `204` if a sucess case

### `GET` Get all todos

Return `200` if a sucess case
Return `405` if there is no data
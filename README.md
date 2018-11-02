# casualtools_restapi
Simple rest-api for my minecraft plugin

## Endpoints

| Method                                             | Success status codes   | Error status codes |
| -------------------------------------------------- | ---------------------  | ------------------ |                   
| **GET  /api/users/get-by-uuid/{id}**               | 200                    | 404                |

### `GET /api/users/get-by-uuid/bacdbf5a-3629-48b8-a7d7-59fd71165215`
```json
{
  "uuid" : "bacdbf5a-3629-48b8-a7d7-59fd71165215",
  "coins" : 20,
  "level" : 0,
  "points" : 44
}
```

# Kotlin Spring Boot CRUD Web API入門

## Quick Start

```shell
$ make up
$ make run
```

## APIのテスト

- カスタマーを取得

```shell
$ curl --location --request GET 'http://localhost:8080/customers'
```

- カスタマーを作成

```shell
$ curl --location --request POST 'http://localhost:8080/customers' \
--header 'Content-Type: application/json' \
--data-raw '{
    "first_name": "Carol",
    "last_name": "Sample3"
}
'
```

- カスタマーを更新

```shell
$ curl --location --request PUT 'http://localhost:8080/customers/3' \
--header 'Content-Type: application/json' \
--data-raw '{
    "first_name": "Eve",
    "last_name": "Sample4"
}'
```

- カスタマーを削除

```shell
$ curl --location --request DELETE 'http://localhost:8080/customers/3'
```

## Ref

- https://zenn.dev/msksgm/books/implementing-server-side-kotlin-development
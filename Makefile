run:
	@/Users/iwakiaoiyou/kotlin-spring-crud-web-api/gradlew bootRun
up:
	@docker compose up -d

down:
	@docker compose down

restart: down up

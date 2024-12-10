package com.example.kotlin_spring_crud_web_api

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.*

/**
 * Customer テーブルのCRUDを行う Web APIのエンドポイントを定義するクラス
 *
 * @property customerService カスタマーサービス
 */
@RestController
class CustomerController(val customerService: CustomerService) {
    /**
     * Customer 作成エンドポイント
     *
     * @param request
     * @return
     */
    @PostMapping("/customers")
    fun insert(@RequestBody request: CustomerRequest): String {
        customerService.insertCustomer(request.firstName, request.lastName)
        return """
            {
                "message": "success"
            }
        """.trimIndent()
    }

    /**
     * Customer 一覧取得エンドポイント
     *
     * @return
     */
    @GetMapping("/customers")
    fun read(): CustomerResponse {
        return CustomerResponse(customers = customerService.selectCustomer())
    }

    /**
     * Customer 更新エンドポイント
     *
     * @param id
     * @param request
     * @return
     */
    fun update(@PathVariable("id") id: Int, @RequestBody request: CustomerRequest): String {
        customerService.updateCustomer(id, request.firstName, request.lastName)
        return """
            {
                "message": "success"
            }
        """.trimIndent()
    }

    /**
     * Customer 削除エンドポイント
     *
     * @param id
     * @return
     */
    @DeleteMapping("/customers/{id}")
    fun delete(@PathVariable("id") id: Int): String {
        customerService.deleteCustomer(id)
        return """
            {
                "message": "success"
            }
        """.trimIndent()
    }
}

/**
 * Customer 作成エンドポイント、Customer 更新エンドポイントのリクエストボディ
 *
 * @property firstName
 * @propetry lastName
 */
data class CustomerRequest(
    @JsonProperty("firstName") val firstName: String,
    @JsonProperty("lastName") val lastName: String
)

/**
 * Customer 一覧取得エンドポイントのレスポンス
 *
 * @property customers
 */
data class CustomerResponse(
    val customers: List<Customer>,
)
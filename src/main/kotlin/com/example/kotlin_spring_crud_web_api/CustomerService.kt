package com.example.kotlin_spring_crud_web_api

/**
 * Customer 操作を行うメソッドをまとめるインターフェース
 *
 */


interface CustomerService {
    /**
     * Customer 追加
     *
     * @param firstName
     * @param lastName
     */
    fun insertCustomer(firstName: String, lastName: String)

    /**
     * Customer 取得
     *
     * @return
     */
    fun selectCustomer(): List<Customer>

    /**
     * Customer 更新
     *
     * @param id
     * @param firstName
     * @param lastName
     */
    fun updateCustomer(id: Int, firstName: String, lastName: String)

    /**
     * Customer 削除
     *
     * @param id
     */
    fun deleteCustomer(id: Int)
}
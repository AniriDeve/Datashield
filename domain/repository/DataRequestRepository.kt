interface DataRequestRepository {

    fun createRequest(request: DataRequest)

    fun getAllRequests(): List<DataRequest>

    fun getRequestById(id: String): DataRequest?

    fun deleteRequest(id: String)
}

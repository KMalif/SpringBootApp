package plugin.backend.spring_boot_api.model

data class Bank(
        val accountNumber : String,
        val trust : Double,
        val transactionFee : Int
)

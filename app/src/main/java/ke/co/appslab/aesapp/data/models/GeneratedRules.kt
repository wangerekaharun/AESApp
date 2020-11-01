package ke.co.appslab.aesapp.data.models

data class GeneratedRules (
    val int : Int,
    val antecendents : List<String>,
    val consequents : List<String>,
    val antecedentSupport : Float,
    val consequentSupport : Float,
    val support : Float,
    val confidence : Float,
    val lift : Float,
    val leverage : Float,
    val conviction : Float,
)
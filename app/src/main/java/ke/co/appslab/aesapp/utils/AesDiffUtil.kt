package ke.co.appslab.aesapp.utils

import androidx.recyclerview.widget.DiffUtil
import ke.co.appslab.aesapp.data.models.AesResults

class AesDiffUtil : DiffUtil.ItemCallback<AesResults>() {
    override fun areItemsTheSame(oldItem: AesResults, newItem: AesResults): Boolean {
        return oldItem.serialNumber == newItem.serialNumber
    }

    override fun areContentsTheSame(oldItem: AesResults, newItem: AesResults): Boolean {
        return oldItem.serialNumber == newItem.serialNumber
    }
}
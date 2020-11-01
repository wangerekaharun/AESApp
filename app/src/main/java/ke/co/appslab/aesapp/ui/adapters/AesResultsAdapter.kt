package ke.co.appslab.aesapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ke.co.appslab.aesapp.data.models.AesResults
import ke.co.appslab.aesapp.databinding.ItemAesResultsBinding
import ke.co.appslab.aesapp.utils.AesDiffUtil

class AesResultsAdapter : ListAdapter<AesResults,AesResultsAdapter.AesResultsViewHolder>(AesDiffUtil()) {

    class AesResultsViewHolder(private val binding: ItemAesResultsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(aesResults: AesResults){
            with(aesResults){
                binding.tvSerialNo.text = serialNumber.toString()
                binding.tvAes.text = aes
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AesResultsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemAesResultsBinding.inflate(inflater)
        return AesResultsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AesResultsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
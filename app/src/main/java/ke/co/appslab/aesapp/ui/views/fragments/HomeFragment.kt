package ke.co.appslab.aesapp.ui.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ke.co.appslab.aesapp.databinding.FragmentHomeBinding
import ke.co.appslab.aesapp.ui.adapters.AesResultsAdapter
import ke.co.appslab.aesapp.utils.aesResults

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding?= null
    private val binding get() = _binding!!
    private val aesResultsAdapter = AesResultsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding.rvAesResults.adapter = aesResultsAdapter
        aesResultsAdapter.submitList(aesResults)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
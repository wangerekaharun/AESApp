package ke.co.appslab.aesapp.ui.views.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import com.vhl.blackmo.grass.dsl.grass
import ke.co.appslab.aesapp.R
import ke.co.appslab.aesapp.data.models.GeneratedRules
import ke.co.appslab.aesapp.databinding.FragmentLoginBinding
import java.io.File

class LoginFragment : Fragment() {
    private var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        testReadCsv()
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun testReadCsv() {
        val file = requireContext().assets.open("generated_rules.csv")
        val rows: List<List<String>> = csvReader().readAll(file)
//        val csvContents =  csvReader().readAllWithHeader(file)
//        val generatedRules = grass<GeneratedRules>().harvest(csvContents)
        Log.d("CSVData",rows[0].toString())
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
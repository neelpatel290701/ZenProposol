package pro.zentrades.zenpro.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import pro.zentrades.zenpro.R
import pro.zentrades.zenpro.databinding.FragmentHomeScreenBinding

@Suppress("DEPRECATION")
class HomeScreen : Fragment() {

    private lateinit var binding: FragmentHomeScreenBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)
        requireActivity().title = ""
        setHasOptionsMenu(true)

        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }


}
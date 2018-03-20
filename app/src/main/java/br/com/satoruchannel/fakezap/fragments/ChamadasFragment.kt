package br.com.satoruchannel.fakezap.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.satoruchannel.fakezap.R


/**
 * A simple [Fragment] subclass.
 */
class ChamadasFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_chamadas, container, false)
    }

}// Required empty public constructor

package com.example.venture_v0.Fragments.explore;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.venture_v0.R;
import com.example.venture_v0.adapters.EventsRecyclerViewAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ExploreEventListFragment} interface
 * to handle interaction events.
 * Use the {@link ExploreEventListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExploreEventListFragment extends Fragment {

    private static final String TAG = "ExploreEventListFragment";

    //vars
    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<String> mEventName = new ArrayList<>();
    private ArrayList<String> mEventLocation = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    public ExploreEventListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExploreEventListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ExploreEventListFragment newInstance(String param1, String param2) {
        ExploreEventListFragment fragment = new ExploreEventListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("LongLogTag")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore_event_list, container, false);
        Log.d(TAG, "onCreateView: started.");
        initData(view);
        return view;
    }
    @SuppressLint("LongLogTag")
    private void initData(View view){
        Log.d(TAG, "initData: preparing data.");

        mImage.add("trial_image.jpg");
        mEventName.add("A Walk to Remember");
        mEventLocation.add("Santa Cruz");

        mImage.add("sf_trail.jpg");
        mEventName.add("Second Walk to Remember");
        mEventLocation.add("San Francicso");

        mImage.add("sf_trail.jpg");
        mEventName.add("Third Walk to Remember");
        mEventLocation.add("San Mateo");

        initRecyclerView(view);
    }

    @SuppressLint("LongLogTag")
    private void initRecyclerView(View view){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = view.findViewById(R.id.event_list_recyclerview);
        EventsRecyclerViewAdapter adapter = new EventsRecyclerViewAdapter(getContext(), mImage,mEventName, mEventLocation);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}

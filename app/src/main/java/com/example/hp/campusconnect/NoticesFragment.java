package com.example.hp.campusconnect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class NoticesFragment extends android.app.Fragment {
    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public NoticesFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static NoticesFragment newInstance(int columnCount) {
        NoticesFragment fragment = new NoticesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notices_list, container, false);
        // Set the adapter
        String from[] = {"title", "smallDescription", "time"};
        int to[] = {R.id.title, R.id.small_description, R.id.time};
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(from[0], "Sessional Examinations!");
        hashMap.put(from[1], "1st Sessional Examinations for B.Tech. classes have been scheduled from 2nd February 2018 to 5th February 2018.".substring(0, 50) + "...");
        hashMap.put(from[2], "12 January 2018");
        for (int i = 0; i < 25; i++) {
            arr.add(hashMap);
        }
        ListView listView = view.findViewById(R.id.notices_list_view);
        SimpleAdapter simpleAdapter = new SimpleAdapter(view.getContext(), arr, R.layout.fragment_notices, from, to);
        listView.setAdapter(simpleAdapter);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction();
    }
}
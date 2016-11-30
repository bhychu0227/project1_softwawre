package com.example.computer_pc.project1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SelectionFragment extends Fragment {
    private final String LOG_TAG = SelectionFragment.class.getSimpleName();
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public SelectionFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SelectionFragment newInstance(int sectionNumber) {

        SelectionFragment fragment = new SelectionFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LOG_TAG, "onCreateView");
        final View rootView = inflater.inflate(R.layout.fragment_selection, container, false);

        final String section_number = getString(R.string.section_int_format, getArguments().getInt(ARG_SECTION_NUMBER));
        String label;

        switch(section_number) {
            case "0":
                label = "Status";
                break;
            case "1":
                label = "Connect";
                break;
            case "2":
                label = "Scan";
                break;
            case "3":
                label = "Video";
                break;
            case "4":
                label = "Audio";
                break;
            case "5":
                label = "Status";
                break;
            case "6":
                label = "Webcam";
                break;
            case "7":
                label = "Setting Fragment";
                break;
            default:
                label = section_number;

        }

        final Button button = (Button) rootView.findViewById(R.id.button_label);
        button.setText(label);
        button.bringToFront();
        button.setOnClickListener(new View.OnClickListener() {

            /*  Setting Onclick Listeners for all pages */
            final String section_number = getString(R.string.section_int_format, getArguments().getInt(ARG_SECTION_NUMBER));

            public void onClick(View v) {
                switch(section_number) {
                    case "0":
                        // show status
                        break;
                    case "1":
                        // manage connection
                        ConnectionFragment mConnectionFragment = new ConnectionFragment();
                        SelectionFragment.this.getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_content, mConnectionFragment, null)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case "2":
                        /*
                        ScanFragment mScanFragment = new ScanFragment();
                        SelectionFragment.this.getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_content, mScanFragment, null)
                                .addToBackStack(null)
                                .commit();
                                */
                        break;
                    case "3":
                        break;
                    case "4":
                        AudioRecordFragment mAudioRecordFragment = new AudioRecordFragment();
                        getChildFragmentManager().beginTransaction()
                                .replace(R.id.selection_page, mAudioRecordFragment, null)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case "5":
                        break;
                    case "6":
                        WebcamFragment mWebcamFragment = new WebcamFragment();
                        SelectionFragment.this.getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_content, mWebcamFragment, null)
                                .addToBackStack(null)
                                .commit();

                        break;

                    case "7":
                        SettingsFragment mSettingFragment = new SettingsFragment( );
                        SelectionFragment.this.getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_content, mSettingFragment)
                                .addToBackStack(null)
                                .commit();
                        break;
                    default:

                }



            }
        });

        return rootView;
    }
}


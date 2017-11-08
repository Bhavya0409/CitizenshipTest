package com.example.bhavyashah.citizenshiptest;

import android.app.Application;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    /**
     * the layout resource id for this fragment.
     *
     * @return int layout resource
     */
    protected abstract int getLayoutResourceId();

    /**
     * covers off common fragment initialization tasks such as creating the content view & binding the sub-views
     * sub classes should implement {@link #onViewCreated(View, Bundle)}
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(getLayoutResourceId(), container, false);
        ButterKnife.bind(BaseFragment.this, view);
        setRetainInstance(true);
        return view;
    }

    /**
     * Use this method when you are replacing existing fragments in an activity.
     *
     * @param containerId   -- the id of the current view container
     * @param activity      -- the activity hosting the current view
     * @param fragment      -- the fragment to replace the current view with.
     * @param transactionId -- the simple name of the new fragment. {@link Fragment class.getSimpleName()}
     */
    public static void replaceFragmentInActivity(int containerId, AppCompatActivity activity, Fragment fragment, String transactionId) {
        activity.getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(containerId, fragment, transactionId)
                .addToBackStack(null)
                .commit();
    }

    /**
     * Use this method when you are starting a new activity with the first fragment.
     *
     * @param containerId   -- the id of the current view container
     * @param activity      -- the activity hosting the current view
     * @param fragment      -- the fragment to replace the current view with.
     * @param transactionId -- the simple name of the new fragment. {@link Fragment class.getSimpleName()}
     */
    public static void replaceFragmentNotInBackstack(int containerId, AppCompatActivity activity, Fragment fragment, String transactionId) {
        activity.getSupportFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(containerId, fragment, transactionId)
                .commit();
    }
}

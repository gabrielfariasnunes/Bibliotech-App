package com.hope.bibliotech.ui.fragments;

import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.hope.bibliotech.R;

public class AccountFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle arg2) {
		return inflater.inflate(R.layout.fragment_account, parent, false);
	}
}

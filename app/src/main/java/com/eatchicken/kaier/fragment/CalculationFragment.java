package com.eatchicken.kaier.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.eatchicken.kaier.R;

public class CalculationFragment extends Fragment {
    private TextView title;
    private EditText result,outlook,amount;
    private Spinner products,box,agentLevel;
    private Button calculation,clear,addToCalculation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculation, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        title = view.findViewById(R.id.title);
        title.setText(R.string.calculation);
        result =view.findViewById(R.id.result);
        outlook = view.findViewById(R.id.out_look_text_view);
        amount = view.findViewById(R.id.amount_text);
        products = view.findViewById(R.id.spinner_product);
        box = view.findViewById(R.id.spinner_box);
        agentLevel = view.findViewById(R.id.spinner_agent_level);
        calculation = view.findViewById(R.id.btn_calculation);
        clear = view.findViewById(R.id.btn_clear);
        addToCalculation = view.findViewById(R.id.btn_add_to_calucation);
    }
}

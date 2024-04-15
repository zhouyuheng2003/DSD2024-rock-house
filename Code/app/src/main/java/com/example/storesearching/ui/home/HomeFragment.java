package com.example.storesearching.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.storesearching.databinding.FragmentHomeBinding;
import android.widget.SearchView;
import com.example.storesearching.R;
import android.util.TypedValue;
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        //搜索设置显示
        TextView textView_SearchMode = root.findViewById(R.id.textView_SearchMode); // 找到你的 TextView 组件
        textView_SearchMode.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        textView_SearchMode.setText("Search for stores");
        //搜索框及其设置
        SearchView searchView = root.findViewById(R.id.mainSearchView);
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // 当用户提交查询文本时调用
                // 在这里可以执行相应的搜索操作
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // 当用户输入或修改查询文本时调用
                // 在这里可以根据新的文本进行实时搜索或过滤操作
                return false;
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
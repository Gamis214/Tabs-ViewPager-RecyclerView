package gamis214.com.tabsexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FCouponVigentes extends Fragment {

    private RecyclerView recyclerView;

    public static FCouponVigentes newInstance() {
        Bundle args = new Bundle();
        FCouponVigentes fragment = new FCouponVigentes();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vigentes,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        //recyclerView.getLayoutManager().setAutoMeasureEnabled(true);
        recyclerView.setNestedScrollingEnabled(false);
        //recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(new CouponsAdapter());
    }

}

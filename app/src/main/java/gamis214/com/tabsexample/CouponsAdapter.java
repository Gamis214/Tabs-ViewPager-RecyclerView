package gamis214.com.tabsexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CouponsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coupon,parent,false);
        return new ItemHolderCoupons(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    public class ItemHolderCoupons extends RecyclerView.ViewHolder{
        public ItemHolderCoupons(View itemView) {
            super(itemView);
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }
}

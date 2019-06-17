package lk.ac.kln.listview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProductListAdapter extends RecyclerView.Adapter<ComputerViewHolder> {

    private String data[] = {"Computer one","Computer two","Computer three"};

    @Override
    public ComputerViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewtype) {
        LayoutInflater layoutInflater =  LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item,  viewGroup,false);
        ComputerViewHolder vh = new ComputerViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(ComputerViewHolder computerViewHolder, int viewtype) {
        computerViewHolder.title.setText(data[viewtype]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}

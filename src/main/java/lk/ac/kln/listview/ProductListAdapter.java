package lk.ac.kln.listview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ProductListAdapter extends RecyclerView.Adapter<ComputerViewHolder> {

    private String data[] = {"Computer one","Computer two","Computer three","Computer four","Computer five","Computer six"};

    @Override
    public ComputerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater =  LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item,  viewGroup,false);
        ComputerViewHolder vh = new ComputerViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ComputerViewHolder computerViewHolder,final int i) {
        computerViewHolder.title.setText(data[i]);
        computerViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),data[i],Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}

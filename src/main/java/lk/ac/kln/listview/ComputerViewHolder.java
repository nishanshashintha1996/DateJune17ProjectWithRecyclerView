package lk.ac.kln.listview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ComputerViewHolder extends RecyclerView.ViewHolder {
    RelativeLayout relativeLayout;
    ImageView image;
    TextView title,description,rate,price;

    public ComputerViewHolder(@NonNull View itemView) {
        super(itemView);
        relativeLayout = itemView.findViewById(R.id.layout);

    }
}

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
        image = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.title_view);
        description = itemView.findViewById(R.id.description_view);
        rate = itemView.findViewById(R.id.rate_view);
        price = itemView.findViewById(R.id.price_view);
    }
}

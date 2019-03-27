package ht.ganthier.didier.ecommerce.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ht.ganthier.didier.ecommerce.Interface.ItemClickListener;
import ht.ganthier.didier.ecommerce.R;

public class AdminOrdersViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView userName, userPhoneNumber, userTotalPrice, userDateTime, userShippingAddress;
    public Button ShowOrdersBtn;
    public ItemClickListener itemClickListener;

    public AdminOrdersViewHolder(View itemView)
    {
        super(itemView);

        userName = itemView.findViewById(R.id.order_user_name);
        userPhoneNumber = itemView.findViewById(R.id.order_phone_number);
        userTotalPrice = itemView.findViewById(R.id.order_total_price);
        userDateTime = itemView.findViewById(R.id.order_date_time);
        userShippingAddress = itemView.findViewById(R.id.order_address_city);
        ShowOrdersBtn = itemView.findViewById(R.id.show_all_products_btn);
    }

    @Override
    public void onClick(View view)
    {
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }

    public void setItemClickListener()
    {
        this.itemClickListener = itemClickListener;
    }
}

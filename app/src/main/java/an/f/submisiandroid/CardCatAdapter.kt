package an.f.submisiandroid

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardCatAdapter(val listCat: ArrayList<Cat>) : RecyclerView.Adapter<CardCatAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvIlmiah: TextView = itemView.findViewById(R.id.tv_item_ilmiah)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favourite)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_univ, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCat.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val(name, ilmiah, photo, deskripsi) = listCat[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvIlmiah.text = ilmiah

        val mContext = holder.itemView.context

        holder.btnFavorite.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favorite " + listCat[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, Detail::class.java)
            moveDetail.putExtra(Detail.EXTRA_ILMIAH, ilmiah)
            moveDetail.putExtra(Detail.EXTRA_NAME, name)
            moveDetail.putExtra(Detail.EXTRA_PHOTO, photo)
            moveDetail.putExtra(Detail.EXTRA_DESKRIPSI, deskripsi)
            mContext.startActivity(moveDetail)
        }

    }
}
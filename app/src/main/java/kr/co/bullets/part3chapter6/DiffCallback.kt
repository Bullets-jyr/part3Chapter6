package kr.co.bullets.part3chapter6

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import kr.co.bullets.part3chapter6.model.ListItem

class DiffCallback<T: ListItem> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.viewType == newItem.viewType && oldItem.getKey() == newItem.getKey()
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }
}
package kr.co.bullets.part3chapter6.viewholder

import kr.co.bullets.part3chapter6.ListAdapter
import kr.co.bullets.part3chapter6.databinding.ItemViewpagerBinding
import kr.co.bullets.part3chapter6.model.ListItem
import kr.co.bullets.part3chapter6.model.ViewPager

class ViewPagerViewHolder(
    binding: ItemViewpagerBinding,
) : BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}
package ru.netology.nerecipe.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.netology.nerecipe.databinding.CategoryItemBinding
import ru.netology.nerecipe.dto.Category

class CategoryNewRecipeAdapterAdapter(
    private val onInteractionCatListener: OnInteractionCatListener,
) : RecyclerView.Adapter<CategoryViewHolder>() {

    val listCategory = listOf(
        Category(1, "Eurasian", "Европейская"),
        Category(2, "Asian", "Азиатская"),
        Category(3, "Panasian", "Паназиатская"),
        Category(4, "Eastern", "Восточная"),
        Category(5, "American", "Американская"),
        Category(6, "Russian", "Русская"),
        Category(7, "Mediterranean", "Средиземноморская")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CategoryItemBinding.inflate(inflater, parent, false)
        return CategoryViewHolder(binding, onInteractionCatListener)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = listCategory[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int = listCategory.size
}

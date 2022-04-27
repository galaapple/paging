package com.example.android.codelabs.paging.ui

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.example.android.codelabs.paging.ui.ReposLoadStateViewHolder.Companion

/**
 * @author 李阳(liyang073)
 * @date 2022/04/27 21:28
 * @desc
 */
class ReposLoadStateAdapter(
  private val retry: () -> Unit
): LoadStateAdapter<ReposLoadStateViewHolder>() {
  override fun onBindViewHolder(holder: ReposLoadStateViewHolder, loadState: LoadState) {
    holder.bind(loadState)
  }

  override fun onCreateViewHolder(
    parent: ViewGroup,
    loadState: LoadState
  ): ReposLoadStateViewHolder {
    return ReposLoadStateViewHolder.create(parent, retry)
  }
}
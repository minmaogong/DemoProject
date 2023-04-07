// Generated code from Butter Knife. Do not modify!
package com.example.gsyvideoplayer.holder;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.gsyvideoplayer.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RecyclerItemViewHolder_ViewBinding implements Unbinder {
  private RecyclerItemViewHolder target;

  @UiThread
  public RecyclerItemViewHolder_ViewBinding(RecyclerItemViewHolder target, View source) {
    this.target = target;

    target.listItemContainer = Utils.findRequiredViewAsType(source, R.id.list_item_container, "field 'listItemContainer'", FrameLayout.class);
    target.listItemBtn = Utils.findRequiredViewAsType(source, R.id.list_item_btn, "field 'listItemBtn'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecyclerItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listItemContainer = null;
    target.listItemBtn = null;
  }
}

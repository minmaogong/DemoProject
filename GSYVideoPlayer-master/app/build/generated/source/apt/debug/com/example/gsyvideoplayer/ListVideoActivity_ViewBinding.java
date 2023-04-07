// Generated code from Butter Knife. Do not modify!
package com.example.gsyvideoplayer;

import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListVideoActivity_ViewBinding implements Unbinder {
  private ListVideoActivity target;

  @UiThread
  public ListVideoActivity_ViewBinding(ListVideoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListVideoActivity_ViewBinding(ListVideoActivity target, View source) {
    this.target = target;

    target.videoList = Utils.findRequiredViewAsType(source, R.id.video_list, "field 'videoList'", ListView.class);
    target.activityListVideo = Utils.findRequiredViewAsType(source, R.id.activity_list_video, "field 'activityListVideo'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListVideoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.videoList = null;
    target.activityListVideo = null;
  }
}

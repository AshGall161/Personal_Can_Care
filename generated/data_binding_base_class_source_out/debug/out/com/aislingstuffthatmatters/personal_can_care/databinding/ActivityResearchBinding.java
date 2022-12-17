// Generated by view binder compiler. Do not edit!
package com.aislingstuffthatmatters.personal_can_care.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aislingstuffthatmatters.personal_can_care.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAdditionalSvcs;

  @NonNull
  public final Button btnBooks;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnLibrary;

  @NonNull
  public final Button btnVideo;

  @NonNull
  public final EditText etBooks;

  @NonNull
  public final ImageView imgLibrary;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView txtLibrary;

  @NonNull
  public final TextView txtVBooks;

  private ActivityResearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAdditionalSvcs, @NonNull Button btnBooks, @NonNull Button btnHome,
      @NonNull Button btnLibrary, @NonNull Button btnVideo, @NonNull EditText etBooks,
      @NonNull ImageView imgLibrary, @NonNull ScrollView scrollView2,
      @NonNull ScrollView scrollView3, @NonNull TextView textView7, @NonNull TextView txtLibrary,
      @NonNull TextView txtVBooks) {
    this.rootView = rootView;
    this.btnAdditionalSvcs = btnAdditionalSvcs;
    this.btnBooks = btnBooks;
    this.btnHome = btnHome;
    this.btnLibrary = btnLibrary;
    this.btnVideo = btnVideo;
    this.etBooks = etBooks;
    this.imgLibrary = imgLibrary;
    this.scrollView2 = scrollView2;
    this.scrollView3 = scrollView3;
    this.textView7 = textView7;
    this.txtLibrary = txtLibrary;
    this.txtVBooks = txtVBooks;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_research, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAdditionalSvcs;
      Button btnAdditionalSvcs = ViewBindings.findChildViewById(rootView, id);
      if (btnAdditionalSvcs == null) {
        break missingId;
      }

      id = R.id.btnBooks;
      Button btnBooks = ViewBindings.findChildViewById(rootView, id);
      if (btnBooks == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnLibrary;
      Button btnLibrary = ViewBindings.findChildViewById(rootView, id);
      if (btnLibrary == null) {
        break missingId;
      }

      id = R.id.btnVideo;
      Button btnVideo = ViewBindings.findChildViewById(rootView, id);
      if (btnVideo == null) {
        break missingId;
      }

      id = R.id.et_Books;
      EditText etBooks = ViewBindings.findChildViewById(rootView, id);
      if (etBooks == null) {
        break missingId;
      }

      id = R.id.imgLibrary;
      ImageView imgLibrary = ViewBindings.findChildViewById(rootView, id);
      if (imgLibrary == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.txtLibrary;
      TextView txtLibrary = ViewBindings.findChildViewById(rootView, id);
      if (txtLibrary == null) {
        break missingId;
      }

      id = R.id.txtV_Books;
      TextView txtVBooks = ViewBindings.findChildViewById(rootView, id);
      if (txtVBooks == null) {
        break missingId;
      }

      return new ActivityResearchBinding((ConstraintLayout) rootView, btnAdditionalSvcs, btnBooks,
          btnHome, btnLibrary, btnVideo, etBooks, imgLibrary, scrollView2, scrollView3, textView7,
          txtLibrary, txtVBooks);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.aislingstuffthatmatters.personal_can_care.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aislingstuffthatmatters.personal_can_care.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResearchBookBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAdditionalSvcs;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final Button btnViewAll;

  @NonNull
  public final EditText etAuthorName;

  @NonNull
  public final EditText etBookLocation;

  @NonNull
  public final EditText etBookTitle;

  @NonNull
  public final TextView tvAuthorName;

  @NonNull
  public final TextView tvBookLocation;

  @NonNull
  public final TextView tvBookTitle;

  @NonNull
  public final TextView tvInfo;

  private ActivityResearchBookBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnAdditionalSvcs, @NonNull Button btnHome, @NonNull Button btnSubmit,
      @NonNull Button btnViewAll, @NonNull EditText etAuthorName, @NonNull EditText etBookLocation,
      @NonNull EditText etBookTitle, @NonNull TextView tvAuthorName,
      @NonNull TextView tvBookLocation, @NonNull TextView tvBookTitle, @NonNull TextView tvInfo) {
    this.rootView = rootView;
    this.btnAdditionalSvcs = btnAdditionalSvcs;
    this.btnHome = btnHome;
    this.btnSubmit = btnSubmit;
    this.btnViewAll = btnViewAll;
    this.etAuthorName = etAuthorName;
    this.etBookLocation = etBookLocation;
    this.etBookTitle = etBookTitle;
    this.tvAuthorName = tvAuthorName;
    this.tvBookLocation = tvBookLocation;
    this.tvBookTitle = tvBookTitle;
    this.tvInfo = tvInfo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResearchBookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResearchBookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_research_book, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResearchBookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAdditionalSvcs;
      Button btnAdditionalSvcs = ViewBindings.findChildViewById(rootView, id);
      if (btnAdditionalSvcs == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btn_submit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.btn_viewAll;
      Button btnViewAll = ViewBindings.findChildViewById(rootView, id);
      if (btnViewAll == null) {
        break missingId;
      }

      id = R.id.et_authorName;
      EditText etAuthorName = ViewBindings.findChildViewById(rootView, id);
      if (etAuthorName == null) {
        break missingId;
      }

      id = R.id.et_bookLocation;
      EditText etBookLocation = ViewBindings.findChildViewById(rootView, id);
      if (etBookLocation == null) {
        break missingId;
      }

      id = R.id.et_bookTitle;
      EditText etBookTitle = ViewBindings.findChildViewById(rootView, id);
      if (etBookTitle == null) {
        break missingId;
      }

      id = R.id.tv_authorName;
      TextView tvAuthorName = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthorName == null) {
        break missingId;
      }

      id = R.id.tv_bookLocation;
      TextView tvBookLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvBookLocation == null) {
        break missingId;
      }

      id = R.id.tv_bookTitle;
      TextView tvBookTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvBookTitle == null) {
        break missingId;
      }

      id = R.id.tv_Info;
      TextView tvInfo = ViewBindings.findChildViewById(rootView, id);
      if (tvInfo == null) {
        break missingId;
      }

      return new ActivityResearchBookBinding((LinearLayout) rootView, btnAdditionalSvcs, btnHome,
          btnSubmit, btnViewAll, etAuthorName, etBookLocation, etBookTitle, tvAuthorName,
          tvBookLocation, tvBookTitle, tvInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

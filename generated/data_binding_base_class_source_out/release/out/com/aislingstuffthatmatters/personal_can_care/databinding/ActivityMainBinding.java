// Generated by view binder compiler. Do not edit!
package com.aislingstuffthatmatters.personal_can_care.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aislingstuffthatmatters.personal_can_care.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnAdditionalSvcs;

  @NonNull
  public final Button btnNecessarySvcs;

  @NonNull
  public final Button btnShowQuote;

  @NonNull
  public final TextView tvClickNext;

  @NonNull
  public final TextView txtQuote;

  @NonNull
  public final TextView txtWelcome;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull Button btnAdditionalSvcs,
      @NonNull Button btnNecessarySvcs, @NonNull Button btnShowQuote, @NonNull TextView tvClickNext,
      @NonNull TextView txtQuote, @NonNull TextView txtWelcome) {
    this.rootView = rootView;
    this.btnAdditionalSvcs = btnAdditionalSvcs;
    this.btnNecessarySvcs = btnNecessarySvcs;
    this.btnShowQuote = btnShowQuote;
    this.tvClickNext = tvClickNext;
    this.txtQuote = txtQuote;
    this.txtWelcome = txtWelcome;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAdditionalSvcs;
      Button btnAdditionalSvcs = ViewBindings.findChildViewById(rootView, id);
      if (btnAdditionalSvcs == null) {
        break missingId;
      }

      id = R.id.btnNecessarySvcs;
      Button btnNecessarySvcs = ViewBindings.findChildViewById(rootView, id);
      if (btnNecessarySvcs == null) {
        break missingId;
      }

      id = R.id.btnShowQuote;
      Button btnShowQuote = ViewBindings.findChildViewById(rootView, id);
      if (btnShowQuote == null) {
        break missingId;
      }

      id = R.id.tv_clickNext;
      TextView tvClickNext = ViewBindings.findChildViewById(rootView, id);
      if (tvClickNext == null) {
        break missingId;
      }

      id = R.id.txtQuote;
      TextView txtQuote = ViewBindings.findChildViewById(rootView, id);
      if (txtQuote == null) {
        break missingId;
      }

      id = R.id.txtWelcome;
      TextView txtWelcome = ViewBindings.findChildViewById(rootView, id);
      if (txtWelcome == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, btnAdditionalSvcs, btnNecessarySvcs,
          btnShowQuote, tvClickNext, txtQuote, txtWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

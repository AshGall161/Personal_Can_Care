// Generated by view binder compiler. Do not edit!
package com.aislingstuffthatmatters.personal_can_care.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityAdditionalSvcsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAbout;

  @NonNull
  public final Button btnAccessories;

  @NonNull
  public final Button btnDiet;

  @NonNull
  public final Button btnHelp;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnNecessarySvcs;

  @NonNull
  public final Button btnResearch;

  @NonNull
  public final Button btnShops;

  @NonNull
  public final Button btnWellness;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView txtAdditionalSvcs;

  private ActivityAdditionalSvcsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAbout, @NonNull Button btnAccessories, @NonNull Button btnDiet,
      @NonNull Button btnHelp, @NonNull Button btnHome, @NonNull Button btnNecessarySvcs,
      @NonNull Button btnResearch, @NonNull Button btnShops, @NonNull Button btnWellness,
      @NonNull ScrollView scrollView2, @NonNull TextView txtAdditionalSvcs) {
    this.rootView = rootView;
    this.btnAbout = btnAbout;
    this.btnAccessories = btnAccessories;
    this.btnDiet = btnDiet;
    this.btnHelp = btnHelp;
    this.btnHome = btnHome;
    this.btnNecessarySvcs = btnNecessarySvcs;
    this.btnResearch = btnResearch;
    this.btnShops = btnShops;
    this.btnWellness = btnWellness;
    this.scrollView2 = scrollView2;
    this.txtAdditionalSvcs = txtAdditionalSvcs;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdditionalSvcsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdditionalSvcsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_additional_svcs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdditionalSvcsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAbout;
      Button btnAbout = ViewBindings.findChildViewById(rootView, id);
      if (btnAbout == null) {
        break missingId;
      }

      id = R.id.btnAccessories;
      Button btnAccessories = ViewBindings.findChildViewById(rootView, id);
      if (btnAccessories == null) {
        break missingId;
      }

      id = R.id.btnDiet;
      Button btnDiet = ViewBindings.findChildViewById(rootView, id);
      if (btnDiet == null) {
        break missingId;
      }

      id = R.id.btnHelp;
      Button btnHelp = ViewBindings.findChildViewById(rootView, id);
      if (btnHelp == null) {
        break missingId;
      }

      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnNecessarySvcs;
      Button btnNecessarySvcs = ViewBindings.findChildViewById(rootView, id);
      if (btnNecessarySvcs == null) {
        break missingId;
      }

      id = R.id.btnResearch;
      Button btnResearch = ViewBindings.findChildViewById(rootView, id);
      if (btnResearch == null) {
        break missingId;
      }

      id = R.id.btnShops;
      Button btnShops = ViewBindings.findChildViewById(rootView, id);
      if (btnShops == null) {
        break missingId;
      }

      id = R.id.btnWellness;
      Button btnWellness = ViewBindings.findChildViewById(rootView, id);
      if (btnWellness == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.txtAdditionalSvcs;
      TextView txtAdditionalSvcs = ViewBindings.findChildViewById(rootView, id);
      if (txtAdditionalSvcs == null) {
        break missingId;
      }

      return new ActivityAdditionalSvcsBinding((ConstraintLayout) rootView, btnAbout,
          btnAccessories, btnDiet, btnHelp, btnHome, btnNecessarySvcs, btnResearch, btnShops,
          btnWellness, scrollView2, txtAdditionalSvcs);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
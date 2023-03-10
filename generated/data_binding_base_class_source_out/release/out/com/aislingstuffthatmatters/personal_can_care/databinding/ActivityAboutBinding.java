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

public final class ActivityAboutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAdditionalSvcs;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView txtAboutPage1;

  @NonNull
  public final TextView txtAboutPage2;

  @NonNull
  public final TextView txtAboutPage3;

  @NonNull
  public final TextView txtAboutPage4;

  @NonNull
  public final TextView txtAboutPage5;

  @NonNull
  public final TextView txtAboutPage6;

  @NonNull
  public final TextView txtAboutThanks;

  @NonNull
  public final TextView txtAdditionalSvcs;

  @NonNull
  public final TextView txtBlank;

  @NonNull
  public final TextView txtBlank2;

  @NonNull
  public final TextView txtBlank3;

  @NonNull
  public final TextView txtBlank4;

  @NonNull
  public final TextView txtBlank5;

  @NonNull
  public final TextView txtParagraph1;

  @NonNull
  public final TextView txtParagraph2;

  @NonNull
  public final TextView txtParagraph3;

  @NonNull
  public final TextView txtParagraph4;

  private ActivityAboutBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAdditionalSvcs, @NonNull Button btnHome, @NonNull ScrollView scrollView2,
      @NonNull TextView txtAboutPage1, @NonNull TextView txtAboutPage2,
      @NonNull TextView txtAboutPage3, @NonNull TextView txtAboutPage4,
      @NonNull TextView txtAboutPage5, @NonNull TextView txtAboutPage6,
      @NonNull TextView txtAboutThanks, @NonNull TextView txtAdditionalSvcs,
      @NonNull TextView txtBlank, @NonNull TextView txtBlank2, @NonNull TextView txtBlank3,
      @NonNull TextView txtBlank4, @NonNull TextView txtBlank5, @NonNull TextView txtParagraph1,
      @NonNull TextView txtParagraph2, @NonNull TextView txtParagraph3,
      @NonNull TextView txtParagraph4) {
    this.rootView = rootView;
    this.btnAdditionalSvcs = btnAdditionalSvcs;
    this.btnHome = btnHome;
    this.scrollView2 = scrollView2;
    this.txtAboutPage1 = txtAboutPage1;
    this.txtAboutPage2 = txtAboutPage2;
    this.txtAboutPage3 = txtAboutPage3;
    this.txtAboutPage4 = txtAboutPage4;
    this.txtAboutPage5 = txtAboutPage5;
    this.txtAboutPage6 = txtAboutPage6;
    this.txtAboutThanks = txtAboutThanks;
    this.txtAdditionalSvcs = txtAdditionalSvcs;
    this.txtBlank = txtBlank;
    this.txtBlank2 = txtBlank2;
    this.txtBlank3 = txtBlank3;
    this.txtBlank4 = txtBlank4;
    this.txtBlank5 = txtBlank5;
    this.txtParagraph1 = txtParagraph1;
    this.txtParagraph2 = txtParagraph2;
    this.txtParagraph3 = txtParagraph3;
    this.txtParagraph4 = txtParagraph4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutBinding bind(@NonNull View rootView) {
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

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Page1;
      TextView txtAboutPage1 = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutPage1 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Page2;
      TextView txtAboutPage2 = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutPage2 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Page3;
      TextView txtAboutPage3 = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutPage3 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Page4;
      TextView txtAboutPage4 = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutPage4 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Page5;
      TextView txtAboutPage5 = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutPage5 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Page6;
      TextView txtAboutPage6 = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutPage6 == null) {
        break missingId;
      }

      id = R.id.txtAbout_Thanks;
      TextView txtAboutThanks = ViewBindings.findChildViewById(rootView, id);
      if (txtAboutThanks == null) {
        break missingId;
      }

      id = R.id.txtAdditional_Svcs;
      TextView txtAdditionalSvcs = ViewBindings.findChildViewById(rootView, id);
      if (txtAdditionalSvcs == null) {
        break missingId;
      }

      id = R.id.txtBlank;
      TextView txtBlank = ViewBindings.findChildViewById(rootView, id);
      if (txtBlank == null) {
        break missingId;
      }

      id = R.id.txtBlank2;
      TextView txtBlank2 = ViewBindings.findChildViewById(rootView, id);
      if (txtBlank2 == null) {
        break missingId;
      }

      id = R.id.txtBlank3;
      TextView txtBlank3 = ViewBindings.findChildViewById(rootView, id);
      if (txtBlank3 == null) {
        break missingId;
      }

      id = R.id.txtBlank4;
      TextView txtBlank4 = ViewBindings.findChildViewById(rootView, id);
      if (txtBlank4 == null) {
        break missingId;
      }

      id = R.id.txtBlank5;
      TextView txtBlank5 = ViewBindings.findChildViewById(rootView, id);
      if (txtBlank5 == null) {
        break missingId;
      }

      id = R.id.txtParagraph1;
      TextView txtParagraph1 = ViewBindings.findChildViewById(rootView, id);
      if (txtParagraph1 == null) {
        break missingId;
      }

      id = R.id.txtParagraph2;
      TextView txtParagraph2 = ViewBindings.findChildViewById(rootView, id);
      if (txtParagraph2 == null) {
        break missingId;
      }

      id = R.id.txtParagraph3;
      TextView txtParagraph3 = ViewBindings.findChildViewById(rootView, id);
      if (txtParagraph3 == null) {
        break missingId;
      }

      id = R.id.txtParagraph4;
      TextView txtParagraph4 = ViewBindings.findChildViewById(rootView, id);
      if (txtParagraph4 == null) {
        break missingId;
      }

      return new ActivityAboutBinding((ConstraintLayout) rootView, btnAdditionalSvcs, btnHome,
          scrollView2, txtAboutPage1, txtAboutPage2, txtAboutPage3, txtAboutPage4, txtAboutPage5,
          txtAboutPage6, txtAboutThanks, txtAdditionalSvcs, txtBlank, txtBlank2, txtBlank3,
          txtBlank4, txtBlank5, txtParagraph1, txtParagraph2, txtParagraph3, txtParagraph4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

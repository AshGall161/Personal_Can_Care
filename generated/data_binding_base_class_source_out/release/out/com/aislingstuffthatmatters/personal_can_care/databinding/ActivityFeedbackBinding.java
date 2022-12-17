// Generated by view binder compiler. Do not edit!
package com.aislingstuffthatmatters.personal_can_care.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityFeedbackBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnHome;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etFeedback;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etSubject;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvWhat;

  @NonNull
  public final TextView tvWhat2;

  private ActivityFeedbackBinding(@NonNull RelativeLayout rootView, @NonNull Button btnHome,
      @NonNull Button btnSubmit, @NonNull EditText etEmail, @NonNull EditText etFeedback,
      @NonNull EditText etName, @NonNull EditText etSubject, @NonNull TextView tvTitle,
      @NonNull TextView tvWhat, @NonNull TextView tvWhat2) {
    this.rootView = rootView;
    this.btnHome = btnHome;
    this.btnSubmit = btnSubmit;
    this.etEmail = etEmail;
    this.etFeedback = etFeedback;
    this.etName = etName;
    this.etSubject = etSubject;
    this.tvTitle = tvTitle;
    this.tvWhat = tvWhat;
    this.tvWhat2 = tvWhat2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnHome;
      Button btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnSubmit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.et_Email;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_Feedback;
      EditText etFeedback = ViewBindings.findChildViewById(rootView, id);
      if (etFeedback == null) {
        break missingId;
      }

      id = R.id.et_Name;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.et_Subject;
      EditText etSubject = ViewBindings.findChildViewById(rootView, id);
      if (etSubject == null) {
        break missingId;
      }

      id = R.id.tv_Title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tv_What;
      TextView tvWhat = ViewBindings.findChildViewById(rootView, id);
      if (tvWhat == null) {
        break missingId;
      }

      id = R.id.tv_What2;
      TextView tvWhat2 = ViewBindings.findChildViewById(rootView, id);
      if (tvWhat2 == null) {
        break missingId;
      }

      return new ActivityFeedbackBinding((RelativeLayout) rootView, btnHome, btnSubmit, etEmail,
          etFeedback, etName, etSubject, tvTitle, tvWhat, tvWhat2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

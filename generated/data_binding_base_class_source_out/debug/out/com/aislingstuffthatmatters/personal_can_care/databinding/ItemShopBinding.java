// Generated by view binder compiler. Do not edit!
package com.aislingstuffthatmatters.personal_can_care.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aislingstuffthatmatters.personal_can_care.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemShopBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView shopDescriptionTxt;

  @NonNull
  public final TextView shopLocationTxt;

  @NonNull
  public final TextView shopNameTxt;

  private ItemShopBinding(@NonNull CardView rootView, @NonNull TextView shopDescriptionTxt,
      @NonNull TextView shopLocationTxt, @NonNull TextView shopNameTxt) {
    this.rootView = rootView;
    this.shopDescriptionTxt = shopDescriptionTxt;
    this.shopLocationTxt = shopLocationTxt;
    this.shopNameTxt = shopNameTxt;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemShopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_shop, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemShopBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.shopDescription_txt;
      TextView shopDescriptionTxt = ViewBindings.findChildViewById(rootView, id);
      if (shopDescriptionTxt == null) {
        break missingId;
      }

      id = R.id.shopLocation_txt;
      TextView shopLocationTxt = ViewBindings.findChildViewById(rootView, id);
      if (shopLocationTxt == null) {
        break missingId;
      }

      id = R.id.shopName_txt;
      TextView shopNameTxt = ViewBindings.findChildViewById(rootView, id);
      if (shopNameTxt == null) {
        break missingId;
      }

      return new ItemShopBinding((CardView) rootView, shopDescriptionTxt, shopLocationTxt,
          shopNameTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

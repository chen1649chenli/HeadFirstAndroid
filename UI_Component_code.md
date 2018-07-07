## Text view
##### Define it in XML:
```
<TextView
  android:id="@+id/text_view" android:layout_width="wrap_content" android:layout_height="wrap_content"
  android:textSize="16sp"
  android:text="@string/text" />
```
##### Use it in activity Java code:
```
TextView textView = (TextView) findViewById(R.id.text_view);
textView.setText("Some other String");
```

## Editable text view
##### Define it in XML:
```
<EditText
  android:id="@+id/edit_text"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:inputType="textCapSentences|textAutoCorrect"
  android:hint="@string/edit_text" />
```
##### Use it in activity Java code:
```
EditText editText = (EditText) findViewById(R.id.edit_text);
String text = editText.getText().toString();
```
## Button
##### Define it in XML:
```
<Button
  android:id="@+id/button"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/button_text"
  android:onClick="onButtonClicked" />
```
##### Use it in activity Java code:
```
/** Called when the button is clicked */ public void onButtonClicked(View view) {
  // Do something in response to button click
}
```

## Toggle button
##### Define it in XML:
```
<ToggleButton
  android:id="@+id/toggle_button"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:textOn="@string/on"
  android:textOff="@string/off"
  android:onClick="onToggleButtonClicked" />
```
##### Use it in activity Java code:
```
/** Called when the toggle button is clicked */
public void onToggleButtonClicked(View view) {
  // Get the state of the toggle button.
  boolean on = ((ToggleButton) view).isChecked();
  if (on) {
    // On
  } else {
    // Off
  }
}
```

## Switch
##### Define it in XML:
```
<Switch
  android:id="@+id/switch_view"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:textOn="@string/on"
  android:textOff="@string/off"
  android:onClick="onSwitchClicked"/>
```
##### Use it in activity Java code:
```
/** Called when the switch is clicked */
public void onSwitchClicked(View view) {
  // Is the switch on?
  boolean on = ((Switch) view).isChecked();
  if (on) {
    // On
    } else {
      // Off
    }
  }
```
## Checkboxes
##### Define it in XML:
```
<CheckBox android:id="@+id/checkbox_milk"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/milk"
  android:onClick="onCheckboxClicked"/>
<CheckBox android:id="@+id/checkbox_sugar"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/sugar"
  android:onClick="onCheckboxClicked"/>
```
##### Use it in activity Java code:
```
public void onCheckboxClicked(View view) {
  // Has the checkbox that was clicked been checked?
  boolean checked = ((CheckBox) view).isChecked();

  // Retrieve which checkbox was clicked
  switch(view.getId()) {
    case R.id.checkbox_milk:
    if (checked)
      // Milky coffee
    else
      // Black as the midnight sky on a moonless night break;
    case R.id.checkbox_sugar:
      if (checked)
        //Sweet
      else
        //Keep it bitter
      break;
    }
  }
```

## Radio buttons
##### Define it in XML:
```
<RadioGroup android:id="@+id/radio_group"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:orientation="vertical">
  <RadioButton android:id="@+id/radio_cavemen"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/cavemen"
    android:onClick="onRadioButtonClicked" />
  <RadioButton android:id="@+id/radio_astronauts"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/astronauts"
    android:onClick="onRadioButtonClicked" />
</RadioGroup>
```
##### Use it in activity Java code:
```
public void onRadioButtonClicked(View view) {
  RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
  int id = radioGroup.getCheckedRadioButtonId();
  switch(id) {
    case R.id.radio_cavemen: // Cavemen win
      break;
    case R.id.radio_astronauts:
      // Astronauts win
      break;
  }
}
```

## Spinner
##### Define it in XML:
```
<Spinner
  android:id="@+id/spinner"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:entries="@array/spinner_values" />
```
Add an array of Strings to strings.xml like this
```
<string-array name="spinner_values">
  <item>light</item>
  <item>amber</item>
  <item>brown</item>
  <item>dark</item>
</string-array>
```

##### Use it in activity Java code:
```
Spinner spinner = (Spinner) findViewById(R.id.spinner);
String string = String.valueOf(spinner.getSelectedItem());
```
## Image view
##### Define it in XML:
```
<ImageView
  android:layout_width="200dp"
  android:layout_height="100dp"
  android:src="@drawable/starbuzz_logo"
  android:contentDescription="@string/starbuzz_logo" />
```

##### Use it in activity Java code:
```
ImageView photo = (ImageView)findViewById(R.id.photo);
int image = R.drawable.starbuzz_logo;
String description = "This is the logo";
photo.setImageResource(image);
photo.setContentDescription(description);
```

## Image button
##### Define it in XML:
```
<ImageButton
  android:id="@+id/button"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:src="@drawable/button_icon"
  android:onClick="onButtonClicked" />
```

##### Use it in activity Java code:
```
/** Called when the image button is clicked */
public void onButtonClicked(View view) {
// Do something in response to button click }
```

## Scroll view
##### Define it in XML:
```
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:tools="http://schemas.android.com/tools"
  android:layout_width="match_parent"
  android:layout_height="match_parent"
  tools:context="com.hfad.views.MainActivity" >
  <LinearLayout android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="16dp"
    android:paddingLeft="16dp"
    android:paddingRight="16dp"
    android:paddingTop="16dp"
    android:orientation="vertical" >
    ...
    </LinearLayout>
</ScrollView>
```
## Toast
##### Use it in activity Java code:
```
CharSequence text = "Hello, I'm a Toast!";
int duration = Toast.LENGTH_SHORT;
Toast toast = Toast.makeText(this, text, duration);
toast.show();
```

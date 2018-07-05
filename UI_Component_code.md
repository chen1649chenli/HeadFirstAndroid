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

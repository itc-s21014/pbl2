package com.example.pbl

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.example.pbl.databinding.ActivityTimeSettingBinding
import java.lang.IllegalStateException
import java.util.Calendar

class MyDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val cal = Calendar.getInstance()
        val dialog = activity?.let {
            TimePickerDialog(
                it,
                { view, hourOfDay, minute ->
                    val txtDate = it.findViewById<EditText>(R.id.txtTime)
                    txtDate.setText("${hourOfDay}:${minute}")
                },
                cal[Calendar.HOUR_OF_DAY],
                cal[Calendar.MINUTE],
                true
            )
        }
        return dialog ?: throw IllegalStateException("Activity is null.")
    }
}
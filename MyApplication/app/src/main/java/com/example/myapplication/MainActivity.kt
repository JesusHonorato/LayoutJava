package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Toast

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    fun onCreate(savedInstanceState: Bundle?, protected: Any) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show();
            // La actividad está a punto de hacerse visible.
        }
        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();
            // La actividad se ha vuelto visible (ahora se "reanuda").
        }
        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
            // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
        }
        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(this, "OnStop", Toast.LENGTH_LONG).show();
            // La actividad ya no es visible (ahora está "detenida")
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "OnDestroy", Toast.LENGTH_LONG).show();
            // La actividad está a punto de ser destruida.

    }
}

    private fun onResume(function: () -> Unit) {

    }

    private fun onStart(any: Any) {

    }

    private fun onPause(any: Any) {

    }

    private fun onStop(any: Any) {

    }

    private fun onDestroy(any: Any) {

    }

private infix fun Any.void(onStop: Unit) {

}

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

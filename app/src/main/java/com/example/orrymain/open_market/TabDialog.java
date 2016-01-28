package com.example.orrymain.open_market;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Arnold on 27/01/16.
 */
public class TabDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       // return super.onCreateDialog(savedInstanceState);
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        Bundle args = getArguments();
        int position = args.getInt("position");

        if (position == 0) {

            builder.setIcon(R.drawable.milian)
                    .setTitle("Christina Milian")
                    .setMessage("Dip It Low")
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }
        /*
        if (position == 1)
        {
            builder.setIcon(R.drawable.kenji_fukuoka)
                    .setTitle(R.string.fukuoka_title)
                    .setMessage(R.string.Kenji_fukuoka)
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

        }

        if (position == 2)
        {
            builder.setIcon(R.drawable.philbert_jean)
                    .setTitle(R.string.philbert_title)
                    .setMessage(R.string.philbert)
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }

        if (position == 3)
        {
            builder.setIcon(R.drawable.changarampatt_manoj)
                    .setTitle(R.string.Monoj_title)
                    .setMessage(R.string.Monoj_Changarampatt)
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

        }
        */
        return builder.create();
    }

}

package com.example.android.takehomeassignment07_katieb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//package com.example.android.takehomeassignment07_katieb;
//
//import android.graphics.Bitmap;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.StorageMetadata;
//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;
//
//import java.io.ByteArrayOutputStream;
//import java.util.UUID;
//
//public class MainActivity extends AppCompatActivity {
//
//    private FirebaseStorage storage = FirebaseStorage.getInstance();
//    private EditText input;
//    private TextView output;
//    private View finalView;
//    private ProgressBar progressBar;
//    private Button uploadButton;
//    private TextView downloadUrl;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        input = (EditText) findViewById(R.id.input_text);
//        output = (TextView) findViewById(R.id.output_text);
//        finalView = (View) findViewById(R.id.final_view);
//        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
//        uploadButton = (Button) findViewById(R.id.upload_button);
//        downloadUrl = (TextView) findViewById(R.id.download_url);
//
//    }
//
//    private class UploadOnClickListener implements View.OnClickListener
//    {
//        @Override
//        public void onClick (View view)
//        {
//
//            String finalText = input.getText().toString();
//            output.setText(finalText);
//
//            finalView.setDrawingCacheEnabled(true);
//            finalView.buildDrawingCache();
//            Bitmap bitmap = finalView.getDrawingCache();
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
//            finalView.setDrawingCacheEnabled(false);
//            byte[] data = baos.toByteArray();
//
//            String path = "firememes/" + UUID.randomUUID() + ".png";
//            StorageReference firememeRef = storage.getReference(path);
//
//            StorageMetadata metadata = new StorageMetadata.Builder()
//                    .setCustomMetadata("text", output.getText().toString())
//                    .build();
//
//            progressBar.setVisibility(View.VISIBLE);
//            uploadButton.setEnabled(false);
//
//            UploadTask uploadTask = firememeRef.putBytes(data, metadata);
//            uploadTask.addOnSuccessListener(MainActivity.this, new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                @Override
//                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                    progressBar.setVisibility(View.GONE);
//                    uploadButton.setEnabled(true);
//
//                    Uri url = taskSnapshot.getDownloadUrl();
//                    downloadUrl.setText(url.toString());
//                    downloadUrl.setVisibility(View.VISIBLE);
//                }
//            });
//
//
//        }
//    }


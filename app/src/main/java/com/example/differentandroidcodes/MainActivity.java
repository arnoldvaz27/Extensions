package com.example.differentandroidcodes;

import android.Manifest;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    static String fileEnd = "";
    private TextView selected,text,na;
    private ImageView empty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.color3));
        setContentView(R.layout.activity_main);
        runtimePermission();

    }

    private void runtimePermission() {
        Dexter.withContext(MainActivity.this).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE).withListener(new PermissionListener() {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                displayPdf();
            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                Toast.makeText(MainActivity.this, "Permission is required to display all the pdf", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();

    }

    public ArrayList<File> findPdf(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        File[] files = file.listFiles();

        if(files == null){
            recyclerView.setVisibility(View.GONE);
            text.setVisibility(View.VISIBLE);
            empty.setVisibility(View.VISIBLE);
        }
        else{
            for (File singleFile : files) {
                recyclerView.setVisibility(View.VISIBLE);
                empty.setVisibility(View.GONE);
                text.setVisibility(View.GONE);
                if (singleFile.isDirectory()) {
                    arrayList.addAll(findPdf(singleFile));
                } else {
                    if (singleFile.getName().endsWith("."+fileEnd.toLowerCase())) {
                        arrayList.add(singleFile);
                    }
                }
            }
        }
        return arrayList;
    }

    private void displayPdf() {
        text = findViewById(R.id.text);
        empty = findViewById(R.id.empty);
        na = findViewById(R.id.NA);
        selected = findViewById(R.id.selected);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<File> pdfList = new ArrayList<>(findPdf(Environment.getExternalStorageDirectory()));
        PdfAdapter pdfAdapter = new PdfAdapter(this, pdfList);
        recyclerView.setAdapter(pdfAdapter);
//        horizontalScrollView = findViewById(R.id.horizontalView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_extension,menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.jpg){
            fileEnd = "JPG";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JPG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.jpeg){
            fileEnd = "JPEG";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JPEG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.png){
            fileEnd = "PNG";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PNG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.svg){
            fileEnd = "SVG";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("SVG files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.gif){
            fileEnd = "GIF";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("GIF files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.mp4){
            fileEnd = "MP4";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("MP4 files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.mp3){
            fileEnd = "MP3";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("MP3 files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.pdf){
            fileEnd = "PDF";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PDF files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.doc){
            fileEnd = "DOCX";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("DOC files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.ppt){
            fileEnd = "PPTX";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PPT files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.xls){
            fileEnd = "XLSX";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("XLS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.csv){
            fileEnd = "CSV";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("CSV files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.txt){
            fileEnd = "TXT";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("TXT files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.zip){
            fileEnd = "ZIP";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("ZIP files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.tar){
            fileEnd = "TAR";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("TAR files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.rar){
            fileEnd = "RAR";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("RAR files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.ai){
            fileEnd = "AI";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AI files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.ps){
            fileEnd = "PS";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("PS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.aac){
            fileEnd = "AAC";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("AAC files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.html){
            fileEnd = "HTML";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("HTML files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.css){
            fileEnd = "CSS";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("CSS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.js){
            fileEnd = "JS";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JS files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.java){
            fileEnd = "JAVA";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JAVA files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.json){
            fileEnd = "JSON";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("JSON files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.exe){
            fileEnd = "EXE";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText("EXE files are displayed");
            na.setVisibility(View.GONE);
        }
        if(item.getItemId() == R.id.noExtFile){
            fileEnd = "";
            displayPdf();
            selected.setVisibility(View.VISIBLE);
            selected.setText(".No Extension files are displayed");
            na.setVisibility(View.GONE);
        }
        if (item.getItemId() == R.id.info) {
            Info();
        }
        return true;
    }

    private void Info() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialog);
        builder.setTitle("Important Note");
        builder.setCancelable(false);

        final TextView groupNameField = new TextView(MainActivity.this);
        groupNameField.setText("1) This application only displays files from your internal storage, this application does not displays file from other sources like Memory Card, USB Memory Card, USB Pen Drive or External USB Hard disk \n\n2) If there are no files to display under a particular section than the full screen will be displayed as blank screen. ");
        groupNameField.setPadding(20,30,20,20);
        groupNameField.setTextColor(Color.BLACK);

        groupNameField.setBackgroundColor(Color.WHITE);
        builder.setView(groupNameField);

        builder.setPositiveButton("Got it", (dialogInterface, i) -> dialogInterface.cancel());

        builder.show();
    }

}